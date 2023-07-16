 
package User.userEditPersonalData;
import Admin.AfterAdminLogin;
import User.userRegister.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import User.userLogin.*;
import User.userloginAfterchoose.UserChoice;
public class EditData 
{
    Registration registration = new Registration();
    public void updateData(String fileName, String valueOfUpdate, int index)
    {
        try
        {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter("temp.txt",false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                if(i==index)
                {
                     data = data.replaceAll(data, valueOfUpdate);
                     writer.write(data);
                     writer.newLine();
                }
                else
                {
                    writer.write(data);
                    writer.newLine();
                }
                i++;
            }
            writer.close();
            reader.close();
            ForgotPassword forgotPassword = new ForgotPassword();
            forgotPassword.replaceData(fileName);
            System.out.println("SUCCESSFULLY UPDATE!!!");
          }
        catch (Exception e) 
        {
             
        }
    }
    public void editDataChoice(String fileName, int i)
    {
         
        boolean check = true;
        while(check == true)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
            System.out.println("+++++++++++++ A  :  Update your First Name +++++++++++++++++++++");
            System.out.println("+++++++++++++ B  :  Update your Middle Name  +++++++++++++++++++");
            System.out.println("+++++++++++++ C  :  Update your Last Name  +++++++++++++++++++++");
            System.out.println("+++++++++++++ D  :  Update your Gender ++++++++++++++++++++++++");
            System.out.println("+++++++++++++ E  :  Update your Age  ++++++++++++++++++++++++++");
            System.out.println("+++++++++++++ f   :   Update your BirthPlace ++++++++++++++++++++++ ");
            System.out.println("+++++++++++++ G  :   Update your Marital Status  +++++++++++++++++++");
            System.out.println("+++++++++++++ H  :   Update your Nationality +++++++++++++++++++++");
            System.out.println("+++++++++++++ I   :   Update your Date of Birth ++++++++++++++++++++");
            System.out.println("+++++++++++++ J   :   Update your Address +++++++++++++++++++++++");
            System.out.println("+++++++++++++ K  :   Update your City ++++++++++++++++++++++++++ ");
            System.out.println("+++++++++++++ L   :   Update your Zipcode ++++++++++++++++++++++++");
            System.out.println("+++++++++++++ M  :   Update your Country ++++++++++++++++++++++++");
            System.out.println("+++++++++++++ N   :   Update your Phone Number +++++++++++++++++++");
            System.out.println("+++++++++++++ O  :   Update your function ++++++++++++++++++++++++");
            System.out.println("+++++++++++++ P  :   Update your Department ++++++++++++++++++++++");
            System.out.println("+++++++++++++ Q  :   Update your Type of Employee +++++++++++++++++");
            System.out.println("+++++++++++++ R  :   Update your Username +++++++++++++++++++++++");
            System.out.println("+++++++++++++ X  :   EXIT +++++++++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++ Enter Your Choice :::: ");
            String choice =  registration.inputString();
            choice = choice.toUpperCase().trim();
            switch(choice)
            {
                case "A" :
                    System.out.println("Enter First Name :::: ");
                    String temp = registration.inputString();
                    temp = temp.toUpperCase().trim();
                    updateData(fileName, temp, 0);
                   
                    break;
                case "B" :
                    System.out.println("Enter Middle Name :::: ");
                    temp = registration.inputString();
                    temp = temp.toUpperCase().trim();
                    updateData(fileName, temp, 1);
                    
                    break;    
               case "C" :
                   System.out.println("Enter Last Name :::: ");
                    temp = registration.inputString();
                    temp = temp.toUpperCase().trim();
                    updateData(fileName, temp, 2);
                   
                    break;
               case "D" :
                   System.out.println("Choose Gender :::: ");
                    temp = registration.genderChoice();
                    temp = temp.toUpperCase().trim();
                    updateData(fileName, temp, 3);
                   
                   break;
                case "E" :
                   System.out.println("Enter Age :::: ");
                   int tmp = registration.integerBug();
                   updateData(fileName,Integer.toString(tmp), 4);
                 
                   break;
               case "F" :
                   System.out.println("Enter Birth Place :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 5);
                   
                   break;
               case "G" :
                   System.out.println("Enter Marital Status :::: ");
                   temp = registration.maritalStatusChoice();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 6);
                   
                   break;
               case "H" :
                   System.out.println("Enter Nationality :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 7);
                   
                   break;
               case "I" :
                   
                   System.out.println("Enter Date of Birth :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 8);
                   
                   break;
               case "J" :
                   
                   System.out.println("Enter Address :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 9);
                   
                   break;
               case "K" :
                   
                   System.out.println("Enter City :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 10);
                   
                   break;
               case "L" :
                    
                   System.out.println("Enter Zipcode :::: ");
                   tmp = registration.integerBug();
                   updateData(fileName, Integer.toString(tmp), 11);
                    
                   break;
               case "M" :
                   System.out.println("Enter Country :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 12);
                   
                   break;
               case "N" :
                   System.out.println("Enter Phone Number :::: ");
                   Long tp = registration.longBug();
                   updateData(fileName, Long.toString(tp), 13);
                 
                   break;
               case "O" :
                   System.out.println("Enter function :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 14);
              
                   break;
               case "P" :
                   System.out.println("Choice Department :::: ");
                   temp = registration.departmentChoice();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 15);
          
                   break;
               case "Q" :
                   System.out.println("Choice Type of Employee :::: ");
                   temp = registration.typeOfEmployeeChoice();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 16);
                   
                   break;
               case "R" :
                   System.out.println("Enter Username :::: ");
                   temp = registration.inputString();
                   temp = temp.toUpperCase().trim();
                   updateData(fileName, temp, 18);
                   
                   break;
               case "X":
                   check = false;
                   break;
               default:
                   System.out.println("Please Enter Value Between These Choice ................. ");
                      
            }
            
        }
        if(check == false  && i == 2)
        {
             UserChoice userChoice = new UserChoice();
             userChoice.choose(fileName);
        }
        else if(check == false && i == 1)
        {
            AfterAdminLogin login = new AfterAdminLogin();
            login.adminChoices();
        }
        else if(check == false && i == 1)
        {
            AfterAdminLogin login = new AfterAdminLogin();
            login.adminChoices();
        }
        
    }            
    
}
