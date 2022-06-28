package kz.kalizhanov.objects;

import kz.kalizhanov.abstracts.Entity;
import kz.kalizhanov.dto.AnimalDTO;
import kz.kalizhanov.interfaces.Actions;

import java.util.HashMap;
import java.util.Map;

public class Dog extends Entity implements Actions {

    @Override
    public String say(String someWords) {
        return someWords + "GAF!";
    }

    @Override
    public String drink(String drinking) {
        return "Drink " + drinking;
    }

    @Override
    public Map<String, String> characteristics(AnimalDTO dto) {
        Map<String, String> response = new HashMap<>();
        response.put("Имя", dto.getName());
        response.put("Порода", dto.getBreed());
        response.put("Возраст", dto.getAge());
        response.put("Рост", dto.getWeight());
        return response;
    }
}
