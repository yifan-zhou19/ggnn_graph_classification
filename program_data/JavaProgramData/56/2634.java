package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int num;
	int a;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	a = num / 10000;
	b = (num - a * 10000) / 1000;
	c = (num - 10000 * a - 1000 * b) / 100;
	d = (num - 10000 * a - 1000 * b - 100 * c) / 10;
	e = num - 10000 * a - 1000 * b - 100 * c - 10 * d;
	System.out.printf("%d",e);
	if (d != 0)
	{
	System.out.printf("%d",d);
	}
	if (c != 0)
	{
	System.out.printf("%d",c);
	}
	if (b != 0)
	{
	System.out.printf("%d",b);
	}
	if (a != 0)
	{
	System.out.printf("%d",a);
	}
	}
}

