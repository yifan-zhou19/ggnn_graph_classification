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
		System.out.printf("%d\n",n);
		}
		if (n >= 10 && n < 100)
		{
		  a = (n % 10) * 10 + n / 10;
		  System.out.printf("%d\n",a);
		}
		if (n >= 100 && n < 1000)
		{
		 b = (n % 10) * 100 + (n / 10) % 10 * 10 + n / 100;
		 System.out.printf("%d\n",b);
		}
		if (n >= 1000 && n < 10000)
		{
		 c = (n % 10) * 1000 + (n / 10) % 10 * 100 + (n / 100) % 10 * 10 + n / 1000;
		 System.out.printf("%d\n",c);
		}
		if (n >= 10000 && n < 100000)
		{
		d = (n % 10) * 10000 + (n / 10) % 10 * 1000 + (n / 100) % 10 * 100 + (n / 1000) % 10 * 10 + n / 10000;
		System.out.printf("%d\n",d);
		}
		return 0;
	}
}

