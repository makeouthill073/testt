package kz.kalizhanov.abstracts;

import kz.kalizhanov.dto.AnimalDTO;

import java.util.Map;

public abstract class Entity {
    public abstract Map<String, String> characteristics(AnimalDTO dto);
}
