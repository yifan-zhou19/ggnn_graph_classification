package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int ace;
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ace = Integer.parseInt(tempVar);
	}
	a = (int)(ace / 1000);
	b = (int)((ace-1000 * a) / 100);
	c = (int)((ace-1000 * a - 100 * b) / 10);
	d = (ace-1000 * a - 100 * b - 10 * c);

	if (ace >= 1000)
	{
		System.out.printf("%d%d%d%d",d,c,b,a);
	}
	else
	{
	if (ace >= 100)
	{
		System.out.printf("%d%d%d",d,c,b);
	}
	else
	{
	if (ace >= 10)
	{
		System.out.printf("%d%d",d,c);
	}
	else
	{
	System.out.printf("%d",d);
	}
	}
	}

	}

}

