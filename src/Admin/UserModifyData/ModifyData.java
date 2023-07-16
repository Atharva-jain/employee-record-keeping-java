package Admin.UserModifyData;
import Admin.AfterAdminLogin;
import User.userRegister.Registration;
import java.io.BufferedReader;
import java.io.FileReader;
import User.userEditPersonalData.EditData;
public class ModifyData 
{
    Registration registration = new Registration();
    int userID;
    public static String firstName, middleName, lastName;
    public boolean checkUserID(int id , String fileName)
    {
        int flag = 0 ;
        boolean check = false;
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String data =  "";
            String idToString = Integer.toString(id);
            int i = 0; 
            while((data = reader.readLine()) != null)
            {
                  if( i == 0)
                  {
                      firstName = data;
                  }
                  if( i == 1)
                  {
                      middleName = data;
                  }
                  if(i == 2)
                  {
                      lastName =  data;
                  }
                  if(data.equals(idToString))
                  {
                      flag = 1;
                      check = true;
                      break;
                  }
                  i++;
            }
            reader.close();
        }
        catch (Exception e) 
        {
             check = false;
        }
        if(flag == 1)
        {
            check = true;
        }
        return check;
    }
    public void getFileName(int id)
    {
        String fileName =  "";
        try
        {
            FileReader fileReader = new FileReader("Username.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String data = "";
            boolean check = false;
            while((data = reader.readLine()) != null)
            {
                data =  data+".txt";
                check = checkUserID(id, data);
                if(check == true)
                {
                     fileName = data;
                     break;
                }
            }
            if(check)
            {
                System.out.println("Name is Correct than Continous :: " + firstName + " " + middleName + " " + lastName);
                System.out.println("Its Correct to type (Yes / No)");
                String str = registration.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    System.out.println("");
                    System.out.println("");
                    EditData ed = new EditData();
                    ed.editDataChoice(fileName, 1);
                }
                else
                {
                    System.out.println("You want  to try again (Yes / No) ");
                    System.out.println("Enter Choice :: ");
                    str = registration.inputString();
                    str = str.toUpperCase().trim();
                    if(str.equals("YES"))
                    {
                        findFileName();
                     }
                    else
                    {
                        AfterAdminLogin login = new AfterAdminLogin();
                        login.adminChoices();
                    }
                }
            }
            else
            {
                System.out.println("ID is not Available you want to try Again (Yes / No)");
                String str = registration.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                     findFileName();
                }
                else
                {
                    AfterAdminLogin login = new AfterAdminLogin();
                    login.adminChoices();
                }
            }
            reader.close();
        }
        catch (Exception e) 
        {
        }
    }
    public void findFileName()
    {
        System.out.println("Enter User ID :: ");
        userID = registration.integerBug();
        getFileName(userID);
    }
    
}
