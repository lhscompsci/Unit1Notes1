import java.util.Scanner;

public class LearningInput {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the value of Pi");
        double piVal = keyboard.nextDouble();

        //clearing the buffer
        keyboard.nextLine();

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println("how old are you?");
        int age = keyboard.nextInt();

        System.out.println("Good morning, " + name);
        System.out.println("you are " + age + " years old");


    }
}
