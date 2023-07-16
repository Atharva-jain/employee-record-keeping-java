/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empoyeesrecordkeeping;
import Admin.adminLogin.*;
import SaveUsername.Usernames;
import User.userRegister.*;
import Admin.ShowUserData.DisplayHoleData;
import User.userEditPersonalData.*;
import User.userShowData.*;
import Admin.UserModifyData.ModifyData;
import Admin.userPerticularDataSearch.DataSearch;
import Admin.userfileDeleted.DeleteFile;
import HomePage.Home;
import User.userLogin.*;
/**
 *
 * @author MCT
 */
public class EmpoyeesRecordKeeping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Home home = new Home();
        home.frontView();
    }
    
}
// Registration registration = new Registration();
//      // registration.Employeeregistration();
//        StoreEmployeeData sData = new StoreEmployeeData();
//      //  int i = sData.getUserID();
//        //System.out.println(i);
//        Login login = new Login();
//        ForgotPassword forgotPassword = new ForgotPassword();
//        EditData ed = new EditData();
////        ed.editDataChoice("ATHARVAAVINASHJAIN.txt");
//        DisplayData data = new DisplayData();
//        AdminLogin adminLogin = new AdminLogin();
//     //  adminLogin.login();
//        Usernames usernames = new Usernames();
//    //    usernames.saveUsernameInText("okcoolsbro");
//        DisplayHoleData holeData = new DisplayHoleData();
//      //  holeData.getUsernameFromFile();
//       ModifyData dataModify = new ModifyData();
//     // dataModify.findFileName();
//        DeleteFile deleteFile = new DeleteFile();
//        //deleteFile.findFileName();
//        DataSearch dataSearch = new DataSearch();
//       // dataSearch.searchData();
