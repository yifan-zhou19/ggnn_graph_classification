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
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		d = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		e = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		f = Integer.parseInt(tempVar7);
	}
	a = n / 100;
	b = (n - 100 * a) / 50;
	c = (n - 100 * a - 50 * b) / 20;
	d = (n - 100 * a - 50 * b - 20 * c) / 10;
	e = (n - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
	f = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	return 0;
	}
}

