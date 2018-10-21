package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100000000]);
	public static int n;
	public static char e;
	public static char f;
	public static int lala()
	{
		int i;
		int j;
		if (a.charAt(0) == '0')
		{
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == e)
			{
				for (j = 1;j < n - i;j++)
				{
					if (a.charAt(i + j) == '0')
					{
						continue;
					}
					else if (a.charAt(i + j) == f)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
						a = tangible.StringFunctions.changeCharacter(a, i + j, '0');
						System.out.print(i);
						System.out.print(' ');
						System.out.print(i + j);
						System.out.print("\n");
						return lala();
					}
					else if (a.charAt(i + j) == e)
					{
						break;
					}
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (int i = 1;i < n;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				f = a.charAt(i);
			}
		}
		e = a.charAt(0);
		lala();
		return 0;
	}
}

