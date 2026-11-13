package sets.maps;

import java.util.*;

public class SetsMaps {

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        HashSet<Integer> studentIDs = new HashSet<>();

     
        HashMap<Integer, String> students = new HashMap<>();

       
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent Entry " + i);

            System.out.print("Enter Student ID: ");
            int id = input.nextInt();
            input.nextLine();

         
            if (studentIDs.add(id)) {

                System.out.print("Enter Student Name: ");
                String name = input.nextLine();

                students.put(id, name);

                System.out.println("Student registered successfully!");

            } else {

                System.out.println("Duplicate ID! Registration rejected.");

            }
        }

        System.out.println("\n================================");
        System.out.println("       STUDENT REGISTRATION");
        System.out.println("================================");

        System.out.println("Total Unique Students: " + studentIDs.size());

     
        TreeMap<Integer, String> sortedStudents = new TreeMap<>(students);

        System.out.println("\nRegistered Students (Ascending Order):");

        for (Map.Entry<Integer, String> entry : sortedStudents.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }

        input.close();
    }
}

    
}
