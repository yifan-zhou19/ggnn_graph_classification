package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int c;
	int d;
	int e;
	int f;
	int g;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a == 10000)
	{
	System.out.print("00001");
	}
	else if (a >= 1000 && a <= 9999)
	{
	c = a / 1000;
	d = (a - 1000 * c) / 100;
	e = (a - 1000 * c - d * 100) / 10;
	f = a - 1000 * c - d * 100 - e * 10;
	g = f * 1000 + e * 100 + d * 10 + c;
	System.out.printf("%d%d%d%d",f,e,d,c);
	}
	else if (a >= 100 && a <= 999)
	{
		c = 0;
	d = (a - 1000 * c) / 100;
	e = (a - 1000 * c - d * 100) / 10;
	f = a - 1000 * c - d * 100 - e * 10;
	g = f * 100 + e * 10 + d * 1 + c;
	System.out.printf("%d%d%d",f,e,d);
	}
	else if (a >= 10 && a <= 99)
	{
		c = 0;
	d = 0;
	e = (a - 1000 * c - d * 100) / 10;
	f = a - 1000 * c - d * 100 - e * 10;
	g = f * 10 + e;
	System.out.printf("%d%d",f,e);
	}
	else
	{
		g = a;
	System.out.printf("%d",g);
	}

	}
}

