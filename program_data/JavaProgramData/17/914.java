package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int l;
	public static int t;
	public static String b = new String(new char[100]);
	public static void ff(int x)
	{
		m = x;
		for (int j = x + 1;j < l;j++)
		{
			if (b.charAt(j) == '(')
			{
				ff(j);
				break;
			}
			if (b.charAt(j) == ')')
			{
				b = tangible.StringFunctions.changeCharacter(b, m, ' ');
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				t = 1;
				break;
			}
		}
		return;
	}
	public static void f(int x)
	{
		m = 0;
		t = 0;
		for (int i = 0;i < x;i++)
		{
			if (b.charAt(i) != '(' && b.charAt(i) != ')')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			if (b.charAt(i) == '(')
			{
				ff(i);
				break;
			}
		}
		if (t == 1)
		{
			f(x);
			return;
		}
		else
		{
			for (int i = 0;i < x;i++)
			{
				if (b.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (b.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			return;
		}
	}
	public static int Main()
	{
		int k;
		int h;
		for (h = 0;h < 10;h++)
		{
			l = 0;
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(b);
			System.out.print("\n");
			l = b.length();
			f(l);
			System.out.print("\n");
	for (k = 0;k < 100;k++)
	{
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
	}

		}
		return 0;
	}
}

