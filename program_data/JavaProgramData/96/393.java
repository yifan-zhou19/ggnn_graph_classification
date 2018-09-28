package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int c;
		int d;
		int e;
		int i;
		int u;
		int v;
		int w;
		int x;
		int y;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.charAt(n) != null)
		{
		n = n + 1;
		}
		if (n >= 3)
		{
			u = a.charAt(0) - '0';
			v = a.charAt(1) - '0';
			w = u * 10 + v;
			if (w <= 12)
			{
				u = 3;
				v = a.charAt(1) - '0';
				w = a.charAt(2) - '0';
				v = 100 + v * 10 + w;
			}
			else
			{
				u = 2;
				v = a.charAt(0) - '0';
				w = a.charAt(1) - '0';
				v = v * 10 + w;
			}
			x = v / 13;
			y = v % 13;
			b = tangible.StringFunctions.changeCharacter(b, 0, x + '0');
			e = 0;
			for (i = u;i <= n - 1;i++)
			{
				c = a.charAt(i) - '0';
				d = y * 10 + c;
				x = d / 13;
				y = d % 13;
				e = i - u + 1;
				b = tangible.StringFunctions.changeCharacter(b, e, x + '0');
			}
			b = tangible.StringFunctions.changeCharacter(b, e+1, '\0');
			System.out.printf("%s\n",b);
			System.out.printf("%d\n",y);
		}
		else
		{
			c = a.charAt(0) - '0';
			if (n == 2)
			{
				d = a.charAt(1) - '0';
				e = c * 10 + d;
			}
			else
			{
				e = c;
			}
			x = e / 13;
			y = e % 13;
			System.out.printf("%d\n",x);
			System.out.printf("%d\n",y);
		}

		return 0;
	}
}

