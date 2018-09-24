package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 10000 != 0)
		{
		System.out.print("00001");
		}
		else if (n / 1000 != 0)
		{
			int a;
			int b;
			int c;
			int d;
			a = n / 1000;
			b = (n - 1000 * a) / 100;
			c = (n - 1000 * a - 100 * b) / 10;
			d = n % 10;
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else if (n / 100 != 0)
		{
			int e;
			int f;
			int g;
			e = n / 100;
			f = (n - 100 * e) / 10;
			g = n % 10;
			System.out.printf("%d%d%d",g,f,e);
		}
		else if (n / 10 != 0)
		{
			int p;
			int q;
			p = n / 10;
			q = n % 10;
			System.out.printf("%d%d",q,p);
		}
		else
		{
		System.out.printf("%d",n);
		}
		return 0;

	}
}

