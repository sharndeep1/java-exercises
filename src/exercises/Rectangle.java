package exercises;

import java.util.Scanner;

public class Rectangle {
    public static  void main(String[] args) {
        int l, b, area;

        Scanner length = new Scanner(System.in);
        System.out.println("enter length and b");
        l = length.nextInt();
        b=length.nextInt();

        area = l * b;
        System.out.println(area);

    }

}
