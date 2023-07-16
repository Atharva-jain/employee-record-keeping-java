package Admin.adminLogin;
import Admin.AfterAdminLogin;
import HomePage.Home;
import User.userRegister.Registration;
import com.oracle.nio.BufferSecrets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
public class AdminLogin 
{
       protected String username, password, usernameCheck, passwordCheck;
       Registration registration = new Registration();
       
       public String getPassword()
       {
            String passswordDemo = "";
           try
           {
                 FileReader fileReader = new FileReader("ADMIN.txt");
                 BufferedReader reader = new BufferedReader(fileReader);
                 
                 String data = "";
                 int i =0 ;
                 while((data = reader.readLine()) != null)
                 {
                         if(i  == 1)
                         {
                               passswordDemo = data;
                         }
                         i++;
                 }
                 reader.close();
           } 
           catch (Exception e) 
           {
           }
           return passswordDemo;
       }
       
       public String  getUsername()
       {
           String usernameDemo = "";
           try
           {
                 FileReader fileReader = new FileReader("ADMIN.txt");
                 BufferedReader reader = new BufferedReader(fileReader);
                 
                 String data = "";
                 int i =0 ;
                 while((data = reader.readLine()) != null)
                 {
                         if(i  == 0)
                         {
                               usernameDemo = data;
                         }
                         i++;
                 }
                 reader.close();
           } 
           catch (Exception e) 
           {
           }
           return usernameDemo;
       }
       
       public void login()
       {
             System.out.println("Enter Username :: ");
             username = registration.inputString();
             username = username.trim();
             System.out.println("Enter Password ::");
             password = registration.inputString();
             password = password.trim();
             usernameCheck = getUsername();
             passwordCheck = getPassword();
             if(username.equals(usernameCheck)  && password.equals(passwordCheck))
             {
                 System.out.println(" Successfully Login!!!!! ..................");
                 AfterAdminLogin admin = new AfterAdminLogin();
                 admin.adminChoices();
             }
             else
             {
                 System.out.println(" Invalid Username / Password You want to try Again (Yes /  No)");
                 String str  = registration.inputString();
                 str = str.toUpperCase().trim();
                 if(str.equals("YES"))
                 {
                     login();
                 }
                 else
                 {
                     Home home = new Home();
                     home.frontView();
                 }
             }
             
       }
}
