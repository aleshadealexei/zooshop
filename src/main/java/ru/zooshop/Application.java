package ru.zooshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.zooshop.domain.FarmAnimal;

/* TODO:
    1. Добавить скрипт на создание бд (добавить FlyWay для миграции)
    2. Update, Delete для animals
    3. Проверить создание дочерних Animmals (попытки в полиформЫзм с ОРМ)

    На очень долго:
    1. Сделать красивую АПИ
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
