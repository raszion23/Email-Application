/**
 * File: Email.java
 * Author: Anthony Francis
 * Date: Oct 11, 2019
 * Purpose: Email class
 */
package email.application;

import java.util.Scanner;

public class Email {

    //Declare variables
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "somecompany.com";

    //Constructor to recieve first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New employee: " + firstName + " " + lastName + "\n");

        //Call method asking for department & return department
        this.department = setDepartment();
        System.out.println(this.department + "\n");

        //Call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password + "\n");

        // Combine elements to create email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + companySuffix;
    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Department Options\n1: Sales\n2: Development\n3: Accounting\n0: None\n\nSelect Department: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        switch (deptChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            case 0:
                return "None";
            default:
                System.out.println("Please select again.");
                break;
        }
        return setDepartment();
    }

    //Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword(String password) {
        this.password = password;
    }

    //Get mailbox capacity
    public int getMailboxCapacity() {
        System.out.println("Mailbox capacity: ");
        return this.mailboxCapacity;
    }

    //Get alternate email
    public String getAlternateEmail() {
        System.out.println("Alternate email: ");
        return this.alternateEmail;
    }

    //Get password
    public String getPassword() {
        System.out.println("New password:");
        return this.password;
    }
    
    //Show info
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
               "\nEmail: " + email + 
               "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
