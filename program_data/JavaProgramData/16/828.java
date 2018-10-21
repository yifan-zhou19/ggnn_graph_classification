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
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a < 10)
	{
		System.out.printf("%d",a);
	}
	else if (a < 100)
	{
		b = (int)a / 10;
	c = a - b * 10;
	System.out.printf("%d%d",c,b);
	}
	else if (a < 1000)
	{
		b = (int)a / 100;
		c = (int)(a - 100 * b) / 10;
		d = a - 100 * b - 10 * c;
		System.out.printf("%d%d%d",d,c,b);
	}
	else if (a < 10000)
	{
		b = (int)a / 1000;
		c = (int)(a - 1000 * b) / 100;
		d = (int)(a - 1000 * b - 100 * c) / 10;
	e = a - 1000 * b - 100 * c - 10 * d;
	System.out.printf("%d%d%d%d",e,d,c,b);
	}
	else if (a == 10000)
	{
		System.out.print("00001");
	}
	}
}

