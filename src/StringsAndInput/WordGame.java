package StringsAndInput;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        System.out.println("Fill out the requested prompts.");

        String name, age, city, college, major, animal, petname;

        System.out.println("Enter a name: ");
        Scanner input= new Scanner(System.in);
        name=input.next();
        System.out.print("Enter an age: ");
        age=input.next();
        System.out.print("Enter a city: ");
        city=input.next();
        System.out.print("Enter a college: ");
        college=input.next();
        System.out.print("Enter a college major: ");
        major=input.next();
        System.out.print("Enter a type of animal: ");
        animal=input.next();
        System.out.print("Enter a pet's name: ");
        petname=input.next();

        System.out.println("Once upon a time, there was a person named " +name+" who lived in "+city+".");
        System.out.println("At the age of "+age+", "+name+" went to college at "+college+" and studied "+major+".");
        System.out.println("Then, "+name+" adopted a(n) "+animal+" named "+petname+". They both lived happily ever after!");
    }
}

