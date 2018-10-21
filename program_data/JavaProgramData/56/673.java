package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int s;
		int b;
		int c;
		int q;
		int w;
		int e;
		int r;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 1;
		c = 0;
		while (a / b > 0)
		{
			b = b * 10;
		c = c + 1;
		}
		if (c == 5)
		{
			q = a / 10000;
			w = (a - q * 10000) / 1000;
			e = (a - q * 10000 - w * 1000) / 100;
			r = (a - q * 10000 - w * 1000 - e * 100) / 10;
			t = (a - q * 10000 - w * 1000 - e * 100 - r * 10);
			s = t * 10000 + r * 1000 + e * 100 + w * 10 + q;
		}
		if (c == 4)
		{
			q = a / 1000;
			w = (a - q * 1000) / 100;
			e = (a - q * 1000 - w * 100) / 10;
			r = (a - q * 1000 - w * 100 - e * 10);
			s = r * 1000 + e * 100 + w * 10 + q;
		}
		if (c == 3)
		{
			q = a / 100;
			w = (a - q * 100) / 10;
			e = (a - q * 100 - w * 10);
			s = e * 100 + w * 10 + q;
		}
		if (c == 2)
		{
			q = a / 10;
			w = a - q * 10;
			s = w * 10 + q;
		}
		if (c == 1)
		{
			s = a;
		}
		System.out.printf("%d\n",s);
	}
}

