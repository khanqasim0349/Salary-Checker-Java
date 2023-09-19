import java.util.Scanner;
public class Salary
{
    public static void main(String[] args) {
        int totalSalary;
        System.out.println("Enter the number of hours :");
        Scanner scanHour=new Scanner(System.in);
        int hour=scanHour.nextInt();
        if (hour<=24 && hour>=1) {
            System.out.println("Enter hour Rate:");
            Scanner scan=new Scanner(System.in);
            int hourRate=scan.nextInt();
            if (hour<=8) {
                totalSalary=hour *hourRate;
                System.out.println("salary :"+totalSalary);
            }
            else
            {
                totalSalary=8*hourRate+(hour-8)*hourRate*2;
                System.out.println("Total salary is :"+totalSalary);
            }
            
        }
        else
        System.out.println("Invalid input");
    }
}