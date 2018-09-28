package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[81]);
		String b = new String(new char[81]);
		c = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int len1;
		int len2;
		int i = 0;
		int t = 0;
		len1 = c.length();
		len2 = b.length();
		for (i = 0;i < len1;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 32);
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		t = strcmp(c,b);
		if (t == 0)
		{
			System.out.print("=\n");
		}
		else if (t == -1)
		{
			System.out.print("<\n");
		}
			else if (t == 1)
			{
			System.out.print(">\n");
			}
		return 0;


	}
}

