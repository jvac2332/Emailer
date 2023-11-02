import java.util.List;
import java.util.Scanner;

public class Email {
    Scanner scan = new Scanner(System.in);
    List<String> Reciponets;
    
    String Subjects;    
    String Body;
    boolean status;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {   // Lines 12 - 32 are a constructors from the Subject,Body,Status and delcarling lines of code for those 3
        this.status = status;
    }
    public List<String> getReciponets() {
        return Reciponets;
    }
    public void setReciponets(List<String> reciponets) { // public void is making sure that there aren't any other values
        Reciponets = reciponets;
    }
    public String getSubjects() {
        return Subjects;
    }
    public void setSubjects(String subjects) {
        Subjects = subjects;
    }
    public String getBody() {
        return Body;
    }
    public void setBody(String body) {
        Body = body;
    }
    public Email(List<String> reciponets, String subjects, String body, boolean status) { // 35 is making sure that setting up the email that way when writing it can get the body and reciponest right
        this.Reciponets = reciponets;
        this.Subjects = subjects;
        this.Body = body;
        this.status = status;
    }  
    public Email() {
        this.Reciponets = null;
        this.Subjects = "";
        this.Body = "";
        this.status = false;
    }

    public Email(List<String> reciponets, String subjects, String body) {
        this.Reciponets = reciponets;
        this.Subjects = subjects;
        this.Body = body;
        this.status = false;
    }  

    @Override
    public String toString(){
        String RecpionetString = ("");
        for(String person: Reciponets){
            RecpionetString += person + (",");
        }
        String StatusString = "Not sent";
        if(status){
            StatusString = "sent";
        }
        return String.format("To \t %s \nSubject: \t %s \nStatus\t%s\nBody:\n%s",RecpionetString,Subjects,StatusString,Body);
    }     // 65 code is resulting string which will be returned by the method that contains this line. The format string is used to structure and present information in a specific way. 

    public String toFileString(){
        String RecpionetString = ("");
        for(String person: Reciponets){
            RecpionetString += person + (",");
        }
        String StatusString = "Not sent";
        if(status){
            StatusString = "sent";
        }
        return String.format("%s\t%s\t%s\t%s\n",RecpionetString,Subjects,Body,StatusString);
    
    }

    public void send(){ // method is a publicly accessible method that doesn't return any value
        status = true;
    }





    
    

}
