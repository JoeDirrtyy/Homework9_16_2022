package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
                int numberOfPets = scanner.nextInt();
     Animal[] pets = new Animal[numberOfPets];
       int x = 0;
       while(x <= numberOfPets  ){
           String name;
           String noise;
           Animal animal;
           System.out.println("what kind of pet(s)?");
           String fireBlank = scanner.nextLine();
          String typeOfPet = scanner.nextLine();

            System.out.println("Whats their name?");
           name = scanner.nextLine();
           System.out.println("What do they sound like?");
           noise = scanner.nextLine();
           if(typeOfPet.equalsIgnoreCase("Dog")){
               animal  = new Dog(name,noise);
           }
           x++;
          // if(typeOfPet.equalsIgnoreCase("Cat")){
           //    animal cat = new Cat(name,noise);
          // }
          // if(typeOfPet.equalsIgnoreCase("Fish")){
          //     animal fish  = new Fish(name,noise);
        //   }

           }
       }



    }



