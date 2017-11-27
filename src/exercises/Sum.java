package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static int sumeven(ArrayList<Integer> list)
    { int sum=0;
        for(Integer num : list)
        {   if(num%2==0)
                sum+=num;

        }
        return sum;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList();
        Integer number=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Enter List Element:");
            number=sc.nextInt();
            list.add(number);
        }
        System.out.println("sum of Even Number "+sumeven(list));


    }
}
