import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j = 1;
	   String a = new String(new char[31]);
	   a = new Scanner(System.in).nextLine();
	   for (i = 0;i < 31;i++)
	   {
		   if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
		   {
			   System.out.print(a.charAt(i));
			   j = 0;
		   }
		   else
		   {
			   if (j == 0)
			   {
				   System.out.print("\n");
				   j = 1;
			   }
		   }
	   }
	   return 0;
	}





}
