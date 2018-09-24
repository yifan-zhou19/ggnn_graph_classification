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
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	if (a <= 10)
	{
	System.out.printf("%d",a);
	}
	else
	{
		if (a == 10 || a == 100 || a == 1000)
		{
		System.out.print("001");
		}
	else
	{
	if (100 >= a != 0 && a >= 10)
	{
			b = a % 10;
		c = (int)(a / 10);
		d = 10 * b + a;
		System.out.printf("%d\n",d);
	}
		else
		{
			if (1000 >= a != 0 && a >= 100)
			{
			e = (int)(a / 100);
		f = (int)((a - 100 * e) / 10);
		g = a - 100 * e-10 * f;
		m = 100 * g + 10 * f + e;
		System.out.printf("%d\n",m);
			}
		else
		{
			h = (int)(a / 1000);
		i = (int)((a - 1000 * h) / 100);
		j = (int)((a - 1000 * h - 100 * i) / 10);
		k = a - 1000 * h - 100 * i - 10 * j;
		n = 1000 * k + 100 * j + 10 * i + h;
		System.out.printf("%d\n",n);
		}
		}
	}
	}
	}

}

