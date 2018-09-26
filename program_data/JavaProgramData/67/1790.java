package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int zong;
	int you;
	int i;
	double x;
	double y;
	x = 0.0,y = 0.0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zong = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		you = Integer.parseInt(tempVar3);
	}
	x = 1.0 * you / zong;
	for (i = 0;i < n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		zong = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		you = Integer.parseInt(tempVar5);
	}
	y = 1.0 * you / zong;
	if ((y - x) * 100 > 5)
	{
		System.out.print("better\n");
	}
	else if ((x - y) * 100 > 5)
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

