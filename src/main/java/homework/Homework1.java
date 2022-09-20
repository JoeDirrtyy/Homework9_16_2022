package homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Is the Temperature High, Low, or Humid?: ");
            String temp = scanner.nextLine();
            if(temp.equalsIgnoreCase("High")){
                System.out.println("Sunblock may be needed");
                break;
            }
            if(temp.equalsIgnoreCase("Low")){
                System.out.println("A coat maybe needed");
                break;
            }
            if(temp.equalsIgnoreCase("Humid")){
                System.out.println("It's muggy!");
                break;
            }
            else{
                System.out.println("Please try again");
            }
        }


    }


}
