import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[50]);
	   a = new Scanner(System.in).nextLine();
	   int i;
	   int j;
	   int k;
	   int l;
	   l = a.length();
	   for (i = 0;i < l;i++)
	   {
		 if ((a.charAt(i) > 47) && (a.charAt(i) < 58))
		 {
		   System.out.print(a.charAt(i));
		 }
		 else if ((a.charAt(i - 1) > 47) && (a.charAt(i - 1) < 58))
		 {
			  System.out.print("\n");
		 }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}

}
