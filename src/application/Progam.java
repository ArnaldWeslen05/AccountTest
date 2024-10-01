package application;

import entites.Home;
import java.util.Locale;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Home[] vect = new Home[10];
        System.out.print("how many roos will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + 1);
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("Room:");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Home(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }

}
