
package User.userRegister;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration 
{
//      Scanner obj = new Scanner(System.in);
      BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));
      protected String firstName, lastName, middleName, gender, birthPlace, maritalStatus, nationality, dateOfBirth, address, 
              city, country, function, department, typeOfEmployee, startDateOfEmployee, username, password;
      protected int age, zipCode;
      protected long phoneNo;
      int n = 0;
      String input = "";
      long l = 0;
      
      public String inputString()
      {
           try
           {
               input = obj.readLine();
           } catch (Exception e) 
           {
                e.printStackTrace();
            }
           return input;
      }
      
     public int integerBug()
    {
        Scanner in = new Scanner(System.in);
        try
        {
            n = in.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Enter Proper value ::::");
            integerBug();
        }
        return n;
     }
      
      public long longBug()
    {
        Scanner in = new Scanner(System.in);
        try
        {
            l = in.nextLong();
        }
        catch(Exception e)
        {
            System.out.println("Enter Proper value ::::");
            longBug();
        }
        return l;
     }
     
      public String departmentChoice()
      {
           boolean check = true;
           String departmentChoice = "";
           while(check == true)
           {
               System.out.println("A : Marketing");
               System.out.println("B : Management");
               System.out.println("C : IT");
               System.out.println("D : Technical  Service");
               System.out.println("E : HRM");
               System.out.println("F : Mail");
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Enter your Choice :: ");
               try 
               {
                   String choice = obj.readLine();
               choice = choice.toUpperCase();
               switch(choice)
               {
                   case "A" :
                       departmentChoice = "Marketing" ; 
                       check = false;
                       break;
                   case "B" :
                       departmentChoice = "Management" ; 
                       check = false;
                       break;
                   case "C" : 
                       departmentChoice = "IT" ; 
                       check = false;
                       break;
                   case "D" :
                       departmentChoice = "Technical  Service" ; 
                       check = false;
                       break;
                   case "E" :
                       departmentChoice = "HRM" ; 
                       check = false;
                       break;
                   case "F" : 
                       departmentChoice = "Mail" ; 
                       check = false;
                       break;
                   default:
                       System.out.println("Enter Choice Between these option ..............");
                   
               }
               } 
               catch (Exception e)
               {
                   e.printStackTrace();
               }
               
           }
           return departmentChoice;
      }
      
      public String typeOfEmployeeChoice()
      {
           boolean check = true;
           String typeOfEmployeeChoice = "";
           while(check == true)
           {
               System.out.println("A : Part-time Employee");
               System.out.println("B : Intern");
               System.out.println("C : Holiday Worker");
               System.out.println("D : Permanent Position");
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Enter your Choice :: ");
               try
               {
                    String choice =  obj.readLine();   
                    choice = choice.toUpperCase();
                    switch(choice)
                   {
                       case "A" :
                            typeOfEmployeeChoice = "Part-time Employee" ; 
                            check = false;
                             break;
                   case "B" :
                       typeOfEmployeeChoice = "Intern" ; 
                       check = false;
                       break;
                   case "C" : 
                       typeOfEmployeeChoice = "Holiday Worker" ; 
                       check = false;
                       break;
                   case "D" : 
                       typeOfEmployeeChoice = "Permanent Position" ; 
                       check = false;
                       break;
                   default:
                       System.out.println("Enter Choice Between (A,B,C,D) ..............");
                  } 
               }
               catch (Exception e) 
               {
                   e.printStackTrace();
                   
               }
               
              
           }
           return typeOfEmployeeChoice;
      }
      
      public String maritalStatusChoice()
      {
           boolean check = true;
           String maritalChoiceDemo = "";
           while(check == true)
           {
               System.out.println("S : Single");
               System.out.println("C : Cohabitation");
               System.out.println("M : Married");
               System.out.println("R : Registered Partnership");
               System.out.println("H : Have Been Married Before");
               System.out.println("W : Widow");
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Enter your Choice :: ");
               try 
               {
                      String choice = obj.readLine();
                      choice = choice.toUpperCase();
                      switch(choice)
                     {
                        case "S" :
                             maritalChoiceDemo = "Single" ; 
                             check = false;
                              break;
                   case "C" :
                       maritalChoiceDemo = "Cohabitation" ; 
                       check = false;
                       break;
                   case "M" : 
                       maritalChoiceDemo = "Married" ; 
                       check = false;
                       break;
                   case "R" :
                       maritalChoiceDemo = "Registered Partnership" ; 
                       check = false;
                       break;
                   case "H" :
                       maritalChoiceDemo = "Have Been Married Before" ; 
                       check = false;
                       break;
                   case "W" : 
                       maritalChoiceDemo = "Widow" ; 
                       check = false;
                       break;
                   default:
                       System.out.println("Enter Choice Between these option ..............");
                   
               }
                   
               } catch (Exception e) 
               {
                   e.printStackTrace();
               }
               
           }
           return maritalChoiceDemo;
      }
      
      
      public String genderChoice()
      {
           boolean check = true;
           String genderChoiceDemo = "";
           while(check == true)
           {
               System.out.println("M : Male");
               System.out.println("F : Female");
               System.out.println("C : Custom");
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Enter your Choice :: ");
               try
               {
                   String choice = obj.readLine();
               choice = choice.toUpperCase();
               switch(choice)
               {
                   case "M" :
                       genderChoiceDemo = "Male" ; 
                       check = false;
                       break;
                   case "F" :
                       genderChoiceDemo = "Female" ; 
                       check = false;
                       break;
                   case "C" : 
                       genderChoiceDemo = "Custom" ; 
                       check = false;
                       break;
                   default:
                       System.out.println("Enter Choice Between (M,F,C) ..............");
               }
               } catch (Exception e) 
               {
                   e.printStackTrace();
               }
               
           }
           return genderChoiceDemo;
      }
      
      public void Employeeregistration()
      {
          try{
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter First Name :: ");
//          firstName = obj.readLine();
          firstName = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Middle Name :: ");
//          middleName = obj.readLine();
          middleName = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Last Name :: ");
//          lastName = obj.readLine();
          lastName = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Gender :: ");
          gender = genderChoice();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Age :: ");
          age = integerBug();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Birth Place :: ");
          
          birthPlace = inputString();
          
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Marital Status :: ");
          maritalStatus = maritalStatusChoice();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Nationality :: ");
//          nationality = obj.readLine();
          nationality = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Date of Birth :: ");
//          dateOfBirth = obj.readLine();
          dateOfBirth = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Address :: ");
//          address = obj.readLine();
          address = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter City :: ");
//          city = obj.readLine();
          city = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Zip Code :: ");
          zipCode = integerBug();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Country :: ");
//          country = obj.readLine();
          country = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Mobile Number :: ");
          phoneNo = longBug();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Function :: ");
//          function = obj.readLine();
          function = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Department :: ");
          department = departmentChoice();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Type of Employee :: ");
          typeOfEmployee = typeOfEmployeeChoice();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Joining Date :: ");
//          startDateOfEmployee = obj.readLine();
          startDateOfEmployee = inputString();
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Enter Information properly .............");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println("Enter Username :: ");
//          username = obj.readLine();
           username = inputString();
          System.out.println("Enter Password :: ");
//          password = obj.readLine();
          password = inputString();
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          StoreEmployeeData seData = new StoreEmployeeData();
          seData.data(firstName, lastName, middleName, gender, age, birthPlace, maritalStatus, nationality, dateOfBirth,
                  address, city, zipCode, country, phoneNo, function, department, typeOfEmployee, 
                  startDateOfEmployee, username, password);
      
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
      }
}
