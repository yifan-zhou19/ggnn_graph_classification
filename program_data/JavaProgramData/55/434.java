package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		char e = 'a';
		int a;
		int b;
		int m;
		int k;
		int s = 0;
		int p;
		int q;
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		m = c.length();
		while (c.charAt(i) != 0)
		{
			if ('A' <= c.charAt(i) && c.charAt(i) <= 'Z')
			{
				c.charAt(i) += 'a'-'A';
			}
			i++;
		}
		for (i = 0;i < m;i++)
		{
			if (a <= 10)
			{
			k = c.charAt(i) - 48;
			}
			else
			{
				if (48 <= c.charAt(i) && c.charAt(i) <= 57)
				{
					k = c.charAt(i) - 48;
				}
				else
				{
					k = 9;
					while (e <= c.charAt(i))
					{
						k = k++;
						e++;
					}
				}
			}

			for (j = 1;j < (m - i);j++)
			{
				k = k * a;
			}
			s = s + k;
			e = 'a';
		}
		i = 0;
		e = 'A';
		if (s == 0)
		{
		System.out.print("0");
		}
		else
		{
			while (s > 0)
			{
			p = s / b;
			q = s % b;
			s = p;
			if (0 <= q != 0 && q <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, q + 48);
			}
			else
			{
				for (j = 10;j <= q;j++)
				{
					d = tangible.StringFunctions.changeCharacter(d, i, e);
					e++;
				}
			}
			i++;
			e = 'A';
			}
		i--;
		for (;i >= 0;i--)
		{
		System.out.printf("%c",d.charAt(i));
		}
		}
	}
}

