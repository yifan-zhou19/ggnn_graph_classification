import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[40]);
		int i = 0;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
		   if ((a.charAt(i) - '0') >= 0 && (a.charAt(i) - '0' <= 9))
		   {
			   System.out.print(a.charAt(i));
		   }
		   else
		   {
			   if ((a.charAt(i + 1) - '0') >= 0 && (a.charAt(i + 1) - '0' <= 9))
			   {
				   System.out.print("\n");
			   }
		   }
		   i++;
		}
		return 0;
	}
}
