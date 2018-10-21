package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int x;
	int y;
	int a;
	int c;
	int d;
	int e;
	int b;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	c = 100 * b / a;
	for (i = 1;i < n;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		d = 100 * y / x;
		e = d - c;
		if (e >= 5)
		{
			System.out.print("better\n");
		}
		else if (e <= -5)
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

