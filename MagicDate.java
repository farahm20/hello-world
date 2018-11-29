import javax.swing.JOptionPane;

public class MagicDate
{
    public static void main(String [] args)
    {
        int month;
        int day;
        int year;
        String input; //input that we will take using JOptionpane
        
        JOptionPane.showMessageDialog(null, "This program will deteremine whether"
                                            + " a user input date is a MAGIC date or not");

//Asking user for day
        
        input = JOptionPane.showInputDialog("Please enter the day: ");
        day = Integer.parseInt(input); //convert string into integer
//Asking user for month
        
        input = JOptionPane.showInputDialog("Please enter the month: ");
        month = Integer.parseInt(input);
//Asking user for year
        
        input = JOptionPane.showInputDialog("Please enter the year (2 digits): ");
        year = Integer.parseInt(input);
        
//if statement wil check if the date is magic        
        if((day * month) == year)
        {
            JOptionPane.showMessageDialog(null, "Congratulations you have a *MAGIC* date");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry your date has no magic");
        }
        
        System.exit(0);
    }
}
