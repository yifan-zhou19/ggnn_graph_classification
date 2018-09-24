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
		int o;
		int p;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 10000)
		{
			a = n / 10000;
			b = (n - a * 10000) / 1000;
			c = (n - a * 10000 - b * 1000) / 100;
			d = (n - a * 10000 - b * 1000 - c * 100) / 10;
			e = n - a * 10000 - b * 1000 - c * 100 - d * 10;
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (n >= 1000 && n <= 10000)
		{
			f = n / 1000;
			g = (n - f * 1000) / 100;
			h = (n - f * 1000 - g * 100) / 10;
			i = n - f * 1000 - g * 100 - h * 10;
			System.out.printf("%d%d%d%d",i,h,g,f);
		}
		else if (n >= 100 && n <= 1000)
		{
			j = n / 100;
			k = (n - j * 100) / 10;
			l = n - j * 100 - k * 10;
			System.out.printf("%d%d%d",l,k,j);
		}
		else if (n >= 10 && n <= 100)
		{
			m = n / 10;
			o = n - m * 10;
			System.out.printf("%d%d",o,m);
		}
		else if (n >= 0 && n <= 10)
		{
			p = n;
			System.out.printf("%d",n);
		}
	}
}

