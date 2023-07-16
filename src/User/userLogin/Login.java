package User.userLogin;
import HomePage.Home;
import User.userRegister.Registration;
import java.io.BufferedReader;
import java.io.FileReader;
import User.userEditPersonalData.*;
import User.userloginAfterchoose.*;
public class Login  
{
    protected String username, password, firstName, middleName, lastName,usernameCheck, passwordCheck;
    protected boolean check = false;
    int i = 0;
    Registration  registration = new Registration();
    
    public String passwordFetch(String firstName, String middleName, String lastName)
    {
        String passwordDemo = "";
        try
          {
                 FileReader reader = new FileReader(firstName+middleName+lastName+".txt");
                 BufferedReader buffReader = new BufferedReader(reader);
                 String store = "";
                 i=0;
                 while((store=buffReader.readLine()) != null)
                 {
                     if(i == 19)
                     {
                          
                         passwordDemo = store;
                     }
                     i++;
                 } 
                 check = true;
          } 
          catch (Exception e) 
          { 
                 System.out.println("You are not register,  you want to try again (Yes / No) ");
                 String str = registration.inputString();
                 str = str.toUpperCase().trim();
                 if(str.equals("YES"))
                 {
                     userLogin();
                 }
                 else
                 {
                     Home home = new Home();
                     home.frontView();
                 }
                 check = false;
                                
          }
          return passwordDemo;
    }
    
    public String usernameFetch(String firstName, String middleName, String lastName)
    {
          String usernameDemo = "";
          try
          {
                 FileReader reader = new FileReader(firstName+middleName+lastName+".txt");
                 BufferedReader buffReader = new BufferedReader(reader);
                 String store = "";
                 i=0;
                 while((store=buffReader.readLine()) != null)
                 {
                     if(i == 18)
                     {
                         usernameDemo = store;
                     }
                     i++;
                 } 
                 check = true;
          } 
          catch (Exception e) 
          { 
                 System.out.println("You are not register,  you want to try again (Yes / No) ");
                 String str = registration.inputString();
                 str = str.toUpperCase().trim();
                 if(str.equals("YES"))
                 {
                     userLogin();
                 }
                 else
                 {
                     Home home = new Home();
                     home.frontView();
                 }
                 check = false;               
          }
        return usernameDemo;
    }
    
    public void usernamePasswordCheck(String username, String password)
    {
          System.out.println("Enter Username :: ");
          usernameCheck = registration.inputString();
          usernameCheck = usernameCheck.trim();
          System.out.println("Enter Password :: ");
          passwordCheck = registration.inputString();
          passwordCheck = passwordCheck.trim();
          if(usernameCheck.equals(username) && passwordCheck.equals(password))
          {
              System.out.println("Successfully login");
              String fileName = firstName+middleName+lastName+".txt";
              EditData editData = new EditData();
              UserChoice userChoice = new UserChoice();
              userChoice.choose(fileName);
              
          }
          else
          {
              System.out.println("Invalid Username / Password you want to try again (Yes/No) ");
              String str = registration.inputString();
              str = str.toUpperCase().trim();
             if(str.equals("YES"))
             {
                   usernamePasswordCheck(username, password);
             }
             else
             {
                 System.out.println("You want to Changed Password (Yes / No):: ");
                 String str1 = registration.inputString();
                 str1 = str1.toUpperCase().trim();
                 if(str1.equals("YES"))
                 {
                     String fileName = firstName+middleName+lastName+".txt";
                     ForgotPassword forgotPassword = new ForgotPassword();
                     forgotPassword.forgot(fileName);
                 }
                 else
                 {
                     Home home = new Home();
                     home.frontView();
                 }
             }
                 
          }
    }
    
    public void userLogin()
    {
         System.out.println("Enter First Name :: ");    
         firstName = registration.inputString();
         firstName = firstName.toUpperCase().trim();
         System.out.println("Enter Middle Name :: ");
         middleName = registration.inputString();
         middleName = middleName.toUpperCase().trim();
         System.out.println("Enter Last Name :: ");
         lastName =  registration.inputString();
         lastName = lastName.toUpperCase().trim();
         username = usernameFetch(firstName, middleName, lastName);
         password = passwordFetch(firstName, middleName, lastName);
         if(check)
         {
             usernamePasswordCheck(username, password);
         }
         else
         {
             
         }
    }
    
}
