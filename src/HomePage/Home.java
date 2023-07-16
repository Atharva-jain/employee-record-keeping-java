 
package HomePage;
import User.userRegister.Registration;
import Admin.adminLogin.AdminLogin;
import User.UserSelectiveChoice;
import User.userLogin.Login;
import User.userloginAfterchoose.UserChoice;
public class Home 
{
      static boolean checkHome = true;
      Registration registration = new Registration();
      public void frontView()
      {
          
          System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println("--------->>>Employee Record Management System<<<---------");
          System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println("+++++ A : Admin Login  +++++++");
          System.out.println("+++++ B : User Login     +++++++");
          System.out.println("+++++ E : Exit                +++++++");
          System.out.println("+++++ Enter Your Choice :::  ");
          String choice = registration.inputString();
          choice = choice.toUpperCase().trim();
          if(choice.equals("A"))
          {
               AdminLogin Login = new AdminLogin();
               Login.login();
          }
          else if(choice.equals("B"))
          {
              UserSelectiveChoice user = new UserSelectiveChoice();
              user.userChoices();
          }   
          else if(choice.equals("E"))
          {
              System.exit(0);
          }
          else
          {
              System.out.println("Please Enter The Value Between (A,B,E) ..................");
              frontView();
          }
      }
    
}
