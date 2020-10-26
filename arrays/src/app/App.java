package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

     String seniors[] ={"rogan", "brandon"};

     String juniors[] ={"bryan",  "hamilton", "kenadi", "mason"};

     String sophmores[] ={"luke", "will", "alexis", "taten"};

     System.out.println("enter a student name");
     String enterName = input.nextLine();

     for (int i = 0; i < sophmores.length; i++){
         if (enterName.equals(sophmores[i])){
             System.out.println("grade 10");
         }
     }

      for (int i = 0; i < juniors.length; i++){
         if (enterName.equals(juniors[i])){
             System.out.println("grade 11");
         }
     }

     for (int i = 0; i < seniors.length; i++){
         if (enterName.equals(seniors[i])){
             System.out.println("grade 12");
         }
     }

    }
}