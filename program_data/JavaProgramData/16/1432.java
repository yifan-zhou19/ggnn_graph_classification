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
		n = Integer.parseInt(tempVar);
	}
	if (n < 10)
	{
		System.out.printf("%d",n);
	}
	else if (n < 100)
	{
	System.out.printf("%d%d",n % 10,n / 10);
	}
	else if (n < 1000)
	{
		a = n / 100;
		b = n / 10 - 10 * a;
		c = n % 10;
	 System.out.printf("%d%d%d",c,b,a);
	}
	else if (n < 10000)
	{
		d = n / 1000;
		e = n / 100 - 10 * d;
		f = n / 10 - d * 100 - e * 10;
		g = n % 10;
	System.out.printf("%d%d%d%d",g,f,e,d);
	}
	else
	{
		System.out.print("over");
	}
	return 0;
	}
}

