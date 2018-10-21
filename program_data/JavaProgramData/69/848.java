package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[252]);
	public static String b = new String(new char[252]);
	public static String c = new String(new char[252]);
	public static int Main()
	{
		int la;
		int lb;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		j = la;
		for (i = 251;j >= 0;i--,j--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
		}
		for (;i >= 0;i--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		j = lb;
		for (i = 251;j >= 0;i--,j--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
		}
		for (;i >= 0;i--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 250;i >= 0;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, (a.charAt(i) - '0') + (b.charAt(i) - '0') + k + '0');
			if (c.charAt(i) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				k = 1;
			}
			else
			{
				k = 0;
			}
		}
		for (i = 0;c.charAt(i) == '0' && i < 250;i++)
		{
			;
		}
		for (;i < 251;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

