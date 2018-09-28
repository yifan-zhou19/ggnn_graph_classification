package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x;
	int y;
	int z;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	x = 0;
	y = 0;
	z = 0;
	for (n = n;n > 0;n = n - 1)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			if (x >= y)
			{
				z = y;
			y = x;
			}
			else
			{
				y = y;
			if (x > z)
			{
			z = x;
			}
			}
	}
	if (n == 0)
	{
		System.out.printf("%d\n",y);
		System.out.printf("%d",z);
	}
	x = 0;
	y = 0;
	z = 0;
	return 0;
	}

}

