import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int min(int a, int b)
	{
		if (a <= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int i;
		int t = 0;
		int na;
		int nb;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (a.charAt(i) == '\n')
			{
				na = i;
			}
			else
			{
				if (a.charAt(i) < 91)
				{
					a.charAt(i) += 32;
				}
			}
		}
		for (i = 0;i < 80;i++)
		{
			if (b.charAt(i) == '\n')
			{
				nb = i;
			}
			else
			{
				if (b.charAt(i) < 91)
				{
					b.charAt(i) += 32;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				System.out.print("\n");
				t = 1;
				break;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				System.out.print("\n");
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}
}
