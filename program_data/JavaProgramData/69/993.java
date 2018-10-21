package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		String d = new String(new char[250]);
		String e = new String(new char[250]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = a.length() - 1;i >= 0;i--)
		{
		c = tangible.StringFunctions.changeCharacter(c, a.length() - 1 - i, a.charAt(i) - '0');
		}
		for (i = b.length() - 1;i >= 0;i--)
		{
		d = tangible.StringFunctions.changeCharacter(d, b.length() - 1 - i, b.charAt(i) - '0');
		}
		int big;
		int sma;
		big = a.length() >= b.length()?a.length():b.length();
		sma = a.length() <= b.length()?a.length():b.length();
		e = tangible.StringFunctions.changeCharacter(e, 0, (c.charAt(0) + d.charAt(0)));
		for (i = 1;i <= big - 1;i++)
		{
		if (i <= sma - 1)
		{
		e = tangible.StringFunctions.changeCharacter(e, i, (c.charAt(i) + d.charAt(i) + e.charAt(i - 1) / 10));
		}
		else
		{
			if (a.length() >= b.length())
			{
			e = tangible.StringFunctions.changeCharacter(e, i, (c.charAt(i) + e.charAt(i - 1) / 10));
			}
			else
			{
			e = tangible.StringFunctions.changeCharacter(e, i, (d.charAt(i) + e.charAt(i - 1) / 10));
			}
		}
		}
		if (e.charAt(big - 1) != 0 || big == 1)
		{
		System.out.printf("%d",e.charAt(big - 1));
		}
		for (i = big - 2;i >= 0;i--)
		{
		System.out.printf("%d",e.charAt(i) % 10);
		}
	}

}

