
package User;

import Admin.adminLogin.AdminLogin;
import HomePage.Home;
import User.userLogin.ForgotDetails;
import User.userLogin.Login;
import User.userRegister.Registration;

public class UserSelectiveChoice 
{
    Registration registration = new Registration();
     public void userChoices()
     {
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("+++++++     A: User Log in   ++++++++++" );
         System.out.println("+++++++     B: Registration   ++++++++++" );
         System.out.println("+++++++     C: Forgot Password  +++++++ ");
         System.out.println("+++++++     E: Exit    +++++++++++++++ ");
         System.out.println("+++++++     Enter Your Choice ::: ");
         String choice = registration.inputString();
         choice = choice.toUpperCase().trim();
         if(choice.equals("A"))
         {
            Login login = new Login();
            login.userLogin();
         }
         else if(choice.equals("B"))
         {
             registration.Employeeregistration();
         }
         else if(choice.equals("C"))
         {
             ForgotDetails forgotDetail = new ForgotDetails();
             forgotDetail.forgotDetails();
         }
         else if(choice.equals("E"))
         {
             Home home = new Home();
             home.frontView();
         }
         else
         {
             System.out.println("Plaese Enter the Value Between these given Chooses..................");
             userChoices();
         }
     }
    
}
