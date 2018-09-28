package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return (a > b != 0?a:b);
	}

	public static void Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		int i;
		int j;
		int la = 0;
		int lb = 0;
		int m;
		for (i = 0;i < 251;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (i = 0;;i++,la++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
				break;
			}
		}
		for (i = 0;;i++,lb++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) == '\n')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
				break;
			}
		}
		m = max(la, lb);
		for (i = 0;i < la;i++)
		{
			c.charAt(250 - i) += a.charAt(la - i - 1) - 48;
		}
		for (i = 0;i < lb;i++)
		{
			c.charAt(250 - i) += b.charAt(lb - i - 1) - 48;
		}
		for (i = 250;i > 250 - m;i--)
		{
			if (c.charAt(i) > '9')
			{
				c.charAt(i - 1) += (c.charAt(i) - 48) / 10;
				c = tangible.StringFunctions.changeCharacter(c, i, 48 + (c.charAt(i) - 48) % 10);
			}
		}
		for (i = 250 - m;i < 250;i++)
		{
			if (c.charAt(i) == '0')
			{
				continue;
			}
			for (;i < 250;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		System.out.printf("%c\n",c.charAt(250));
	}
}

