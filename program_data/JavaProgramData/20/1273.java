package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[15]);
		int i;
		int m;
		int n;
		while (scanf("%s%s",a,b) != EOF)
		{
			n = a.length();
			m = 0;
			for (i = 1;i < n;i++)
			{
				if (a.charAt(i) > a.charAt(m))
				{
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, m + 1, b.charAt(0));
			c = tangible.StringFunctions.changeCharacter(c, m + 2, b.charAt(1));
			c = tangible.StringFunctions.changeCharacter(c, m + 3, b.charAt(2));
			for (i = m + 1;i < n;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, 3 + i, a.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, 3 + n, '\0');
			System.out.printf("%s\n",c);
		}
		return 0;
	}
}

