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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1000)
		{
		 a = n % 10;
		 b = (n % 100) / 10;
		 c = (n % 1000) / 100;
		 d = n / 1000;
		 x = a * 1000 + b * 100 + c * 10 + d;
		 System.out.printf("%04d",x);
		}
		else if (n >= 100)
		{
			a = n % 10;
		 b = (n % 100) / 10;
		 c = n / 100;
		 x = a * 100 + b * 10 + c;
		 System.out.printf("%03d",x);
		}
		else if (n >= 10)
		{
			a = n % 10;
		b = n / 10;
		x = a * 10 + b;
		System.out.printf("%02d",x);
		}
		else
		{
			System.out.printf("%d",n);
		}
		return 0;
	}
}

