package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        // deklarasi variabel
        String user, password;
        int email, successful;

        
        Scanner keyboard = new Scanner(System.in);

        
        System.out.println("masukan perintah berikut");
        System.out.print("User: ");
        
        user = keyboard.nextLine();
        
        System.out.print("Password: ");
        password = keyboard.nextLine();

        System.out.print("Email: ");
        email = keyboard.nextInt();
        System.out.print("Successful: ");
        successful = keyboard.nextInt();


        System.out.println("User: " + user);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Successful: " +successful );
        
        
      
    }

}
  