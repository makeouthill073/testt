package kz.kalizhanov.objects;

import kz.kalizhanov.abstracts.Human;
import kz.kalizhanov.dto.PersonDTO;
import kz.kalizhanov.interfaces.Actions;

import java.util.HashMap;
import java.util.Map;

public class Student extends Human implements Actions {

    @Override
    public String say(String someWords) {
        return someWords + "...";
    }

    @Override
    public String drink(String drinking) {
        return "Drink " + drinking;
    }

    @Override
    public Map<String, String> characteristics(PersonDTO dto) {
        Map<String, String> response = new HashMap<>();
        response.put("Имя", dto.getFirstName());
        response.put("Фамилия", dto.getLastName());
        response.put("Возраст", dto.getAge());
        response.put("Рост", dto.getWeight());
        return response;
    }
}
