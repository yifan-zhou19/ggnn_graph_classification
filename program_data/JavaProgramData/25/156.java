package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	d = 1;
	if (a == 0)
	{
	d = 1;
	}
	if (a != 0)
	{
	for (i = 1;i <= a;i++)
	{
	d = d * 2;
	}
	}
	System.out.printf("%.0lf",d);
	}
}

