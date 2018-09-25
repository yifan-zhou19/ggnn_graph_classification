package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		String c1 = new String(new char[81]);
		String c2 = new String(new char[81]);
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		for (i = 0;c1.charAt(i);i++)
		{
			if (c1.charAt(i) >= 'A' && c1.charAt(i) <= 'Z')
			{
			c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) + 32);
			}
		}
		for (i = 0;c2.charAt(i);i++)
		{
			if (c2.charAt(i) >= 'A' && c2.charAt(i) <= 'Z')
			{
			c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i) + 32);
			}
		}
		x = strcmp(c1,c2);
		if (x > 0)
		{
		System.out.print(">");
		}
		else if (x < 0)
		{
			System.out.print("<");
		}
		else
		{
		System.out.print("=");
		}
		return 0;
	}

}

