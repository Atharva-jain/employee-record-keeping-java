 
package User.userloginAfterchoose;
import User.UserSelectiveChoice;
import User.userRegister.*;
import User.userEditPersonalData.*;
import User.userShowData.*;
public class UserChoice {
     
    public void choose(String fileName)
    {
              Registration registration = new Registration();
              boolean check = true;
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("+++++++ A  :  Edit Personal Data ++++");
              System.out.println("+++++++ B  :  Show Data  +++++++++");
              System.out.println("+++++++ E  :  Exit  ++++++++++++++");
              System.out.println("+++++++ Enter Choice ::::  ");
              String choice = registration.inputString();
              choice = choice.toUpperCase().trim();
              if(choice.equals("A"))
              {
                  EditData ed = new EditData();
                  ed.editDataChoice(fileName, 2);
              }
              else if(choice.equals("B"))
              {
                  DisplayData dis = new DisplayData();
                  dis.showData(fileName, 1);
              }
              else if(choice.equals("E"))
              {
                 UserSelectiveChoice  usc = new UserSelectiveChoice();
                 usc.userChoices();
              }
              else
              {
                  System.out.println("Enter the Value Between Given these Choices ..............");
                  choose(fileName);
              }
    }
}
 