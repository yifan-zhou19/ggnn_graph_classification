package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String c = new String(new char[50]);
		c = tangible.StringFunctions.changeCharacter(c, 49, '1');
		for (int i = 0 ;i < 49;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (int i = 0;i < n;i++)
		{
			int t = 0;
			for (int j = 49;j > 0;j--)
			{
				c.charAt(j) += c.charAt(j) + t - '0';
				if (c.charAt(j) > '9')
				{
					c.charAt(j) -= 10;
					t = 1;
				}
				else
				{
					t = 0;
				}
			}
		}
		int i = 0;
		while (c.charAt(i) <= '0')
		{
			i++;
		}
		for (int j = i; j < 50;j++)
		{
			System.out.print(c.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

