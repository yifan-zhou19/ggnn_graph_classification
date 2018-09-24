package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "";
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			c.charAt(i)[0] = new Scanner(System.in).nextLine();
			c.charAt(i)[1] = new Scanner(System.in).nextLine();
			c.charAt(i)[2] = new Scanner(System.in).nextLine();
		}
		c.charAt(n - 1)[0] = new Scanner(System.in).nextLine();
		c.charAt(n - 1)[1] = new Scanner(System.in).nextLine();

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(c.charAt(i)[1]).length();j++)
			{
				c.charAt(i)[3][j + String.valueOf(c.charAt(i)[0]).length() - String.valueOf(c.charAt(i)[1]).length()] = c.charAt(i)[1][j];
			}
			for (j = 0;j < (String.valueOf(c.charAt(i)[0]).length() - String.valueOf(c.charAt(i)[1]).length());j++)
			{
				c.charAt(i)[3][j] = '0';
			}
			for (j = (String.valueOf(c.charAt(i)[0]).length() - 1);j >= 0;j--)
			{
				if (c.charAt(i)[0][j] >= c.charAt(i)[3][j])
				{
					c.charAt(i)[0][j] = c.charAt(i)[0][j] - c.charAt(i)[3][j] + 48;
				}
				else
				{
					c.charAt(i)[0][j] = 58 - (c.charAt(i)[3][j] - c.charAt(i)[0][j]);
					for (k = j - 1;k >= 0;k--)
					{
						if (c.charAt(i)[0][k] != '0')
						{
							c.charAt(i)[0][k] = c.charAt(i)[0][k] - 1;
							break;
						}
						else
						{
							c.charAt(i)[0][k] = '9';
						}
					}
				}
			}
			System.out.printf("%s\n",c.charAt(i)[0]);

		}
		return 0;
	}
}

