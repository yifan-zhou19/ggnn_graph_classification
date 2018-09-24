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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a >= 1000)
		{
			b = a / 1000;
		c = a - b * 1000;
		d = c / 100;
		e = c - 100 * d;
		f = e / 10;
		g = e-10 * f;

		n = g * 1000 + f * 100 + d * 10 + b;
		System.out.printf("%04d",n);
		}
		else if (a >= 100)
		{
			b = a / 100;
			c = a - b * 100;
			d = c / 10;
			e = c - 10 * d;
			n = 100 * e+10 * d + b;
			System.out.printf("%03d",n);
		}
			else if (a >= 10)
			{
				b = a / 10;
			c = a - 10 * b;
			n = 10 * c + b;
			System.out.printf("%02d",n);
			}
			else

			{
				System.out.printf("%d",a);
			}
			return 0;
	}
}

