 
package User.userRegister;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import SaveUsername.Usernames;
import java.io.FileReader;
public class StoreEmployeeData 
{ 
    public int getUserID()
    {
         int number = 0 ;
         try
         {
                FileReader fileReader = new FileReader("number.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = reader.readLine();
                number = Integer.parseInt(data);
                number = number + 1;
                reader.close();
                FileWriter writer = new FileWriter("number.txt", false);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(Integer.toString(number));
                buffWriter.close();
                
         }
         catch (Exception e) 
         {
         }
         return number;
    }
     public void data(String firstName, String lastName, String middleName, String gender, int age, String birthPlace, String maritalStatus,
              String nationality, String dateOfBirth, String address, String city, int zipCode, String country, long phoneNumber, String function, String department
              , String typeOfEmployee ,String startDateOfEmployee ,String username ,String password)
     {
           firstName = firstName.toUpperCase().trim();
           middleName = middleName.toUpperCase().trim();
           lastName = lastName.toUpperCase().trim();
           try
           {
                 FileWriter writer = new FileWriter(firstName+middleName+lastName+".txt", false);
                 BufferedWriter buffWriter = new BufferedWriter(writer);
                 buffWriter.write(firstName);
                 buffWriter.newLine();
                 buffWriter.write(middleName);
                 buffWriter.newLine();
                 buffWriter.write(lastName);
                 buffWriter.newLine();
                 buffWriter.write(gender);
                 buffWriter.newLine();
                 buffWriter.write(Integer.toString(age));
                 buffWriter.newLine();
                 buffWriter.write(birthPlace);
                 buffWriter.newLine();
                 buffWriter.write(maritalStatus);
                 buffWriter.newLine();
                 buffWriter.write(nationality);
                 buffWriter.newLine();
                 buffWriter.write(dateOfBirth);
                 buffWriter.newLine();
                 buffWriter.write(address);
                 buffWriter.newLine();
                 buffWriter.write(city);
                 buffWriter.newLine();
                 buffWriter.write(Integer.toString(zipCode));
                 buffWriter.newLine();
                 buffWriter.write(country);
                 buffWriter.newLine();
                 buffWriter.write(Long.toString(phoneNumber));
                 buffWriter.newLine();
                 buffWriter.write(function);
                 buffWriter.newLine();
                 buffWriter.write(department);
                 buffWriter.newLine();
                 buffWriter.write(typeOfEmployee);
                 buffWriter.newLine();
                 buffWriter.write(startDateOfEmployee);
                 buffWriter.newLine();
                 username = username.trim();
                 buffWriter.write(username);
                 buffWriter.newLine();
                 password = password.trim();
                 buffWriter.write(password);
                 buffWriter.newLine();
                 int ID = getUserID();
                 buffWriter.write(Integer.toString(ID));
                 buffWriter.close();
                 Usernames usernames = new Usernames();
                 usernames.saveUsernameInText(firstName+middleName+lastName);
           }
           catch (Exception e) {
         }
                
     }
}
