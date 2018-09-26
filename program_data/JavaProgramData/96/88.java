package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int c;
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		if (l >= 3)
		{
			if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') >= 13)
			{
				b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13 + '0');
				c = ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') % 13;
				for (i = 1;i < l - 1;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, (c * 10 + a.charAt(i + 1) - '0') / 13 + '0');
					c = (c * 10 + a.charAt(i + 1) - '0') % 13;
				}
			}
			if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') < 13)
			{
				b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + a.charAt(2) - '0') / 13 + '0');
				c = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + a.charAt(2) - '0') % 13;
				for (i = 1;i < l - 2;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, (c * 10 + a.charAt(i + 2) - '0') / 13 + '0');
					c = (c * 10 + a.charAt(i + 2) - '0') % 13;
				}
			}
		}
		if (l == 2)
		{
			b = tangible.StringFunctions.changeCharacter(b, 0, ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13 + '0');
			c = ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') % 13;
		}
		if (l == 1)
		{
			b = tangible.StringFunctions.changeCharacter(b, 0, '0');
			c = a.charAt(0) - '0';
		}
		System.out.printf("%s\n",b);
		System.out.printf("%d",c);
		System.in.read();
		System.in.read();
	}
}

