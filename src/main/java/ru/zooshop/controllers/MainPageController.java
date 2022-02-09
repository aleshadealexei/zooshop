package ru.zooshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.zooshop.domain.Animal;
import ru.zooshop.repos.AnimalRepo;
import ru.zooshop.services.AnimalTypeService;
import ru.zooshop.services.FoodTypeEntityService;
import ru.zooshop.types.FoodType;

@Controller
public class MainPageController {

    @Autowired
    private AnimalTypeService animalTypeService;

    @Autowired
    private AnimalRepo animalRepo;

    @Autowired
    private FoodTypeEntityService foodTypeService;

    @GetMapping
    public String getMainPage(Model model) {
        model.addAttribute("animal", new Animal());
        model.addAttribute("animalTypes", animalTypeService.getAll());
        model.addAttribute("foodTypes", foodTypeService.getAll());
        return "main";
    }

    @PostMapping("/saveAnimals")
    public String saveAnimal(Animal animal) {
        animalRepo.save(animal);
        return "main";
    }

    @GetMapping("/getAnimalsList")
    public String getMainPage2(Model model) {

        for (var a :
                animalRepo.findAll()) {
            System.out.println(a.getName());
        }
        return "redirect:/";
    }
}
