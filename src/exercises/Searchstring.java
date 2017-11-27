package exercises;

import java.util.Scanner;

public class Searchstring {
    public static void main(String[] args)
    {
        String s="Alice's Adventures in wonderland";
        String  f;
        Scanner find = new  Scanner(System.in);
        System.out.println("enter string");
        f=find.nextLine();
       if(s.indexOf(f)==-1)
       {
           System.out.println("false");

       }
       else
       {
           System.out.println("True");
       }
    }
}
