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
		a = n % 10;
		b = (n - a) % 100 / 10;
		c = (n - (n % 100)) % 1000 / 100;
		d = (n - (n % 1000)) % 10000 / 1000;
		e = 1;
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else
		{
			if (n < 100)
			{
			System.out.printf("%d%d",a,b);
			}
		else
		{
			if (n < 1000)
			{
			System.out.printf("%d%d%d",a,b,c);
			}
		else
		{
			if (n < 10000)
			{
			System.out.printf("%d%d%d%d",a,b,c,d);
			}
		else
		{
			System.out.print("abcde");
		}
		}
		}
		}
	}
}

