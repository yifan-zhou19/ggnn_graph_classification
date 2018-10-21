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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10 && a>0)
		{
			b = a;
			System.out.printf("%d",a);
		}
		if (a < 100 && a>9)
		{
			c = a / 10;
			d = a - 10 * c;
			System.out.printf("%d%d",d,c);
		}
		if (a < 1000 && a>99)
		{
			e = a / 100;
			f = (a - 100 * e) / 10;
			g = a - e * 100 - f * 10;
			System.out.printf("%d%d%d",g,f,e);
		}
		if (a < 10000 && a>999)
		{
			h = a / 1000;
			i = (a - 1000 * h) / 100;
			j = (a - h * 1000 - i * 100) / 10;
			k = a - h * 1000 - i * 100 - j * 10;
			System.out.printf("%d%d%d%d",k,j,i,h);
		}

		if (a < 100000 && a>9999)
		{
			l = a / 10000;
			m = (a - 10000 * l) / 1000;
			n = (a - l * 10000 - m * 1000) / 100;
			o = (a - l * 10000 - m * 1000 - n * 100) / 10;
			p = a - l * 10000 - m * 1000 - n * 100 - o * 10;
			System.out.printf("%d%d%d%d%d",p,o,n,m,l);
		}


		return 0;
	}


}

