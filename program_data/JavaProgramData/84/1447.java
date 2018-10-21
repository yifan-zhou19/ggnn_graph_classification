package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int i;
	int a;
	int b;
	int n;
	int o;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (y > x)
	{
	a = x;
	x = y;
	y = a;
	}
	i = 1;
	while (i <= n - 2)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b = Integer.parseInt(tempVar4);
	}
	if (b > x)
	{
	o = x;
	x = b;
	y = o;
	}
	if (b < x && b> y)
	{
	y = b;
	}
	i = i + 1;
	}
	System.out.printf("%d\n%d\n",x,y);
	return 0;
	}
}

