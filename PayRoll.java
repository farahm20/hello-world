/**
 * Redo the payroll application from the book so that a worker gets his overtime paid according 
 * to this contract below. 
 * 
 * Let the user input the following, by using dialogs with JOptionPane, ... 
 * 1. ... how many hours he/she worked for one week 
 * 2. ... the hourly pay rate. The calculation is then done based on this contract,
 * if worked hours > 40 and ≦50 then 15% should be added to the hourly pay rate • 
 * if worked hours > 50 and ≦60 then 25% should be added to the hourly pay rate • 
 * if worked hours > 60 then 50% should be added to the hourly pay rate 
 * Display the gross pay, using a dialog, including the overtime that he/she gets for the week.
 * 
 */



import javax.swing.JOptionPane;

public class PayRoll
{
    public static void main(String [] args)
    {
        String input;
        String employeeName;
        final double fixedHour40 = 40;
        final double fixedHour10 = 10;
        double hoursLeft = 0;
		double hoursLeft2 = 0;
        double profit = 0;
		double profit2 = 0;
        int employeeHours = 0;              // hours employee worked
        double employeePayRate = 0;         // payrate entered by user
        double employeeGrossPay = 0;        // grosspay that the program will calculate
        
    //getting employee name from user    
        employeeName = JOptionPane.showInputDialog("Please enter your name: ");
    //getting employee worked hours
        input =  JOptionPane.showInputDialog("Please enter hours you worked: ");
        employeeHours = Integer.parseInt(input);
    //getting employee payrate
        input =  JOptionPane.showInputDialog("Please enter your pay rate: ");
        employeePayRate = Double.parseDouble(input);
    
    //calculating pay
        
        if(employeeHours < 40)
		{
			JOptionPane.showMessageDialog(null, " Hours should not be less than 40 ");

		}
        else if(employeeHours == 40)
        { 
            employeeGrossPay = fixedHour40 * employeePayRate;
			JOptionPane.showMessageDialog(null, "Employee " + employeeName + " worked for " + employeeHours + " hours and earned a gross pay with overtime " + employeeGrossPay);
        }
        else if (employeeHours <= 50)
        {
           employeeGrossPay = fixedHour40 * employeePayRate;
			
		   hoursLeft = employeeHours - fixedHour40;
           profit = hoursLeft * (employeePayRate * 1.15); // adding 15% profit
           employeeGrossPay += profit;
           JOptionPane.showMessageDialog(null, "Employee " + employeeName + " worked for " + employeeHours + " hours and earned a gross pay with overtime " + employeeGrossPay);
                      
        }
		else if (employeeHours <= 60)
		{
		/*
		Based on the formula given 
		Steven works 58 hours one week and the hourly pay rate is = 100 This will be:
		40 * 100 = 4000
		10 * (100*1,15) = 1150
		8 * (100*1,25) = 1000
		Gross pay including overtime in this case is : 6150
		*/
			//calculatinggrosspay without overtime	
			employeeGrossPay = fixedHour40 * employeePayRate;
			
			//calculating overtime by subtracting normal work ours from total hours
			hoursLeft = employeeHours - fixedHour40;
			hoursLeft2 = hoursLeft - fixedHour10;
			profit = fixedHour10 * (employeePayRate * 1.15); // overtime for extra 10 hours
			profit2 = hoursLeft2 * (employeePayRate * 1.25); // overtime for more than 10 hours
			
			// adding overtime to grosspay
			employeeGrossPay += profit + profit2;
			
           JOptionPane.showMessageDialog(null, "Employee " + employeeName + " worked for " + employeeHours + " hours and earned a gross pay with overtime " + employeeGrossPay);
             
		}
		else
		{
			//paywithout overtime
			employeeGrossPay = fixedHour40 * employeePayRate;
		
			//calculating overtime
			hoursLeft = employeeHours - fixedHour40;
		
			//adding 50% profit
			profit = hoursLeft * (employeePayRate * 5.0);  
		
			//adding overtime to gross pay
			employeeGrossPay += profit;
            JOptionPane.showMessageDialog(null, "Employee " + employeeName + " worked for " + employeeHours + " hours and earned a gross pay with overtime " + employeeGrossPay);
            
		}
		
		System.exit(0);
     
    }
}
