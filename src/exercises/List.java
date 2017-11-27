package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import static exercises.List.getfive;

public class List {
    public static  void getfive(ArrayList<String> l) {
     for(String litem : l)
     {
         if(litem.length()==5) {
           System.out.println(litem);
         }
     }
    }
    public static void main(String[] args){
        ArrayList<String>  l = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String  li;
        do{
            System.out.println("enter any string");
            li = in.next();
            l.add(li);


        }
        while(!li.equals("-1"));
        getfive(l);

    }

}
