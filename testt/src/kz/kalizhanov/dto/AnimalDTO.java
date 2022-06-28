package kz.kalizhanov.dto;

public class AnimalDTO {

    private String name;
    private String age;
    private String weight;
    private String breed;

    public AnimalDTO(String name, String age, String weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

}
