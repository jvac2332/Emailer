import java.util.Scanner; // Scanner class is used for reading input from the user or from various input sources, such as files or strings
import java.util.ArrayList; // provides methods to add, remove, and manipulate elements within the list
import java.util.List;// interface is part of the Java Collections Framework and defines a contract for ordered collections of elements.
public class EmailApp {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Email> emails = new ArrayList<Email>();

        System.out.println("*****************************************************************");
        System.out.println(" ".repeat(15) + " Emailer Version 1.0" + " ".repeat(24));
        /// The repeat helps putting my quotes in the center to line like how the example was\\\
        System.out.println("*****************************************************************");

        while(true){ //This is an infinite loop///    
            System.out.println("\nHere are your choices:"); /// line 16-21 is listing the statements in the rubric and finishing with the exit
            System.out.println("1. Write email");
            System.out.println("2. List emails");
            System.out.println("3. Send emails");
            System.out.println("4. Save emails to file");
            System.out.println("5. Exit");
    
            System.out.println("Enter the number of choices: "); /// The choice statements talks about what choice you type on 
            String choice = scan.nextLine();

            if(choice.equals("1")){ // Lines 26-46 talks on what choice we type for the body and
                                                /// choose not send it or save it which the else if functions
                System.out.println("Enter recipients' email: ");
                List<String> recipients = List.of(scan.nextLine().split(" "));
                System.out.print("Enter subject: ");
                String subject = scan.nextLine();
                System.out.print("Enter body: ");
                String body = scan.nextLine();
                
                Email email = new Email(recipients,subject,body);
                emails.add(email);

            } else if (choice.equals("2")){ 
                EmailPrinter.printEmails(emails);
            } else if (choice.equals("3")){
                try{
                    for(Email email : emails){
                        email.send();
                    }
                    System.out.println("Error!");
                } catch (Exception e) {
                    e.printStackTrace(); // or handle the exception in a more appropriate way
                }
              
            } else if (choice.equals("4")){
                System.out.println("Enter file name: ");
                String fileString = scan.next();
                EmailPrinter.printEmailsToFile(emails, fileString); // This code is calling the filename and printing out where to put the email and body

            } else if (choice.equals("5")){
                System.out.println("Thank you for using this program ");
                System.exit(0);
            } 
        }
    }
}
