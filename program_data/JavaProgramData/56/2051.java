package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 10 == m)
		{
			System.out.printf("%d",m);
		}
		else if (m % 100 == m)
		{
			a = m / 10;
		b = m - 10 * a;
		n = 10 * b + a;
		System.out.printf("%d",n);
		}
		else if (m % 1000 == m)
		{
			a = m / 100;
		b = (m - 100 * a) / 10;
		c = m - 100 * a - 10 * b;
		n = 100 * c + 10 * b + a;
		System.out.printf("%d",n);
		}
		else if (m % 10000 == m)
		{
			a = m / 1000;
		b = (m - 1000 * a) / 100;
		c = (m - 1000 * a - 100 * b) / 10;
		d = m - 1000 * a - 100 * b - 10 * c;
		n = 1000 * d + 100 * c + 10 * b + a;
		System.out.printf("%d",n);
		}
		else if (m % 100000 == m)
		{
			a = m / 10000;
		b = (m - a * 10000) / 1000;
		c = (m - a * 10000 - b * 1000) / 100;
		d = (m - a * 10000 - b * 1000 - c * 100) / 10;
		e = m - a * 10000 - b * 1000 - c * 100 - d * 10;
		n = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		System.out.printf("%d",n);
		}
	}
}

