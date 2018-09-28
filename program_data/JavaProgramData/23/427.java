package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int i = 1;
		int z;
		while (true)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
			if (c.charAt(i) == '\n')
			{
				break;
			}
			i = i + 1;
		}
		int m;
		int n;
		n = i - 1;
		for (m = i - 2;m >= 1;m--)
		{
			if (c.charAt(m) == ' ')
			{
				for (z = m + 1;z <= n;z++)
				{
					System.out.print(c.charAt(z));
				}
				System.out.print(" ");
				n = m - 1;
			}
			else if (m == 1)
			{
				for (z = m;z <= n;z++)
				{
					System.out.print(c.charAt(z));
				}

			}

		}


		return 0;
	}
}

