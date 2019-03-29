/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

/**
 *
 * @author nweber2
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        StringStack ss = new StringStack(5);
        String command;
        String word = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter push, pop, peek, combine, or quit: ");
        command = sc.next();
        while (!command.equals("quit")) {
            if (command.equals("push")) {
              //  System.out.println("What would you like to push");
                word = sc.next();
                ss.push(word);
               // System.out.println(word +" has been pushed onto the ");
            } else if (command.equals("peek")) {
                word = ss.peek();
                if (word != null) {
                    System.out.println("Top: " + word);
                } else {
                    System.out.println("Stack is empty");
                }
            } else if (command.equals("pop")) {
              //  String tempWord = word;
               word = ss.pop();
                if(word !=null){
                    System.out.println(word);
                }else{
                    System.out.println("Stack is empty");
                }
            } else if (command.equals("combine")) {
                word = ss.pop() +" " + ss.pop();
                ss.push(word);

            }
            System.out.println("Enter push, pop, peek, combine, or quit:");
            command = sc.next();
        }
        System.out.println("Program Ending");

    }

}
