package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int d;
		int e;
		int f;
		int g;
		int h = 0;
		int k = -1;
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		String c = new String(new char[255]);
		char z;
		for (i = 0;i < 255;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'a');
			b = tangible.StringFunctions.changeCharacter(b, i, 'a');
			c = tangible.StringFunctions.changeCharacter(c, i, 'a');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		d = a.length();
		for (i = 0;i < d / 2;i++)
		{
			z = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(d - 1 - i));
			a = tangible.StringFunctions.changeCharacter(a, d - 1 - i, z);
		}
		e = b.length();
		for (i = 0;i < e / 2;i++)
		{
			z = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(e-1 - i));
			b = tangible.StringFunctions.changeCharacter(b, e-1 - i, z);
		}
		if (d < e)
		{
			f = e;
		}
		else
		{
			f = d;
		}
		for (i = 0;i < f;i++)
		{
			if (a.charAt(i) == 'a' || a.charAt(i) == '\0')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 48);
			}
			if (b.charAt(i) == 'a' || b.charAt(i) == '\0')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 48);
			}
			g = a.charAt(i) - 48 + b.charAt(i) - 48 + h;
			if (g >= 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, g - 10 + 48);
				h = 1;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, g + 48);
				h = 0;
			}
		}
		if (h == 1)
		{
			c = tangible.StringFunctions.changeCharacter(c, f, '1');
			f = f + 1;
		}
		for (i = 250;i >= 0;i--)
		{
			if (c.charAt(i) != '0' && c.charAt(i) != 'a')
			{
				k = i;
				break;
			}
		}
		if (k == -1)
		{
			System.out.print("0");
		}
		else
		{
			for (i = k;i >= 0;i--)
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		return 0;
	}
}

