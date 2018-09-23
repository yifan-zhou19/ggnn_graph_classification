package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = (x % 10000) / 1000;
		c = (x % 1000) / 100;
		d = (x % 100) / 10;
		e = (x % 10) / 1;
		for (i = 1;i <= 10000;i = i * 10)
		{
			if (x / i != 0)
			{
		k = k + 1;
			}
		};
		if (k == 5)
		{
			x5 = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (k == 4)
		{
			x4 = 1000 * e+100 * d + 10 * c + b;
		System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (k == 3)
		{
			x3 = 100 * e+10 * d + c;
		System.out.printf("%d%d%d",e,d,c);
		}
		else if (k == 2)
		{
			x2 = 10 * e + d;
		System.out.printf("%d%d",e,d);
		}
		else if (k == 1)
		{
			x1 = e;
		System.out.printf("%d",e);
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}
}

