

import java.util.*;

class Tax 
{
    public static void main(String  []args) 
{
        double sal, tax;
        Scanner sc = new Scanner(System.in);
        {
        System.out.println("Enter salary:");
        sal = sc.nextDouble();

        if (sal < 20000) {
            System.out.println("No Tax");
        } else if (sal <= 40000) {
            tax = sal/100 * 9;
            System.out.println("Tax amount=" + tax);
            sal = sal - tax;
            System.out.println("Final amount=" + sal);
        } else if (sal <= 70000) {
            tax = sal/100 * 16;
            System.out.println("Tax amount=" + tax);
            sal = sal - tax;
            System.out.println("Final amount=" + sal);
        } else if (sal <= 90000) {
            tax = sal/100 * 20;
            System.out.println("Tax amount=" + tax);
            sal = sal - tax;
            System.out.println("Final amount=" + sal);
        } else if (sal <= 100000) {
            tax = sal/100 * 25;
            System.out.println("Tax amount=" + tax);
            sal = sal - tax;
            System.out.println("Final amount=" + sal);
        } else if (sal > 100000) {
            tax = sal/100 * 27;
            System.out.println("Tax amount=" + tax);
            sal = sal - tax;
            System.out.println("Final amount=" + sal);
        }

    }
}
}