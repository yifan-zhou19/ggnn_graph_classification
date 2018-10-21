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
	   int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 10 == 0)
		{
			a = n;
			System.out.printf("%ld",a);
		}
		else if (n / 100 == 0)
		{
			a = n / 10;
			b = n - a * 10;
			sum = b * 10 + a;
			System.out.printf("%ld",sum);
		}
		else if (n / 1000 == 0)
		{
			a = n / 100;
			b = (n - a * 100) / 10;
			c = n - a * 100 - b * 10;
			sum = 100 * c + 10 * b + a;
			System.out.printf("%ld",sum);
		}
		else if (n / 10000 == 0)
		{
			a = n / 1000;
			b = (n - a * 1000) / 100;
			c = (n - a * 1000 - b * 100) / 10;
			d = n - a * 10000 - b * 100 - c * 10;
			sum = d * 1000 + c * 100 + b * 10 + a;
			System.out.printf("%ld",sum);
		}
		else if (n / 100000 == 0)
		{
			a = n / 10000;
			b = (n - a * 10000) / 1000;
			c = (n - a * 10000 - b * 1000) / 100;
			d = (n - a * 10000 - b * 1000 - c * 100) / 10;
			e = n - a * 10000 - b * 1000 - c * 100 - d * 10;
			sum = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			System.out.printf("%ld",sum);
		}

	}

}

