package homework;


import java.util.ArrayList;

public class Homework3 {

     public static void display(ArrayList<Animal> array) {
         for (int x = 0; x < array.size(); x++) {
             System.out.println("This Animal is a: " + array.get(x).getName()  + " and it eats " + array.get(x).getFood() );
         }
     }

         public static void main(String[] args) {
         ArrayList<Animal> array = new ArrayList<Animal>();
         Animal dog = new Animal("Dog", "Dog food");
         Animal cat = new Animal("Cat", "Cat food");
         Animal fish = new Animal("Fish", "Fish food");

         array.add(dog);
         array.add(cat);
         array.add(fish);
         display(array);

     }


 }

 class Animal{

    private String name;
    private String food;
     Animal (String name, String food){
        this.name = name;
        this.food = food;
    }



    public  String getName() {
        return name;
    }


    public String getFood() {
        return food;
    }


 }





