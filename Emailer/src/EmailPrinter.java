import java.util.List;
import java.io.BufferedWriter; // BufferedWriter Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.
import java.io.FileWriter; // File Writer use default buffer size bytes which lets usage of other characters
import java.io.PrintWriter;
import java.io.File;

public class EmailPrinter{
    public static void printEmails(List<Email> emails){ // This part o fthe array list for the email
        for(Email email : emails){

            System.out.println(email);

        }

    }

    public static void printEmailsToFile(List<Email>emails,String Filename){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(Filename))));
            //This line of code creates a PrintWriter that can be used to write text data to the file specified by the Filename variable, with the added benefit of buffering for improved performance when writing to the file.
            for(Email email : emails){

                pw.println(email.toFileString());
    
            }
            pw.close();
        } catch (Exception ex){
            System.out.println("Erroer");
        }
        
    }
}
