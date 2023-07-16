
package User.userLogin;

import User.UserSelectiveChoice;
import java.io.BufferedReader;
import java.io.FileReader;
import User.userRegister.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class ForgotPassword
{
    Registration registration = new Registration();
    Scanner obj = new Scanner(System.in);
    
    public void replaceData(String fileName)
    {
        try
        {
            FileReader fileReader = new FileReader("temp.txt");
            FileWriter fileWriter = new FileWriter(fileName,false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
                i++;
            }
            writer.close();
            reader.close();
        }
        catch (Exception e) 
        {
           
        }
    }
    
    public void replacePassword(String fileName, String password)
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
                if(i==19)
                {
                     data = data.replaceAll(data, password);
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
            replaceData(fileName);
        }
        catch (Exception e) 
        {
            
        }
    }
    
    public boolean checkValid(String fileName)
    {
        String first = "" , phone = "", username = "";
        System.out.println("Enter First Name(First Name Only :: ");
        String firstName = registration.inputString();
        firstName = firstName.toUpperCase().trim();
        System.out.println("Enter Phone No(You are fill up in Registrasion) :: ");
        Long phoneNo = registration.longBug();
        System.out.println("Enter Username :: ");
        String Username = registration.inputString();
        Username = Username.trim();
        try
        {
               FileReader fileReader = new FileReader(fileName);
               BufferedReader reader = new BufferedReader(fileReader);
               String data = "";
               int i = 0;
               while((data = reader.readLine()) != null)
               {
                    if(i == 0 )
                    {
                        first = data;
                    }
                    if(i == 13)
                    {
                        phone = data;
                    }
                    if(i == 18)
                    {
                        username = data;
                    }
                    i++;
               }
               if(firstName.equals(first)  && phone.equals(Long.toString(phoneNo)) && Username.equals(username))
               {
                   System.out.println("Enter New Password :: ");
                   String password =  registration.inputString();
                   replacePassword(fileName, password);
                   return true;
               }
               else
               {
                   System.out.println("Invalid Information you want to try Again (Yes / No) :: ");
                   String str1 = registration.inputString();
                   str1 = str1.toUpperCase().trim();
                   if(str1.equals("YES"))
                   {
                       checkValid(fileName);
                   }
                   else
                   {
                       
                   }
                    
               }
               reader.close();
             
        } 
        catch (Exception e) 
        {
            UserSelectiveChoice usc = new UserSelectiveChoice();
            usc.userChoices();
            
        }
        
        return false;
    }
    public void forgot(String fileName)
    {
          try 
          {
               boolean check = checkValid(fileName);
               if(check)
               {
                    System.out.println("Password Chaged Successfully ...............");
                    UserSelectiveChoice usc = new UserSelectiveChoice();
                    usc.userChoices();
               }
               else
               {
                    System.out.println("Password are NOT Changed !! ...............");
                    System.out.println("Invalid Information you want to try Again (Yes / No) :: ");
                    String str1 = registration.inputString();
                    str1 = str1.toUpperCase().trim();
                    if(str1.equals("YES"))
                    {
                         forgot(fileName);
                    }
                    else
                    {
                        UserSelectiveChoice usc = new UserSelectiveChoice();
                        usc.userChoices();
                    }
               }
          } 
         catch (Exception e) 
         {
           
         }
    }
    
}
