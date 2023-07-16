
package Admin;

import Admin.ShowUserData.DisplayHoleData;
import Admin.UserModifyData.ModifyData;
import Admin.userPerticularDataSearch.DataSearch;
import Admin.userfileDeleted.DeleteFile;
import HomePage.Home;
import User.userRegister.Registration;

public class AfterAdminLogin
{
      Registration registration = new Registration();
      public void adminChoices()
      {
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("++++++++++ A : Show Hole User Data +++++++");
             System.out.println("++++++++++ B : Modify User Data   +++++++++");
             System.out.println("++++++++++ C : Search User Data  ++++++++++");
             System.out.println("++++++++++ D : Delete User Data  ++++++++++");
             System.out.println("++++++++++ E : Exit  ++++++++++++++++++++");
             System.out.println("++++++++++ Enter your Choice :::: ");
             String choice = registration.inputString();
             choice = choice.toUpperCase().trim();
             if(choice.equals("A"))
             {
                 DisplayHoleData holeData = new DisplayHoleData();
                 holeData.getUsernameFromFile();
             }
             else if(choice.equals("B"))
             {
                 ModifyData data = new ModifyData();
                 data.findFileName();
             }
             else if(choice.equals("C"))
             {
                 DataSearch dataSearch = new DataSearch();
                 dataSearch.searchData();
             }
             else if(choice.equals("D"))
             {
                 DeleteFile deleteFile = new DeleteFile();
                 deleteFile.findFileName();
             }
             else if(choice.equals("E"))
             {
                Home home = new Home();
                home.frontView();
             }
             else
             {
                 System.out.println("Enter the Value Between these Given Choices ...................");
                 adminChoices();
             }
      }
}
