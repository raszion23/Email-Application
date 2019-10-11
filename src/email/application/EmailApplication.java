/**
 * File: EmailApplication.java
 * Author: Anthony Francis
 * Date: Oct 11, 2019
 * Purpose: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.
 *  - Generate an email with the following syntax: firstname.lastname@department.company.com
 *  - Determine the department (sales, development, accounting), if none leave blank
 *  - Generate a random String for a password
 *  - Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 *  - Have get methods to display the name, email, and mailbox capacity
 */
package email.application;

public class EmailApplication {

    public static void main(String[] args) {
        Email em1 = new Email("Anthony", "Francis");
        
        System.out.println(em1.showInfo());
    }

}
