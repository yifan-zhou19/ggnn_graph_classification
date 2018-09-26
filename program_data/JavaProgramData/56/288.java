package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int sum;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		b = (n % 100 - a) / 10;
		c = (n % 1000 - n % 100) / 100;
		d = (n % 10000 - n % 1000) / 1000;
		e = (n % 100000 - n % 10000) / 10000;
		sum = 10000 * a + 1000 * b + 100 * c + 10 * d + e;
		if (sum % 10000 == 0)
		{
			m = sum / 10000;
		}
		else if (sum % 1000 == 0)
		{
			m = sum / 1000;
		}
		else if (sum % 100 == 0)
		{
			m = sum / 100;
		}
		else if (sum % 10 == 0)
		{
			m = sum / 10;
		}
		else
		{
			m = sum;
		}
		System.out.printf("%d\n",m);
		return 0;
	}


}

