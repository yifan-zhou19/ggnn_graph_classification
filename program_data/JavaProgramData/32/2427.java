package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String c = new String(new char[10000]);
		int d;
		int i;
		int n;
		int j;
		int m;
		int t;
		int s;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (j = 0;j < w;j++)
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
		for (n = 1;a.charAt(n) != '\0';)
		{
		n++;
		}
		for (m = 1;b.charAt(m) != '\0';)
		{
		m++;
		}
		d = n - m;
		for (i = m - 1;i >= 0;i--)
		{
		b = tangible.StringFunctions.changeCharacter(b, i + d, b.charAt(i));
		}
		for (i = 0;i < n - m;i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = n - 1;i >= n - m;i--)
		{
			t = a.charAt(i) - b.charAt(i);
			if (t < 0)
			{
			t = 10 + a.charAt(i) - b.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
			}
			c = tangible.StringFunctions.changeCharacter(c, i, t + '0');
			s = i - 1;
			while (a.charAt(s) < '0')
			{
				a = tangible.StringFunctions.changeCharacter(a, s, a.charAt(s) + 10);
				a = tangible.StringFunctions.changeCharacter(a, s - 1, a.charAt(s - 1) - 1);
				s--;
			}
		}
		for (i = 0;i < n - m;i++)
		{
		c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
		}
	}
}

