package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int m;
	int d;
	int i;
	int x = 0;
	int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	if (y % 4 == 0 && y % 100 != 0)
	{
	mon[1] = 29;
	}
	else if (y % 400 == 0)
	{
	mon[1] = 29;
	}
	else
	{
	mon[1] = 28;
	}

	for (i = 0;i < m - 1;i++)
	{
			x += mon[i];
	}
	x = x + d;
	System.out.printf("%d\n",x);
	return 0;
	}
}

