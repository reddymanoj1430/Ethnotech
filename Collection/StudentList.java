package Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {

    public static void main(String args[]) {

        LinkedList<String> names = new LinkedList<>();
        LinkedList<Integer> marks = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names of students");

        for(int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("Enter marks of students");

        for(int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("\nStudent Details");

        for(int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " ---> " + marks.get(i));
        }

        sc.close();
    }
}