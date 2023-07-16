package User.userShowData;

import Admin.AfterAdminLogin;
import User.userloginAfterchoose.UserChoice;
import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayData 
{
      public void showData(String fileName, int index)
      {
           try
           {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                int i =0;
                System.out.println(" + ------------------------------------------- +");
                while((data = reader.readLine()) != null)
                {
                    if(i==0)
                    {
                        System.out.println(" +  First Name :  " + data + "   +");
                        System.out.println(" + ------------------------------------------- +");
                    }
                     if(i == 1)
                     {
                         System.out.println(" +  Middle Name :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 2)
                     {
                         System.out.println(" + Last Name :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 3)
                     {
                         System.out.println(" +  Gender :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 4)
                     {
                         System.out.println(" +  Age :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 5)
                     {
                         System.out.println(" +  Birth Place :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                       
                     if(i == 6)
                     {
                         System.out.println(" +  Marital Status :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 7)
                     {
                         System.out.println(" +  Nationality :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 8)
                     {
                         System.out.println(" +  Date of Birth :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 9)
                     {
                         System.out.println(" +  Address :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 10)
                     {
                         System.out.println(" +  City  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 11)
                     {
                         System.out.println(" +  Zipcode :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 12)
                     {
                         System.out.println(" +  Country :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 13)
                     {
                         System.out.println(" + Phone Number  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 14)
                     {
                         System.out.println(" + Function  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 15)
                     {
                         System.out.println(" + Department  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 16)
                     {
                         System.out.println(" + Type of Employee  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 17)
                     {
                         System.out.println(" + Date of joining :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if(i == 18)
                     {
                         System.out.println(" + Username  :  " + data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     if( i == 20)
                     {
                         System.out.println(" + User ID : "+ data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     i++;
                }
                if(index == 1)
                {
                    UserChoice userChoice = new UserChoice();
                    userChoice.choose(fileName);
                }
                if(index == 2)
                {
                    AfterAdminLogin login = new AfterAdminLogin();
                    login.adminChoices();
                }
           }
           catch (Exception e) 
           {
               
           }
      }
}
