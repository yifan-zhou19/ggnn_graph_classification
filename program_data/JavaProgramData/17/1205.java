import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[101]);
	public static char[] a = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static int[] leftpos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int leftnum = 0;

	public static void function(int pos)
	{
		if (pos == c.length())
		{
			a[pos] = '\0';
			System.out.print(c);
			System.out.print("\n");
			System.out.print(a);
			System.out.print("\n");
			return;
		}
		if (c.charAt(pos) == '(')
		{
			leftpos[leftnum] = pos;
			a[pos] = '$';
			leftnum += 1;
			function(pos + 1);
		}
		else
		{
			if (c.charAt(pos) == ')')
			{
				if (leftnum == 0)
				{
					a[pos] = '?';
					function(pos + 1);
				}
				else
				{
					a[pos] = ' ';
					leftnum -= 1;
					a[leftpos[leftnum]] = ' ';
					function(pos + 1);
				}
			}
			else
			{
				a[pos] = ' ';
				function(pos + 1);
			}
		}
	}


	public static int Main()
	{
		for (; c = new Scanner(System.in).nextLine();)
		{
			function(0);
			leftnum = 0;
			for (int i = 0; i < 101; i++)
			{
				leftpos[i] = 0;
			}
		}
		return 0;
	}


}
