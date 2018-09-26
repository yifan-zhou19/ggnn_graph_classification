import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char b;
	public static char g;
	public static String a = new String(new char[100]);
	public static int len;

	public static int paidui(int n)
	{
		for (int i = n; i < len; i++)
		{
			if (a.charAt(i) == '*')
			{
				continue;
			}
			if (a.charAt(i) == b)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '*');
				int k = paidui(i + 1);
				System.out.print(i);
				System.out.print(' ');
				System.out.print(k);
				System.out.print("\n");
			}
			else if (a.charAt(i) == g)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '*');
				return i;
			}
		}
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		len = a.length();
		b = a.charAt(0);
		g = a.charAt(len - 1);
		paidui(0);

		return 0;
	}
}

