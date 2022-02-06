package ru.zooshop.conrollers;

import org.springframework.web.bind.annotation.*;
import ru.zooshop.DTO.InputDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/")
public class MainController {
    private ArrayList<HashMap<String, String>> animals = new ArrayList<>() {{
        add(new HashMap<>() {{
            put("4","Animal1");
            put("5","Animal2");
            put("6","Animal3");
        }});
    }};

    @GetMapping
    public ArrayList<HashMap<String, String>> getTest( ) {
        return animals;
    }

    @GetMapping(value = "/{id}")
    public String getElement(@PathVariable  String id,
                             HttpServletResponse response) throws IOException {
        for (var map :
                animals) {
            var set = map.keySet();
            if (map.containsKey(id)) {
                return map.get(id);
            }
        }
        response.sendError(1);
        return "null";
    }

    @PostMapping(value = "/post")
    public void getElement(HttpServletResponse response,
                           @RequestBody InputDTO mapa) throws IOException {
        animals.add(new HashMap<>() {{
            put(mapa.getId(), mapa.getValue());
        }});
        response.sendRedirect("/");
    }
}
