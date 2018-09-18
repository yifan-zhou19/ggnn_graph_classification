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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 100)
		{
			System.out.print("001");
		}
		else if (n >= 1 && n <= 9)
		{
			System.out.printf("%d",n);
		}
		else if (n >= 10 && n <= 99)
		{
			a = n % 10;
		   b = n / 10;
		   c = a * 10 + b;
		   d = e = 0;
		   System.out.printf("%d",c);
		}
		else if (n > 100 && n <= 999)
		{
			a = n % 100;
			b = a % 10;
			c = a / 10;
			d = n / 100;
			e = b * 100 + c * 10 + d;
			System.out.printf("%d",e);
		}
		else if (n >= 1000 && n <= 9999)
		{
			a = n % 10;
			b = (n % 100 - a) / 10;
			c = n % 1000 / 100;
			d = n / 1000;
			e = a * 1000 + b * 100 + c * 10 + d;
			System.out.printf("%d",e);
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

