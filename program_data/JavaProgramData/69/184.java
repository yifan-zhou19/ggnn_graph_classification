package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int len1;
		int len2;
		int min;
		int max;
		final String a = "";
		final String b = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		if (len1 == 1 && len2 == 1)
		{
			if (a.charAt(0) == '0' && b.charAt(0) == '0')
			{
				System.out.print("0");
			}
		}
		for (i = 0;;i++)
		{
			len1 = a.length();
			if (a.charAt(0) == '0')
			{
				for (i = 1;i < len1;i++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i));
				}
				a = tangible.StringFunctions.changeCharacter(a, len1 - 1, '\0');
			}
			else
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			len2 = b.length();
			if (b.charAt(0) == '0')
			{
				for (i = 1;i < len2;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i - 1, b.charAt(i));
				}
				b = tangible.StringFunctions.changeCharacter(b, len2 - 1, '\0');
			}
			else
			{
				break;
			}
		}
		if (len1 > len2)
		{
			j = 0;
			min = len2;
			max = len1;
		}
		else
		{
			j = 1;
			min = len1;
			max = len2;
		}
		for (i = 0;i < min;i++)
		{
			if (c.charAt(i) + a.charAt(len1 - i - 1) + b.charAt(len2 - i - 1) - 48 < 58)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(len1 - i - 1) + b.charAt(len2 - i - 1) - 48);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(len1 - i - 1) + b.charAt(len2 - i - 1) - 48 - 10);
				c = tangible.StringFunctions.changeCharacter(c, i + 1, 1);
			}
		}
		for (i = min;i < max;i++)
		{
			if (j == 0)
			{
				if (c.charAt(i) + a.charAt(len1 - i - 1) < 58)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(len1 - i - 1));
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(len1 - i - 1) - 10);
					c = tangible.StringFunctions.changeCharacter(c, i + 1, 1);
				}
			}
			else
			{
				if (c.charAt(i) + b.charAt(len2 - i - 1) < 58)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + b.charAt(len2 - i - 1));
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + b.charAt(len2 - i - 1) - 10);
					c = tangible.StringFunctions.changeCharacter(c, i + 1, 1);
				}
			}
		}
		len = c.length();
		if (c.charAt(len - 1) == 1)
		{
			c = tangible.StringFunctions.changeCharacter(c, len - 1, '1');
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%c",c.charAt(i));
		}
		return 0;
	}





}

