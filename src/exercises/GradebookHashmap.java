package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> students=new HashMap<>();
        Scanner in= new Scanner(System.in);
        String newstudent;
        Integer newId;

        System.out.println("enter your id");
        do {
            System.out.print("Id: ");
            newId = in.nextInt();
            if (newId != 0) {
                System.out.println("enter studentname: ");
                newstudent = in.next();
                students.put(newId, newstudent);

               //2
                 in.nextLine();
            }
        }
        while(newId !=0);
        System.out.println("\n class roster:");

        for(Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println("student Id:" +student.getKey());
            System.out.println("student Name:" +student.getValue());



        }
    }
}
