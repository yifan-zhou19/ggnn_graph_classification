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
	b = (x - a * 10000) / 1000;
	c = (x - a * 10000 - b * 1000) / 100;
	d = (x - a * 10000 - b * 1000 - c * 100) / 10;
	e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
	if (x >= 10000 && x <= 99999)
	{
	System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	}
	else if (x >= 1000 && x <= 9999)
	{
	System.out.printf("%d%d%d%d",e,d,c,b);
	}
	else if (x >= 100 && x <= 999)
	{
	System.out.printf("%d%d%d",e,d,c);
	}
	else if (x >= 10 && x <= 99)
	{
	System.out.printf("%d%d",e,d);
	}
	else
	{
		System.out.printf("%d",e);
	}
	return 0;

	}


}

