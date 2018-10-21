import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int n;

	public static int xx(int k)
	{
		 int x;
		 int y;
		 x = k;
		 y = k + 1;
		 while (a.charAt(y) == a.charAt(x))
		 {
		 y = xx(y);
		 }
		 System.out.print(x);
		 System.out.print(" ");
		 System.out.print(y);
		 System.out.print("\n");
		 return y + 1;
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		n = a.length();
		int p = 0;
		while (true)
		{
			  p = xx(p);
			  if (p == n)
			  {
			  break;
			  }
		}
		return 0;
	}

}
