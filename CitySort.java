import java.util.Scanner;

public class CitySort
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String CityName1;
        String CityName2;
        String CityName3;
        
//Strings for assorted names
        String sortedName1 = " ";
        String sortedName2 = " ";
        String sortedName3 = " ";

        // program discription    
        System.out.println("** This Porgram will sort the three given names in ascending order **");
    
        //Taking names of the city    
        System.out.println("\n\nPlease enter first city");
        CityName1 = input.nextLine();
        
        System.out.println("\n\nPlease enter second city");
        CityName2 = input.nextLine();
        
        System.out.println("\n\nPlease enter third city");
        CityName3 = input.nextLine();

        //********************************************************************************************************    
        //loop to assort in ascending order        
        if((CityName1.compareToIgnoreCase(CityName2) < 0) && (CityName1.compareToIgnoreCase(CityName3)<0) )
        {
            sortedName1 = CityName1; // storing the higher string
            
            if((CityName2.compareToIgnoreCase(CityName3) < 0) )
            {
                sortedName2 = CityName2;
                sortedName3 = CityName3;
                
            }
            else
            {
                sortedName2 = CityName3;
                sortedName3 = CityName2;
               
            }
        }
     
        else if((CityName2.compareToIgnoreCase(CityName1) < 0) && (CityName2.compareToIgnoreCase(CityName3)<0) )
        {
            sortedName1 = CityName2;
           
            if((CityName1.compareToIgnoreCase(CityName3) < 0)  )
            {
                sortedName2 = CityName1;
                sortedName3 = CityName3;
                
            }
            else
            {
                sortedName2 = CityName3;
                sortedName3 = CityName1;
            }
        }
        else if((CityName3.compareToIgnoreCase(CityName1) < 0) && (CityName3.compareToIgnoreCase(CityName2)<0) )
        {
            sortedName1 = CityName3;
            
            if((CityName2.compareToIgnoreCase(CityName1) < 0) )
            {
                sortedName2 = CityName2;
                sortedName3 = CityName1;
                
            }
            else
            {
                sortedName2 = CityName1;
                sortedName3 = CityName2;
                
            }
        }
       
        System.out.println("\n\nSorted Names\n" + sortedName1 + "\n" + sortedName2 + "\n" + sortedName3);
    
    //********************************************************************************************************    
    // converting into uppercase 
        
        String UpperCase = "\n" + sortedName1 + "\n" + sortedName2 + "\n" + sortedName3;
        System.out.println("\n\nNames converted to uppercase" + UpperCase.toUpperCase());
        
    //********************************************************************************************************    
    //displays the first 3 charachters of sortedName1      
        for (int i=0; i<3; i++)
        {
            System.out.println("Charactor " + i + " in string is: " + sortedName1.charAt(i));
        }
       
        int string1Length = sortedName1.length();//sorts the length of string
  //stinglenth will be used to display the last character of the string      
        System.out.println("Charactor " + string1Length + " in string is: " + sortedName1.charAt(string1Length-1) + "\n\n");
        
    //********************************************************************************************************    
    //displays the first 3 charachters of sortedName2      
        for (int i=0; i<3; i++)
        {
            System.out.println("Charactor " + i + " in string is: " + sortedName2.charAt(i));
        }
       
        int string2Length = sortedName2.length();//sorts the length of string
    //stinglenth will be used to display the last character of the string      
        System.out.println("Charactor " + string2Length + " in string is: " + sortedName2.charAt(string2Length-1)  + "\n\n");
    
    //********************************************************************************************************    
    //displays the first 3 charachters of sortedName3     
        for (int i=0; i<3; i++)
        {
            System.out.println("Charactor " + i + " in string is: " + sortedName3.charAt(i));
        }
       
        int string3Length = sortedName3.length();//sorts the length of string
    //stinglenth will be used to display the last character of the string      
        System.out.println("Charactor " + string3Length + " in string is: " + sortedName3.charAt(string3Length-1) + "\n\n" );
        
    //********************************************************************************************************    
    //this part of code now replaces the user given character with x
        char toReplace; //stores charcter
        String stringReplace;   //input string to get character form user
        System.out.println("\n\nPlease enter the character to replace in sorted last city : ");
        stringReplace = input.nextLine();
        toReplace = stringReplace.charAt(0);
    //loop to find the user charcter and replace it with x 
        for (int i=0; i<string3Length; i++)
        {
            if(sortedName3.charAt(i) == toReplace)
            {
           //displays the replaced character
                System.out.println("  " + sortedName3.replace(toReplace, 'x'));
            }
              
        }
    //********************************************************************************************************    
    //this part of code now finds a user given character in last city 
    
        char toFind; //stores charcter
        String stringFind;   //input string to get character form user
        System.out.println("\n\nPlease enter the character to find in sorted last city : ");
        stringFind = input.nextLine();
        toFind = stringFind.charAt(0);
        
        for (int i=0; i<string3Length; i++)
        {
            if(sortedName3.charAt(i) == toFind)
            {
           //displays the replaced character
                System.out.println("\n Found char " + toFind + " at position " + i + " of " + sortedName3);
            }
            else
            {
                System.out.println("Didn't find the character at location " + i);
            }
              
        }
      
   //********************************************************************************************************    
    
        // This part of program caluclates the sum of and average of city 1     
        int averageCity1 = 0;
        int sumCity1 = 0;
        int numOfchar1 = 0; 
        
         //adds the character sum and their index value for calculating average 
        for (int i=0; i<string1Length; i++)
        {
            numOfchar1 = i +1; // adding 1. Since for loops starts from 0. if 1 not added it will 
                                //show one character less in the total count. 
            sumCity1 += sortedName1.charAt(i); // adding char value 
   //         System.out.println("\n Sum of " + sortedName1.charAt(i) + "** " + i); 
        }    
        
        averageCity1 = sumCity1/numOfchar1;
        System.out.println("\n\nTotal num of character in city 1: " + sortedName1 + " is: " +numOfchar1);
        System.out.println("Sum of characters in city 1: " + sortedName1 + " is =  " + sumCity1);
        System.out.println("Average of characters in city 1: " + sortedName1 + " is = " + averageCity1);
    
    //********************************************************************************************************    
    //same for loop as above for calculating sum and average of city 2    
        int averageCity2 = 0;
        int sumCity2 = 0;
        int numOfchar2 = 0; 
        
        for (int i=0; i<string2Length; i++)
        {
            numOfchar2 = i+1; // adding num of char in a city name
            sumCity2 += sortedName2.charAt(i); // adding char value 
        //    System.out.println("\n Sum of " + sortedName2.charAt(i) + "** " + i); 
        }    
        
        averageCity2 = sumCity2/numOfchar2;
        System.out.println("\n\nTotal num of character in city 2: " +sortedName2 +" is: " +numOfchar2);
        System.out.println("Sum of characters in city 2: " + sortedName2 + " is =  " + sumCity2);
        System.out.println("Average of characters in city 2: " + sortedName2 + " is = " + averageCity2);

        
    //********************************************************************************************************    
    //same for loop as above for calculating sum and average of city 3
        int averageCity3 = 0;
        int sumCity3 = 0;
        int numOfchar3 = 0; 
                           
        for (int i=0; i<string3Length; i++)
        {
            numOfchar3 = i+1; // adding num of char in a city name
            sumCity3 += sortedName3.charAt(i); // adding char value 
        //    System.out.println("\n Sum of " + sortedName3.charAt(i) + "** " + i); 
        }    
        
        averageCity3 = sumCity3/numOfchar3;
        System.out.println("\n\nTotal num of character in city 3: " + sortedName3 + " is = "+numOfchar3);
        System.out.println("Sum of characters in city 3: " + sortedName3 + " is =  " + sumCity3);
        System.out.println("Average of characters in city 3: " + sortedName3 + " is = " + averageCity3);
    
        
    }
}