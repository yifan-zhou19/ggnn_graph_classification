package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		String f = new String(new char[252]);
		String g = new String(new char[252]);
		int i;
		int c;
		int d;
		int t = 0;
		int n = 0;
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
		c = a.length();
		d = b.length();
		 if (c > d)
		 {
			f = a;
			a = b;
			b = f;
			i = c;
			c = d;
			d = i;
		 }
		for (i = 0;i < c;i++)
		{
			f = tangible.StringFunctions.changeCharacter(f, i, (a.charAt(c - 1 - i) - '0' + b.charAt(d - 1 - i) - '0' + t) % 10 + '0');
			t = (a.charAt(c - 1 - i) - '0' + b.charAt(d - 1 - i) - '0' + t) / 10;
		}
		n = c;
		if (c == d && t == 1)
		{
			f = tangible.StringFunctions.changeCharacter(f, n, '1');
			n += 1;
		}
		if (c < d)
		{
			for (i = n;i < d;i++)
			{
				f = tangible.StringFunctions.changeCharacter(f, i, (b.charAt(d - 1 - i) - '0' + t) % 10 + '0');
				t = (b.charAt(d - 1 - i) - '0' + t) / 10;
			}
			n = d;
			if (t == 1)
			{
				f = tangible.StringFunctions.changeCharacter(f, n, '1');
				n += 1;
			}
		}
		if (f.charAt(n - 1) == '0' && n != 1)
		{
			for (i = n - 2;f.charAt(i) == '0';i--)
			{
				;
			}
			n = i + 1;
		}
		for (i = 0;i < n;i++)
		{
			g = tangible.StringFunctions.changeCharacter(g, i, f.charAt(n - 1 - i));
		}
		g = tangible.StringFunctions.changeCharacter(g, n, '\0');
		System.out.printf("%s\n",g);
		return 0;
	}
}

