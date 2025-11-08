package dev.gustavo.Fridge.repository;

import dev.gustavo.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}

