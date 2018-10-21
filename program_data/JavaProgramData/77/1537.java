import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[100]);
	public static int match(int x)
	{

		int q;
		if (c.charAt(x) == c.charAt(0))
		{
			q = match(x + 1);
			System.out.print(x);
			System.out.print(' ');
			System.out.print(q);
			System.out.print("\n");
			return match(q + 1);
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{

		c = new Scanner(System.in).nextLine();
		match(0);
		return 0;
	}

}
