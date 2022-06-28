package kz.kalizhanov.abstracts;

import kz.kalizhanov.dto.PersonDTO;

import java.util.Map;

public abstract class Human {
    public abstract Map<String, String> characteristics(PersonDTO dto);
}
