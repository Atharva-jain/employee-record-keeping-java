
package SaveUsername;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Usernames 
{
    public void saveUsernameInText(String fileName)
    {
          try
          {
               FileWriter fileWriter = new FileWriter("Username.txt", true);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               writer.newLine();
               writer.write(fileName);
               writer.close();
              
          } catch (Exception e) 
          {
              e.printStackTrace();
          }
    }
    
}
