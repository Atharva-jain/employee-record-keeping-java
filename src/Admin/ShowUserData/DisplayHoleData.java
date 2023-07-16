
package Admin.ShowUserData;

import Admin.AfterAdminLogin;
import java.io.BufferedReader;
import java.io.FileReader;
import User.userShowData.DisplayData;
import java.nio.Buffer;

public class DisplayHoleData 
{
      public void display(String fileName)
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
                 
                    }
                     if(i == 1)
                     {
                         System.out.println(" +  Middle Name :  " + data + "   +");
                  
                     }
                     if(i == 2)
                     {
                         System.out.println(" + Last Name :  " + data + "   +");
                   
                     }
                     if(i == 3)
                     {
                         System.out.println(" +  Gender :  " + data + "   +");
                    
                     }
                     if(i == 4)
                     {
                         System.out.println(" +  Age :  " + data + "   +");
                     
                     }
                     if(i == 5)
                     {
                         System.out.println(" +  Birth Place :  " + data + "   +");
                      
                     }
                       
                     if(i == 6)
                     {
                         System.out.println(" +  Marital Status :  " + data + "   +");
                       
                     }
                     if(i == 7)
                     {
                         System.out.println(" +  Nationality :  " + data + "   +");
                        
                     }
                     if(i == 8)
                     {
                         System.out.println(" +  Date of Birth :  " + data + "   +");
                         
                     }
                     if(i == 9)
                     {
                         System.out.println(" +  Address :  " + data + "   +");
                          
                     }
                     if(i == 10)
                     {
                         System.out.println(" +  City  :  " + data + "   +");
                          
                     }
                     if(i == 11)
                     {
                         System.out.println(" +  Zipcode :  " + data + "   +");
                          
                     }
                     if(i == 12)
                     {
                         System.out.println(" +  Country :  " + data + "   +");
                          
                     }
                     if(i == 13)
                     {
                         System.out.println(" + Phone Number  :  " + data + "   +");
                          
                     }
                     if(i == 14)
                     {
                         System.out.println(" + Function  :  " + data + "   +");
                          
                     }
                     if(i == 15)
                     {
                         System.out.println(" + Department  :  " + data + "   +");
                          
                     }
                     if(i == 16)
                     {
                         System.out.println(" + Type of Employee  :  " + data + "   +");
                          
                     }
                     if(i == 17)
                     {
                         System.out.println(" + Date of joining :  " + data + "   +");
                          
                     }
                     if(i == 18)
                     {
                         System.out.println(" + Username  :  " + data + "   +");
                          
                     }
                     if( i == 20)
                     {
                         System.out.println(" + User ID : "+ data + "   +");
                         System.out.println(" + ------------------------------------------- +");
                     }
                     
                     i++;
                }  
          }
          catch (Exception e) 
          {
          }
      }
      public void getUsernameFromFile()
      {
           
           try
           {
                  FileReader fileReader = new FileReader("Username.txt");
                  BufferedReader reader = new BufferedReader(fileReader);
                  String data =  "" ;
                  while((data = reader.readLine()) != null)
                  {
                       
                       display(data+".txt");
                       System.out.println("----------------XXXXXXXX--------------");
                  }
                  AfterAdminLogin login = new AfterAdminLogin();
                  login.adminChoices();
           }
          catch (Exception e) {
          }
      }
    
}
