package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);
	public static char x;
	public static char y;
	public static int len;
	public static void find(int t)
	{
		int j;
		if (t == 2)
		{
			for (int i = 0;i < len;i++)
			{
				if (a.charAt(i) == x)
				{
					System.out.print(i);
				}
				else if (a.charAt(i) == y)
				{
					System.out.print(' ');
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		else if (t > 2)
		{
			for (int i = 0;i < len - 1;i++)
			{
				if (a.charAt(i) == x)
				{
					j = 1;
					while ((i + j < len) && (a.charAt(i + j) == ' '))
					{
						j++;
					}
					if (a.charAt(i + j) == y)
					{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(i + j);
							System.out.print("\n");
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, i + j, ' ');
							find(t - 2);
							return;
					}
				}
			}
		}
	return;
	}
	public static int Main()
	{
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		x = a.charAt(0);
		for (i = 1;i < len;i++)
		{
			if (a.charAt(i) != x)
			{
				y = a.charAt(i);
				break;
			}
		}
		find(len);
	return 0;
	}
}

