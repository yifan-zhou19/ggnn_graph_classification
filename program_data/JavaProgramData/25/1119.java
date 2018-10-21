package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[50]);
	public static String b = new String(new char[50]);
	public static void f()
	{
		int i;
		int y;
		for (i = 0; i < 50; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 49; i >= 0; i--)
		{
			y = (a.charAt(i) - '0') * 2;
			if (i > 0)
			{
				b.charAt(i - 1) += y / 10;
				b.charAt(i) += y % 10;
			}
			if (b.charAt(i) - '0' > 9)
			{
				b.charAt(i - 1)++;
				b.charAt(i) -= 10;
			}
		}
		for (i = 0; i < 50; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i));
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 50; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, 49, '2');
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else if (n == 1)
		{
			System.out.print("2");
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i < n; i++)
			{
				f();
			}
			for (i = 0; i < 50; i++)
			{
				if (a.charAt(i) != '0')
				{
					break;
				}
			}
			for (j = i; j < 50; j++)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

