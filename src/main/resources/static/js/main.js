var messageApi = Vue.resource('/animals{/id}');

Vue.component('animals-row', {
    props: ['animal'],
    template: '<tr>' +
        '<td>{{animal.id}}</td>' +
        '<td>{{animal.text}}</td>' +
        '</tr>'
});

Vue.component('animals-table', {
    props: ['animals'],
    template: '<table >' +
        '<tr>' +
        '<th>id</th>' +
        '<th>text</th>' +
        '</tr>' +
        '<animals-row v-for="animal in animals" v-bind:key="animal.id" :animal="animal"/>' +
        '</table>',
    created: function () {
        messageApi.get().then(result =>
            result.json().then(data => {
                    data.forEach(obj =>
                        this.animals.push(obj)
                    )
                }
            )
        )
    }
});

var app = new Vue({
    el: '#app',
    template: '<animals-table :animals = "animals"/>',
    data: {
        animals: []
    }
});