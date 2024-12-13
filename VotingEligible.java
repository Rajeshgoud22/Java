import java.util.*;

public Class VotingEligible
{
public static void main(String[] args)  
{ 
System.out.print("Enter the age");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if (age >= 18)
{
System.out.println("vote to eligible");
}
else
{
System.out.println("Not eligible to vote");
}
}
}