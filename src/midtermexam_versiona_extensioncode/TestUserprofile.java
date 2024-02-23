/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author aditya
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userID = scanner.nextLine();

        System.out.println("Enter the name of your favourite actor: ");
        String favouriteActor = scanner.nextLine();

        UserProfile userProfile = new UserProfile(userID, favouriteActor);

        System.out.println("User profile created for " + userProfile.getUserID() + " with favourite actor as " + userProfile.getGenre());
    }
    
}
    
    
    

