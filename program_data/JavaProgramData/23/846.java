package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		char a;
		String e = new String(new char[100]);
		int b;
		int i;
		int d;
		int j;
		c = new Scanner(System.in).nextLine();
		b = c.length();
		for (i = 0,d = 0;i < b;i++)
		{

				if (c.charAt(i) == ' ')
				{
					d++;
				}
		}
				if (d != 0)
				{
			for (i = 0;i < b / 2;i++)
			{
			a = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(b - 1 - i));
			c = tangible.StringFunctions.changeCharacter(c, b - 1 - i, a);
			}

			for (i = 0,j = 0;i < b;i++)
			{
			if (c.charAt(i) == ' ')
			{
				e = tangible.StringFunctions.changeCharacter(e, j, i + 1);
			j++;
			}
			}
			for (j = 0;j < d - 1;j++)
			{
				for (i = e.charAt(j);i <= (e.charAt(j) + e.charAt(j + 1) - 2) / 2;i++)
				{
			a = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(e.charAt(j + 1) + e.charAt(j) - 2 - i));
			c = tangible.StringFunctions.changeCharacter(c, e.charAt(j + 1) + e.charAt(j) - 2 - i, a);
				}
			}
		for (i = 0;i < (e.charAt(0) - 1) / 2;i++)
		{
			a = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(e.charAt(0) - 1 - 1 - i));
			c = tangible.StringFunctions.changeCharacter(c, e.charAt(0) - 1 - 1 - i, a);
		}
		for (i = e.charAt(d - 1);i < (e.charAt(d - 1) + b - 1) / 2;i++)
		{
			a = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(b + e.charAt(d - 1) - 1 - i));
			c = tangible.StringFunctions.changeCharacter(c, b + e.charAt(d - 1) - 1 - i, a);
		}
		System.out.println(c);
				}
				else
				{
				System.out.println(c);
				}
	}
}

