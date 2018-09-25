package <missing>;

public class GlobalMembers
{
	public static int zuok(String c, int j, int len)
	{
		int i;
		int zuo = 1;
		int you = 0;
		for (i = j + 1;i < len;i++)
		{
			if (c[i].equals('('))
			{
				zuo++;
			}
			else if (c[i].equals(')'))
			{
				you++;
			}
			if (zuo == you)
			{
				return 1;
			}
		}
		return 0;
	}
	public static int youk(String c, int j, int len)
	{
		int i;
		int you = 1;
		int zuo = 0;
		for (i = j - 1;i >= 0;i--)
		{
			if (c[i].equals('('))
			{
				zuo++;
			}
			else if (c[i].equals(')'))
			{
				you++;
			}
			if (zuo == you)
			{
				return 1;
			}
		}
		return 0;
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		System.in.read();

		int i;
		for (i = 0;i < n;i++)
		{
			String c = new String(new char[200]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			System.in.read();

			System.out.print(c);

			System.out.print("\n");

			int len = c.length();

			int j;

			for (j = 0;j < len;j++)
			{
				if (c.charAt(j) == '(')
				{
					if (zuok(c, j, len) == 0)
					{
						System.out.print('$');
					}
					else
					{
						System.out.print(" ");
					}
				}

				else if (c.charAt(j) == ')')
				{
					if (youk(c, j, len) == 0)
					{
						System.out.print('?');
					}
					else
					{
						System.out.print(' ');
					}
				}

				else
				{
					System.out.print(' ');
				}

			}
			System.out.print("\n");
		}
		return 0;
	}







}

