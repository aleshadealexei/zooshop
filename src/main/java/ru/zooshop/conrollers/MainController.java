package ru.zooshop.conrollers;

import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.*;
import ru.zooshop.DTO.InputDTO;
import ru.zooshop.DTO.OutputDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animals")
public class MainController {
    private List<OutputDTO> animals = new ArrayList<>() {{
        add(new OutputDTO("1","Animal1"));
        add(new OutputDTO("2","Animal2"));
        add(new OutputDTO("3","Animal3"));
    }};

    @GetMapping
    public List<OutputDTO> getAll() {
        return animals;
    }

    @GetMapping("{id}")
    public OutputDTO getOne(@PathVariable String id) {
        return getAnimal(id);
    }

    private OutputDTO getAnimal(@PathVariable String id) {
        return animals.stream()
                .filter(animal -> animal.getId().equals(id))
                .findFirst().get();
    }

    @PostMapping
    public void getElement(HttpServletResponse response,
                           @RequestBody OutputDTO mapa) throws IOException {
        animals.add(mapa);
        response.sendRedirect("/");
    }
}
