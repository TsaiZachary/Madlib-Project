import java .util.Scanner;
//from the package java .util you are importing the scanenr class
/**
 * Write a description of class CopyOfScannerDEM0 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyOfScannerDEM0
{ 
public static void main(String[] args){
  Scanner input = new Scanner(System.in); // initializing a news scanne;
  System.out.print("Hello, what's your name?" );
  String name = input.nextLine();
  input.nextLine();
  System.out.print("What month is it? (Integer)" );
  int month = input.nextInt();
  input.nextLine();
  System.out.print("What day is it? (Integer)" );
  int day = input.nextInt();
  input.nextLine();
  System.out.print("What year is it? (Integer)" );
  int year = input.nextInt();
  input.nextLine();
  System.out.println("Today is " + month + "/" + day + "/" + year + "-" + name); 
  System.out.print("It was a ______, cold november day.");
  String adjective1 = input.nextLine();
  input.nextLine();
  System.out.print("I woke up to the ________ smell of turkey roasting in the living room downstairs.");
  String smell = input.nextLine();
  input.nextLine();
  System.out.print("I _________ down the stairs to see if I could help make the dinner.");
  String pastTenseVerb = input.nextLine();
  input.nextLine();
  System.out.print("My mom said 'we need fresh _______ for the salad.");
  String food = input.nextLine();
  input.nextLine();
  System.out.print("So I went and brought a tray full of _____.");
  String juice = input.nextLine();
  input.nextLine();
  System.out.print("I couldn't believe my ______ when I got there!");
  String body=input.nextLine();
  input.nextLine();
  System.out.print("There were __________ under the christmas trees!");
  String item2 = input.nextLine();
  input.nextLine();
  System.out.print("It was a " + adjective1 + ", cold november day. I woke up to the " + smell + "of turkey roasting in the living room downstairs. I" + Verb + "down the stairs to see if I could help make the dinner.");
  
}
}
  
