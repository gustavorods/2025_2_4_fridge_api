package dev.gustavo.Fridge.controller;

import dev.gustavo.Fridge.model.Food;
import dev.gustavo.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    // Dependency injection
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food Create(@RequestBody Food food) {return foodService.save(food);}

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id){foodService.delete(id);}
}
