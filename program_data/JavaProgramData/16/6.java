package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else if ((10 < n) && (n < 100))
		{
			int i;
			int j;
			int k;
			i = n / 10;
			j = n % 10;
			k = 10 * j + i;
			System.out.printf("%d",k);
		}
		else if ((100 < n) && (n < 1000))
		{
			int a;
			int b;
			int c;
			int d;
			int e;
			a = n / 100;
			b = n % 100;
			c = b / 10;
			d = b % 10;
			e = 100 * d + 10 * c + a;
			System.out.printf("%d",e);
		}
		else if ((1000 < n) && (n < 10000))
		{
			int f;
			int l;
			int m;
			int w;
			int o;
			int p;
			int q;
			f = n / 1000;
			l = n % 1000;
			m = l / 100;
			w = l % 100;
			o = w / 10;
			p = w % 10;
			q = 1000 * p + 100 * o + 10 * m + f;
			System.out.printf("%d",q);
		}
		else if (n == 10)
		{
			System.out.print("01");
		}
			else if (n == 100)
			{
			System.out.print("001");
			}
			else if (n == 1000)
			{
			System.out.print("0001");
			}
		return 0;
	}


}

