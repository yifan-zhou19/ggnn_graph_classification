package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int a;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	a = x / 10000;
	b = x % 10000 / 1000;
	c = x % 1000 / 100;
	d = x % 100 / 10;
	e = x % 10;
	if (x > 9999)
	{
	System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	}
	else
	{
	if (x > 999)
	{
	System.out.printf("%d%d%d%d",e,d,c,b);
	}
	else
	{
	if (x > 99)
	{
	System.out.printf("%d%d%d",e,d,c);
	}
	else
	{
	if (x > 9)
	{
	System.out.printf("%d%d",e,d);
	}
	else
	{
	System.out.printf("%d",e);
	}
	}
	}
	}
	return 0;
	}

}

