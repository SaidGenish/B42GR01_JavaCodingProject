package arzu_imin.practicecode;

import java.util.Scanner;

public class BasicGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to the mysterious forest");
        System.out.println("please click on to start to the game");
        String clik=scanner.nextLine();
        System.out.println("youre in the mysterious forest,you have 2 choice left and right");
        String choice=scanner.nextLine();
        if (choice.equalsIgnoreCase("right")) {
            System.out.println("you end up in the mud");
            System.out.println("game over");
            scanner.nextLine();}
        else if (choice.equalsIgnoreCase("left"))

            System.out.println("good job,are you ready to next level");
        scanner.nextLine();

    }
}
