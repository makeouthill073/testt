package kz.kalizhanov.dto;

public class PersonDTO {

    private String firstName;
    private String lastName;
    private String age;
    private String height;

    public PersonDTO(String firstName, String lastName, String age, String weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return height;
    }

}
