import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int len;
	public static void f(String a)
	{
		int i;
		int j;
		len = a.length();
		for (i = len - 1;i >= 0;i--)
		{
			if (a[i].equals('('))
			{
				for (j = i + 1;j < len;j++)
				{
					if (a[j].equals(')'))
					{
						a[i] = a[j] = ' ';
						break;
					}
				}
				if (a[j].equals('\0'))
				{
					a[i] = '$';
				}
					f(a);
			}
		}

	}
	public static int Main()
	{
		final String c = "";
		int i;
		while (c = new Scanner(System.in).nextLine())
		{
			System.out.print(c);
			System.out.print("\n");
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) != '(' && c.charAt(i) != ')')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, ' '); //????????????
			}
		}
	f(c);
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == ')')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '?'); //???????????
			}
		}
		System.out.print(c);
		System.out.print("\n");
		}
		return 0;
	}

}

