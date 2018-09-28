package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		String c = new String(new char[255]);
		int i;
		int j;
		int d;
		int e;
		int f;
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
		f = a.length();
		for (i = 0;i <= f;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, 254 - i, a.charAt(f - i));
		}
		for (i = 0;i <= 253 - f;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		f = b.length();
		for (i = 0;i <= f;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, 254 - i, b.charAt(f - i));
		}
		for (i = 0;i <= 253 - f;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		f = 0;
		for (i = 253;i >= 0;i--)
		{
			d = a.charAt(i) - '0' + b.charAt(i) - '0' + f;
			e = d % 10;
			f = d / 10;
			c = tangible.StringFunctions.changeCharacter(c, i, e + '0');
		}
		c = c.substring(0, 254);
		for (i = 0;c.charAt(i) == '0';)
		{
			for (j = 0;j < 254;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
			}
		}
		if (c.length() == 0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.printf("%s",c);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

