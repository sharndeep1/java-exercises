package exercises;

import java.util.Scanner;

public class Gallon {
    public static void main(String[] args)
    {
        double miles,gas,consumed;
        Scanner m = new Scanner(System.in);
        miles=m.nextDouble();
        gas=m.nextDouble();
        consumed=miles/gas;
        System.out.println(consumed);


    }
}
