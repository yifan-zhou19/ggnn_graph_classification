package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		final String answer = "";
		final String c = "";
		int n;
		int m;
		int i;
		int j;
		int jinwei = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (m = 0;;m++)
		{
			if (b.charAt(m) == '\0')
			{
				break;
			}
		}
		for (n = 0;;n++)
		{
			if (a.charAt(n) == '\0')
			{
				break;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, n - 1 - i, a.charAt(i));
		}
		for (i = 0;i <= n - 1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i));
		}
		for (i = 0;i <= n - 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, n - 1 - i, '0');
		}
		for (i = 0;i <= m - 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, m - 1 - i, b.charAt(i));
		}
		for (i = 0;i <= m - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, c.charAt(i));
		}
		for (i = 0;i <= m - 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, m - 1 - i, '0');
		}
		for (i = 0;i <= 299;i++)
		{
			answer = tangible.StringFunctions.changeCharacter(answer, i, '0');
		}
		for (i = m;i <= 299;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = n;i <= 299;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		for (i = 0;i <= 299;i++)
		{
			if (a.charAt(i) + b.charAt(i) + jinwei - 96 <= 9 && a.charAt(i) + b.charAt(i) + jinwei - 96 >= 0)
			{
				answer = tangible.StringFunctions.changeCharacter(answer, i, a.charAt(i) + b.charAt(i) - 48 + jinwei);
				jinwei = 0;
			}
			else
			{
				if (a.charAt(i) + b.charAt(i) + jinwei - 96 >= 10)
				{
					answer = tangible.StringFunctions.changeCharacter(answer, i, a.charAt(i) + b.charAt(i) - 48 - 10 + jinwei);
					jinwei = 1;
				}
			}
		}
		for (i = 299;i >= 0;i--)
		{
			if (answer.charAt(i) != '0')
			{
				break;
			}
		}
		if (i != -1)
		{
		for (j = i;j >= 0;j--)
		{
			System.out.printf("%c",answer.charAt(j));
		}
		}
		else
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}

}

