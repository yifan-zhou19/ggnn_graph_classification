package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int e;
	int x;
	int y;
	int z;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (x < y)
	{
	e = x;
	x = y;
	y = e;
	}
	for (i = 1;i <= n - 2;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z = Integer.parseInt(tempVar4);
	}
	if (x < z)
	{
	e = x;
	x = z;
	z = e;
	if (z > y)
	{
	y = z;
	}
	}
	else if (x > z && y < z)
	{
	x = x;
	y = z;
	}
	else if (z < y)
	{
	x = x;
	y = y;
	}
	}
	System.out.printf("%d\n%d",x,y);
	return 0;
	}
}

