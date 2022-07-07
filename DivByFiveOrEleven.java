package basicprogram;
import java.util.*;


public class DivByFiveOrEleven
{
		public static void main ( String [] args)
		{
			int num;
			System.out.println ("enter the number");
			Scanner obj=new Scanner (System.in);
					num=obj.nextInt();
					if (num%5==0&&num%11==0)
						System.out.println(num+ "is divisable by 5 and 11");
		}
	

}
