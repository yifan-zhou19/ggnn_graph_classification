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
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	b = a / 10000;
	c = (a - b * 10000) / 1000;
	d = a / 100 - (a / 1000) * 10;
	e = a / 10 - (a / 100) * 10;
	f = a - (a / 10) * 10;
	if (b != 0)
	{
		g = f * 10000 + e * 1000 + d * 100 + c * 10 + b;
	System.out.printf("%05d",g);
	}
	else
	{
	if (c != 0)
	{
		g = f * 1000 + e * 100 + d * 10 + c;
	System.out.printf("%04d",g);
	}
	else
	{
	if (d != 0)
	{
		g = f * 100 + e * 10 + d;
	System.out.printf("%03d",g);
	}
	else
	{
	if (e != 0)
	{
		g = f * 10 + e;
	System.out.printf("%01d",g);
	}
	else
	{
		g = f;
	System.out.printf("%d",g);
	}
	}
	}
	}
	return 0;
	}
}

