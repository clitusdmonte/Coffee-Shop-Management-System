package lab00;

/* 
Program to calculate the volume of a right circular     
cylinder.      
Programmer: Clitus Dmonte
File Name: Cylinder.java 
*/

//package for Scanner class objects
import java.util.Scanner;

public class Cylinder 
{
public static void main(String[]args)
{
//Initializing variables 
double r,h,a,v;
String name="";
//Creating a Scanner object
Scanner sc= new Scanner(System.in);
//Greeting the user
System.out.println("Welcome to Cylinder volume and area calcualtor");
//Asking user for the name
System.out.println("Please enter your name");
//Storing user's name into the declared string
name= sc.nextLine();
//Displaying user name
System.out.println("Hello "+name);
//Asking user for the radius of the cylinder
System.out.println("Please enter the radius of the cylinder");
//Storing the user input into the declared variable
r= sc.nextDouble();
//Asking user for the height of the cylinder
System.out.println("Please enter the height of the cylinder");
h = sc.nextDouble();
//Calcualting the volume of the cylinder with the values provided by the user
v= 3.1416*r*r*h;
//Calcualting the area of the cylinder with the values provided by the user
a= (2*3.1416*r*h)+(2*3.1416*r*r);
//Displaying the volume of the cylinder to the user
System.out.println("Volume of desired Cylinder is "+v);
//Displaying the area of the cylinder to the user
System.out.println("Area of desired Cylinder is "+a);
//Displaying closing greetings to the user
System.out.println("Thank you for using the calculator. Please visit again");
}
}
