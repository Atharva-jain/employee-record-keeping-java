
package Admin.userfileDeleted;
import Admin.UserModifyData.ModifyData;
import User.userRegister.Registration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class DeleteFile 
{
    ModifyData modifyData  = new ModifyData();
    Registration registration = new Registration();
    int userID;
    public void delete(String fileName)
    {
            File file = new File(fileName);
            if(file.delete())
            {
                System.out.println("File Deleted Successfully ...........");
            }
            else
            {
                System.out.println("File are not Deleted  ...........");
            }
    }
    
    public void deleteFile(String fileName, String firstName, String middleName, String lastName)
    {
        System.out.println("If Name is Correct Than Continue :: "+ firstName + " " + middleName + " " + lastName + " " );
        System.out.println("It's Correct (Yes / No)");
        String str = registration.inputString();
        str = str.toUpperCase().trim();
        if(str.equals("YES"))
        {
            delete(fileName);
        }
    }
    
    public void getFileName(int id)
    {
        String fileName = "";
        boolean check = false;
        try
        {
             FileReader fileReader = new FileReader("Username.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String data = "";
            check = false;
            while((data = reader.readLine()) != null)
            {
                data =  data+".txt";
                check = modifyData.checkUserID(id, data);
                if(check == true)
                {
                     fileName = data;
                     break;
                }
            }
            reader.close();
        }
        catch (Exception e) 
        {
        }
        if(check)
        {
            deleteFile(fileName, modifyData.firstName, modifyData.middleName, modifyData.lastName);
        }
    }
    public void findFileName()
    {
        System.out.println("Enter User ID :: ");
        userID = registration.integerBug();
        getFileName(userID);
    }
    
}
