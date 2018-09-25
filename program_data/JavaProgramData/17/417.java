import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void kuohao(String c)
	{
		int i;
		int j;
		int n;
		for (n = 0; !c[n].equals('\0');n++)
		{
			; //???????
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (c[i].equals('('))
			{
				for (j = i + 1; !c[j].equals('\0');j++)
				{
					if (c[j].equals(')'))
					{
						c[i] = c[j] = ' ';
						break;
					}
				}
				if (c[j].equals('\0')) //??????????????????????$
				{
					c[i] = '$';
				}
				kuohao(c); //????
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
		kuohao(c);
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

