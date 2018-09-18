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
	a = n % 10;
	n = n / 10;
	if (n == 0)
	{
		System.out.printf("%d",a);
	}
	else
	{
		b = n % 10;
		n = n / 10;
		if (n == 0)
		{
		System.out.printf("%d%d",a,b);
		}
	else
	{
		c = n % 10;
	n = n / 10;
	d = n;
	if (n == 0)
	{
		System.out.printf("%d%d%d",a,b,c);
	}
	else
	{
	System.out.printf("%d%d%d%d",a,b,c,d);
	}
	}
	}
	return 0;
	}
}

