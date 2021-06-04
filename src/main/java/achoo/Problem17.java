package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem17 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double w = a.nextDouble();
        System.out.print("Enter your gender(M or F) ");
        String g = a.next();
        System.out.print("Enter the total alcohol consumed in ounces ");
        double alc = a.nextDouble();
        System.out.print("Enter the number of hours since your last drink ");
        double h = a.nextDouble();
        double BAC;
        if(g.equals("M"))
            BAC = (alc*5.14/w*.73)-.015*h;
        else BAC = (alc*5.14/w*.66)-.015*h;
        System.out.println("Your BAC is "+BAC);
        if(BAC>=.08)
            System.out.println("You cannot legally drive");
        else System.out.println("You can legally drive");
    }
}
