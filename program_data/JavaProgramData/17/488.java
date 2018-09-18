import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[110]);
	public static void match(int l)
	{
		if (a.charAt(l) == '\0')
		{
			return;
		}
		int j;
		if (a.charAt(l) == ')')
		{
				for (j = l;j >= 0;j--)
				{
					if (a.charAt(j) == '(')
					{
						   a = tangible.StringFunctions.changeCharacter(a, l, ' ');
						   a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						   break;
					}
					a = tangible.StringFunctions.changeCharacter(a, l, '?');
				}
				l++;
				match(l);
		}
		else
		{
			l++;
			match(l);
		}
	}
	public static int Main()
	{
		int i;
		for (i = 0;i < 110;i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		while (a = new Scanner(System.in).nextLine())
		{
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			match(0);
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == '(')
				{
				   a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
			System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;a.charAt(i) != '\0';i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			}
		}
		return 0;
	}

}

