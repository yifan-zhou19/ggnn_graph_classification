package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	a = x % 10;
	e = x / 10000;
	d = (x - 10000 * e) / 1000;
	c = (x - 10000 * e-1000 * d) / 100;
	b = (x - 10000 * e-1000 * d - 100 * c) / 10;
	if (a != 0)
	{
		System.out.printf("%d",a);
	}
	if (b != 0)
	{
		System.out.printf("%d",b);
	}
	if (c != 0)
	{
		System.out.printf("%d",c);
	}
	if (d != 0)
	{
		System.out.printf("%d",d);
	}
	if (e != 0)
	{
		System.out.printf("%d",e);
	}
	}
}

