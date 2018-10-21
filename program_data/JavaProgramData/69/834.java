package <missing>;

public class GlobalMembers
{
	public static void c(String a, int h, String b, int k)
	{
		int i;
		int j;
		int w = 0;
		int y = 0;
		String c = new String(new char[252]);
		for (i = h - 1,j = k - 1;i >= 0;i--,j--)
		{
			if (j >= 0)
			{
			c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i] - 48 + b[j]);
			if (c.charAt(i + 1) > 57)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, c.charAt(i + 1) - 10);
				if (i == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '1');
				}
				else
				{
					a[i - 1] = a[i - 1].Substring(1);
				}
			}
			}
			else
			{
				if (a[i].compareTo(57) > 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i] - 10);
				if (i == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '1');
				}
				else
				{
					a[i - 1] = a[i - 1].Substring(1);
				}
				}
				else
				{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i]);
				}
			}
		}
		if (c.charAt(0) == '1')
		{
			for (i = 0;i < h + 1;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			System.out.print("\n");
		}
		else
		{
			for (i = 1;i < h + 1;i++)
			{
			if (c.charAt(i) != '0')
			{
				w = 1;
				y++;
			}
			if (h + 1 == 2 || y != 0)
			{
				System.out.printf("%c",c.charAt(i));
			}
			}
		System.out.print("\n");
		}

	}

	public static int Main()
	{
		int h;
		int k;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
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
		h = a.length();
		k = b.length();
		if (h >= k)
		{
			c(a, h, b, k);
		}
		else if (k > h)
		{
			c(b, k, a, h);
		}
		return 0;

	}
}

