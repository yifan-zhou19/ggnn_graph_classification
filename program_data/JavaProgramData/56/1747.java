package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = n % 10;
		m = 10000 * e+1000 * d + 100 * c + 10 * b + a;

		if (m % 10000 == 0)
		{
			m = m / 10000;
		}
		else if (m % 1000 == 0)
		{
			m = m / 1000;
		}
		else if (m % 100 == 0)
		{
			m = m / 100;
		}
		else if (m % 10 == 0)
		{
			m = m / 10;
		}

		System.out.printf("%d\n",m);
	}



}

