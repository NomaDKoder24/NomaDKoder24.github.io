# Java Project 001 - Email Application

September 7, 2020 Thursday

Project 1

# Email Application

### Scenario : 
You are an IT Support Administrator Specialist and are charged with the task of creating email account for new hires.

---

Your application should do the following:

- Generate an email with the following syntax: firstname, lastname@department.company.com
- Determine the department (sales, development, accounting), if none leave black.
- Generate a random String for a password
- Have set methods to change the password, set the amilbox capacity, and define an alternate email address.
- Have get methods to display the name, email, and mailbox capacity

---

# Code

```java
package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "jdragon.com";

    // Constructor to recieve the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call amethod asking for the deparment - return the department.
        this.department = setDepartment();

        // Call a method that returns a random password.
        this.password = randomPassword(8);

        // Combine elements to generate email.
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department + "." + companySuffix;
    }

    // Ask for the department

    private String setDepartment() {
        System.out.print("New worker: " + firstName +".\n Department codes: \n1 for Sales\n2 Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password = new char [length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // Set the alternate email
    public void setAlternateEmail (String altEmail) {
        this.alternateEmail = altEmail;
    }
    // Change the password
    public void changepasswrod(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }

    public String getAlternateEmail () { return alternateEmail; }

    public String getPassword () { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: "
                + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
```

---

## Code Review

### 1. Class & Class variables with modifier

```java
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "jdragon.com";
```

  To protect the member variables which are crucial information from others, modifiers are set as private. 

### 2. Constructor

```java
    // Constructor to recieve the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call amethod asking for the deparment - return the department.
        this.department = setDepartment();

        // Call a method that returns a random password.
        this.password = randomPassword(8);

        // Combine elements to generate email.
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department + "." + companySuffix;
    }
```

   To use variables are in private, the constructor was used because the only way to access private modifier using 'this' keyword to call its variable.

### 3. Setter

```java
 // Ask for the department

    private String setDepartment() {
        System.out.print("New worker: " + firstName +".\n Department codes: \n1 for Sales\n2 Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }
```

  To classify newly hired person where he or she belongs, the setter was used to input his or her department.

### 4. Random Password

```java
    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password = new char [length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
```

 As the scenario says, to generate the random password with given characters, the array and for loop was used. 

 and the length of password was set on the class variable section. So when the method runs, there will be a default length of password.