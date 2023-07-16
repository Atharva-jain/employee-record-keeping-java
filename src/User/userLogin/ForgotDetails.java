
package User.userLogin;

import User.UserSelectiveChoice;
import User.userRegister.Registration;
import java.io.BufferedReader;
import java.io.FileReader;

public class ForgotDetails 
{
      Registration registration = new Registration();
      
      public void checkFileIsExist(String fileName)
      {
          boolean check = false;
          try
          {
              FileReader fileReader = new FileReader("Username.txt");
              BufferedReader reader = new BufferedReader(fileReader);
              String data = "";
              while((data = reader.readLine()) != null)
              {
                   if(data.equals(fileName))
                   {
                       check = true;
                       break;
                   }
              }
              if(check)
              {
                  ForgotPassword forgotPassword = new ForgotPassword();
                  forgotPassword.forgot(fileName+".txt");
              }
              else
              {
                  System.out.println("May be you are not Register your account if you have any mistake so try again (Yes /  No)");
                  String str = registration.inputString();
                  str  =  str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      forgotDetails();
                  }
                  else
                  {
                       UserSelectiveChoice usc = new UserSelectiveChoice();
                       usc.userChoices();
                  }
              }
          }
          catch (Exception e) 
          {
          }
  
      }
      public void forgotDetails()
      {
          System.out.println("Enter the First Name ::: ");
          String firstName = registration.inputString();
          firstName = firstName.toUpperCase().trim();
          System.out.println("Enter the Middle Name ::: ");
          String middleName =  registration.inputString();
          middleName = middleName.toUpperCase().trim();
          System.out.println("Enter the Last Name ::: ");
          String lastName = registration.inputString();
          lastName = lastName.toUpperCase().trim(); 
          checkFileIsExist(firstName+middleName+lastName);
           
      }
      
}
