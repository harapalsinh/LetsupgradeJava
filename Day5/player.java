package Day5;
import java.util.Scanner;

public class player {
	
	Scanner sc=new Scanner(System.in);
    String Name;
    int score=0;

    public void GetDetails()
    {
        System.out.println("Enter Your name");
        Name=sc.next();
    }

}
