package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int o;
		int p;
		int q;
		int r;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a / 10 == 0)
		{
			System.out.printf("%d",a);
		}
		else if (a / 100 == 0)
		{
			b = a / 10;
			c = a - 10 * b;
			d = b + c * 10;
			System.out.printf("%d",d);
		}
		else if (a / 1000 == 0)
		{
			e = a / 100;
			f = (a - 100 * e) / 10;
			g = a - 100 * e-10 * f;
			h = g * 100 + f * 10 + e;
			System.out.printf("%d",h);
		}
		else if (a / 10000 == 0)
		{
			i = a / 1000;
			j = (a - 1000 * i) / 100;
			k = (a - 1000 * i - 100 * j) / 10;
			l = a - 1000 * i - 100 * j - 10 * k;
			m = l * 1000 + k * 100 + j * 10 + i;
			System.out.printf("%d",m);
		}
		else
		{
			n = a / 10000;
			o = (a - 10000 * n) / 1000;
			p = (a - 10000 * n - 1000 * o) / 100;
			q = (a - 10000 * n - 1000 * o - 100 * p) / 10;
			r = a - 10000 * n - 1000 * o - 100 * p - 10 * q;
			s = 10000 * r + 1000 * q + 100 * p + 10 * o + n;
			System.out.printf("%d",s);
		}
		return 0;
	}
}

