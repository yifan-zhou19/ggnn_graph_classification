package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int k;
		String z = new String(new char[500]);
		String x = new String(new char[500]);
		String y = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		a = x.length();
		b = y.length();
		if (a >= b)
		{
			for (i = 0,k = 0;i < b;i++)
			{
				z = tangible.StringFunctions.changeCharacter(z, a - 1 - i, x.charAt(a - 1 - i) + y.charAt(b - 1 - i) + k - 48);
				if (z.charAt(a - 1 - i) > '9')
				{
					z = tangible.StringFunctions.changeCharacter(z, a - 1 - i, z.charAt(a - 1 - i) - 10);
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
			for (i = 0;i < a - b;i++)
			{
				z = tangible.StringFunctions.changeCharacter(z, a - b - 1 - i, x.charAt(a - b - 1 - i) + k);
				if (z.charAt(a - b - 1 - i) > '9')
				{
					z = tangible.StringFunctions.changeCharacter(z, a - b - 1 - i, z.charAt(a - b - 1 - i) - 10);
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
			c = a;
			if (k == 1)
			{
				for (i = a;i > 0;i--)
				{
					z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i - 1));
				}
				z = tangible.StringFunctions.changeCharacter(z, 0, '1');
				c++;
			}
		}
		else
		{
			for (i = 0,k = 0;i < a;i++)
			{
				z = tangible.StringFunctions.changeCharacter(z, b - 1 - i, x.charAt(a - 1 - i) + y.charAt(b - 1 - i) + k - 48);
				if (z.charAt(b - 1 - i) > '9')
				{
					z = tangible.StringFunctions.changeCharacter(z, b - 1 - i, z.charAt(b - 1 - i) - 10);
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
			for (i = 0;i < b - a;i++)
			{
				z = tangible.StringFunctions.changeCharacter(z, b - a - 1 - i, y.charAt(b - a - 1 - i) + k);
				if (z.charAt(b - a - 1 - i) > '9')
				{
					z = tangible.StringFunctions.changeCharacter(z, b - a - 1 - i, z.charAt(b - a - 1 - i) - 10);
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
			c = b;
			if (k == 1)
			{
				for (i = b;i > 0;i--)
				{
					z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i - 1));
				}
				z = tangible.StringFunctions.changeCharacter(z, 0, '1');
				c++;
			}
		}
		for (i = 0;i < c;i++)
		{
			if (z.charAt(i) != '0')
			{
				break;
			}
			if (i == c - 1)
			{
				System.out.print("0");
				i++;
			}
		}
		for (;i < c;i++)
		{
			System.out.printf("%c",z.charAt(i));
		}
		return 0;
	}
}

