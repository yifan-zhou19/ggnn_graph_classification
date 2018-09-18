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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		if ((n > 9) && (n < 100))
		{
			a = n / 10;
			b = n % 10;
			System.out.printf("%d%d",b,a);
		}
		if ((n > 99) && (n < 1000))
		{
			a = n / 100;
			b = (n - a * 100) / 10;
			c = n % 10;
			System.out.printf("%d%d%d",c,b,a);
		}
		if (n > 999)
		{
			a = n / 1000;
			b = (n - a * 1000) / 100;
			c = (n - a * 1000 - b * 100) / 10;
			d = n % 10;
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		return 0;
	}


}

