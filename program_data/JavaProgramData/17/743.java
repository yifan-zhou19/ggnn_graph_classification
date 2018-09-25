package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int r;
		int n;
		int x = 0;
		int z;
	String a = new String(new char[102]);
	String b = new String(new char[102]);
	while (scanf("%c", a.charAt(1)) != EOF)
	{
		i = 1;
		while (a.charAt(i) != '\n')
		{
			i++;
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
		}
		for (n = 1;n <= i - 1;n++)
		{
			System.out.printf("%c",a.charAt(n));
		}
		System.out.print("\n");
		x = 0;
		for (n = 1;n <= i - 1;n++)
		{
				b = tangible.StringFunctions.changeCharacter(b, n, ' ');
				if (a.charAt(n) == ')' && x == 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, n, '?');
				}
				if (a.charAt(n) == '(')
				{
					x = x + 1;
				}
				if (a.charAt(n) == ')' && x != 0)
				{
					x = x - 1;
				}

		}
		x = 0;
		for (n = i - 1;n >= 1;n--)
		{
				if (a.charAt(n) == ')')
				{
					x = x + 1;
				}
				if (a.charAt(n) == '(' && x == 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, n, 36);
				}
				if (a.charAt(n) == '(' && x != 0)
				{
					x = x - 1;
				}


		}
		for (z = 1;z <= i - 1;z++)
		{
			System.out.printf("%c",b.charAt(z));
		}
		System.out.print("\n");
		for (r = 1;r <= i;r++)
		{
			b = tangible.StringFunctions.changeCharacter(b, r, '\0');
		}
	}
	}
}

