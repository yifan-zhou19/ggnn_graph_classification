package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int x;
	int y;
	int n;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (n = 6;n <= t;n = n + 2)
	{
		 for (x = 3;x <= n / 2;x = x + 2)
		 {
		   for (k = 3;k <= Math.sqrt(x);k++)
		   {
		if (x % k == 0)
		{
			break;
		}
		   }
		if (k <= Math.sqrt(x))
		{
			continue;
		}
		y = n - x;
		for (k = 3;k <= Math.sqrt(y);k++)
		{
		if (y % k == 0)
		{
			break;
		}
		}
		if (k > Math.sqrt(y))
		{
			   System.out.printf("%d=%d+%d\n",n,x,y);
			break;
		}
		 }
	}
	}
}

