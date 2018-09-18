import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int s;
	public static String a = new String(new char[101]);
	public static void f(int x)
	{
		a = tangible.StringFunctions.changeCharacter(a, x, '$');
		if (x < s - 1)
		{
		for (int j = x + 1;j < s;j++)
		{
			if (a.charAt(j) == '(')
			{
					i = j;
					f(j);
			}
			else if (a.charAt(j) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, x, ' ',a[j] = ' ');
				return;
			}
			else
			{
				if (a.charAt(j) != '$')
				{
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
			}
		}
		}
		return;
	}
	public static int Main()
	{
		int j = 0;
		while (a = new Scanner(System.in).nextLine())
		{
			if (j != 0)
			{
				System.out.print("\n");
			}
			System.out.print(a);
			s = a.length();
			for (i = 0;i < s;i++)
			{
			if (a.charAt(i) == '(')
			{
				f(i);
			}
			else if (a.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			}
			j++;
		System.out.print("\n");
		System.out.print(a);
		}
	}
}

