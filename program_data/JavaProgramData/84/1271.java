package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int x;
	int y;
	i = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n > 1 && n < 100)
	{
	while (i <= n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	if (i == 1)
	{
	x = a;
	y = 0;
	}
	else if (a > x)
	{
	y = x;
	x = a;
	}
	else if (a > y && a < x)
	{
	y = a;
	}
	i++;

	}
	System.out.printf("%d\n",x);
	System.out.printf("%d\n",y);
	}
	return 0;
	}

}

