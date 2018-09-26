package <missing>;

public class GlobalMembers
{
	public static void min(String a)
	{
		final String b = "";
		final String c = "";
		int i = 0;
		int j;
		if (!a[0].equals('-'))
		{
			j = 0;
		for (i = 0;i < a.length();i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, a.length() - 1 - i, a[i]);
		}
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) != '0')
			{
				j = i;
				break;
			}
		}
			if (j == b.length())
			{
				c = tangible.StringFunctions.changeCharacter(c, 0, '0');
			}
			else
			{
				for (i = j;i < b.length();i++)
				{
					c = tangible.StringFunctions.changeCharacter(c, i - j, b.charAt(i));
				}
			}
		System.out.printf("%s\n",c);
		}
		else
		{
			j = 1;
		c = tangible.StringFunctions.changeCharacter(c, 0, '-');
		b = tangible.StringFunctions.changeCharacter(b, 0, '0');
		for (i = 1;i < a.length();i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a[a.length() - i]);
		}
		for (i = 1;i < b.length();i++)
		{
			if (b.charAt(i) != '0')
			{
				j = i;
				break;
			}
		}
		for (i = j;i < b.length();i++)
		{
		c = tangible.StringFunctions.changeCharacter(c, i - j, b.charAt(i));
		}
		System.out.print("-");
		System.out.printf("%s\n",c);
		}
		scanf("\n");
	}
	public static void Main()
	{
		int n;
		for (n = 1;n <= 6;n++)
		{
		  final String a = "";
		  a = new Scanner(System.in).nextLine();
		  min(a);
		}
	}
}

