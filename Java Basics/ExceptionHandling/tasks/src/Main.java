import Exceptions.InvalidAgeException;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TASK "1"
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please the first num : ");
//        int x = input.nextInt();
//        System.out.println("Please the sec num : ");
//        int y = input.nextInt();
//        try {
//            System.out.println(x / y);
//        } catch (Exception e) {
//            System.out.println("cant divide " + e.getMessage());
//        }


        //Task "2"
//        try {
//            System.out.println("Please enter the number: ");
//            String num = input.nextLine();
//            Integer x = Integer.parseInt(num);
//            System.out.println(x.getClass().getName());
//        } catch (NumberFormatException e) {
//            System.out.println("wrong number format");
//        }

        //Task "3"
//        try {
//            System.out.println("Enter your name");
//            String x = input.next();
//            if(!x.equalsIgnoreCase("null")) {
//                System.out.println(x.toUpperCase());
//            }
//            else {
//                x= null;
//                System.out.println(x.toUpperCase());
//            }
//        } catch (Exception e) {
//
//            System.out.println(" toUpperCase() called on null object ");
//        }

        //Task "4"
//        try {
//            int[] myNumbers = {1, 2, 3, 4};
//            System.out.println(myNumbers[8]);
//        } catch (Exception e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }


        //Task "5"
//            try {
//                File file = new File("D:\\java era soft\\session 7\\task8.txt");
//                Scanner reader = new Scanner(file);
//
//                while (reader.hasNextLine()) {
//                    String line = reader.nextLine();
//                    System.out.println(line);
//                }
//
//                reader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("Error: File not found!");
//            }

        //Task "6"
//        Scanner input = new Scanner(System.in);
//        try {
//
//            System.out.println("Please enter your num: ");
//            int num = input.nextInt();
//            num = num / 0;
//            System.out.println("the num is : " + num);
//
//
//        } catch (InputMismatchException e) {
//            System.out.println("invalid name");
//        }
//        catch ( ArithmeticException e) {
//            System.out.println("invalid num");
//      }

        //Task "7"
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter your age");
//            int age = input.nextInt();
//            validateAge(age);
//        }catch (Throwable age){
//            System.out.println(age.getMessage());
//        }

        //Task "9"
//        try {
//            methodB();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        //Task '10'
//        try {
//            readFile();
//        }
//        catch (IOException e) {
//            System.out.println("Error while reading file: " + e.getMessage());
//        }

    }

    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        System.out.println("File opened");
        reader.close();
    }

    public static void methodA() throws Exception {
        throw new Exception("Exception thrown from methodA");
    }

    public static void methodB() throws Exception {
        methodA();
    }


    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18)
        {
           throw new InvalidAgeException("Invalid age");
        }
        else{
            System.out.println("Valid Age");
        }
    }
}