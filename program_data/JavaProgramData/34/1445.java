package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n = 0;
	int y = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	n = m;
	y = n;
		for (i = 0;i < 100;i++)
		{
	if (y == 0 || y == 1)
	{
	System.out.print("End\n");
	break;
	}
	else
	{
	if (n % 2 == 0)
	{
				y = n / 2;
	System.out.printf("%d/2=%d\n",n,y);
	n = y;
	}
	else
	{
	y = n * 3 + 1;
	System.out.printf("%d*3+1=%d\n",n,y);
	n = y;
	}
	//printf("%d\n",y);
	}
		}
	return 0;
	}

}

