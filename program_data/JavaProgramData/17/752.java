package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int i;
		int s;
		int j = 0;
		int c = 0;
		int d = 0;
		int l;
		int m;
		int n;
		int k = 0;
		int w;
		String str = new String(new char[100]);

		for (;;)
		{
		str = new Scanner(System.in).nextLine();
		if (feof(stdin))
		{
			break;
		}
		l = str.length();
		for (i = 0;i <= l - 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		for (i = 0;i <= l - 1;i++)
		{
		if (str.charAt(i) == '(')
		{
			a = a + 1;
			b = 1;
		}
		else if (str.charAt(i) == ')' && b == 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '?');
		}
		else if (str.charAt(i) == ')' && b == 1 && a <= 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '?');
		}
		else if (str.charAt(i) == ')' && b == 1 && a > 0)
		{
			a = a - 1;
		}
		}
		a = 0;
		b = 0;
		for (i = l - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ')')
			{
				a = a + 1;
				b = 1;
			}
		else if (str.charAt(i) == '(' && b == 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '$');
		}
		else if (str.charAt(i) == '(' && b == 1 && a <= 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '$');
		}
		else if (str.charAt(i) == '(' && b == 1 && a > 0)
		{
			a = a - 1;
		}
		}
		System.out.print("\n");
			for (i = 0;i <= l - 1;i++)
			{
				if (str.charAt(i) != '?' && str.charAt(i) != '$')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
		for (i = 0;i <= l - 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
			System.out.print("\n");
		}
	return 0;
	}
}

