package <missing>;

public class GlobalMembers
{
	public static int f(int i, int j, String a)
	{
		int p = 0;
		if ((i - j) == 1)
		{
			return 1;
		}
		else
		{
			for (int k = j + 1;k < i;k++)
			{
			if (!a[k].equals('0'))
			{
				p++;
			}
			}
		if (p == 0)
		{
			return 1;
		}
		if (p != 0)
		{
			return 0;
		}
		}
	}
	public static int Main()
	{
		String a = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char c;
		char d;
		int m = 0;
		c = a.charAt(0);
		for (int i = 0;i < 101;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			m++;
		}
		for (int i = 0;i < m;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				d = a.charAt(i);
			}
		}

		for (int j = 0;j < m;j++)
		{
			for (int i = 0;i < j;i++)
			{
				if (a.charAt(j) == d && a.charAt(i) == c && f(j, i, a) == 1)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '0');
					a = tangible.StringFunctions.changeCharacter(a, j, '0');
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");

				}
			}
		}
			return 0;
	}

}

