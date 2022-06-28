package kz.kalizhanov;

import kz.kalizhanov.dto.AnimalDTO;
import kz.kalizhanov.dto.PersonDTO;
import kz.kalizhanov.objects.Dog;
import kz.kalizhanov.objects.Student;

public class Main {
    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO("Baha", "Mambet", "18", "68kg");
        AnimalDTO animalDTO = new AnimalDTO("Dog", "3", "10kg", "Hatiko");
        Dog dog = new Dog();
        Student student = new Student();

        System.out.println("Dog say: " + dog.say("WOOF! WOOF!"));
        System.out.println("Dog drinking: " + dog.drink("water"));
        System.out.println();
        System.out.println("Student say: " + student.say("Hi!"));
        System.out.println("Student drinking: " + student.say("coffee"));
        System.out.println();
        System.out.println(student.characteristics(personDTO));
        System.out.println(dog.characteristics(animalDTO));
    }
}
