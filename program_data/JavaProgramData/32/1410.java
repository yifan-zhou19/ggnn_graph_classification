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
			c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i].Substring(48) - b[j]);
			if (c.charAt(i + 1) < 48)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, c.charAt(i + 1) + 10);
				a[i - 1] = a[i - 1] - 1;
			}
			}
			else
			{
				if (a[i].compareTo(48) < 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i].Substring(10));
				a[i - 1] = a[i - 1] - 1;
				}
				else
				{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, a[i]);
				}
			}
		}

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

	public static int Main()
	{
		int h;
		int k;
		int n;
		int i;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
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
		}
		return 0;

	}
}

