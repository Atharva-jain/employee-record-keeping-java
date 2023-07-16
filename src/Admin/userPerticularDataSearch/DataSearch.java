 
package Admin.userPerticularDataSearch;
import Admin.AfterAdminLogin;
import User.userRegister.Registration;
import java.io.BufferedReader;
import java.io.FileReader;
import User.userShowData.DisplayData;
public class DataSearch 
{
    Registration registration = new Registration();
     public boolean searchFileName(String fileName , int id)
     {
         boolean check = false;
         try
         {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);
                String data =  "";
                String idToString = Integer.toString(id);
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(idToString))
                    {
                        check = true;
                        break;
                    }
                }
                if(check != true)
                {
                     System.out.println("ID is not Available you want to try Again (Yes / No)");
                     String str = registration.inputString();
                     str = str.toUpperCase().trim();
                     if(str.equals("YES"))
                    {
                        searchData(); 
                    }
                    else
                   {
                          AfterAdminLogin login = new AfterAdminLogin();
                          login.adminChoices();
                    }
                }
         }
         catch (Exception e) 
         {
         }
         return check;
     }
     public String getFileName(int id)
     {
          String fileName =  "";
          boolean check = false;
           try 
           {
                FileReader fileReader = new FileReader("Username.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    data =  data+".txt";  
                    check = searchFileName(data, id);
                    if(check == true)
                    {
                        fileName = data;
                        break;
                    }
                }
           }
           catch (Exception e)  
           {
           }
           return fileName;
     }
     public void searchData()
     {
          System.out.println("Enter User ID to Show Details :: ");
          int id = registration.integerBug();
          String fileName = getFileName(id);
          DisplayData displayData = new DisplayData();
          displayData.showData(fileName, 2);
          AfterAdminLogin login = new AfterAdminLogin();
          login.adminChoices();
     }
    
}
