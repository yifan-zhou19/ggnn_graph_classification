package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int a;
	int b;
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
	double c = (double)b / a;
	for (i = 1; i < n; i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b = Integer.parseInt(tempVar5);
	}
	double d = (double)b / a;
	double t = d - c;
	if (t > 0.05)
	{
		System.out.print("better\n");
	}
	else if (t < -0.05)
	{
		System.out.print("worse\n");
	}
	else
	{
		System.out.print("same\n");
	}
	}
	return 0;
	}


}

