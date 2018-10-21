package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int k;
		int x;
		int c = int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= x;k += 2)
		{
		for (i = 2;i < k;i++)
		{
			if (c(i) != 0)
			{
				y = k - i;
			}
			if (c(y) != 0)
			{
				System.out.printf("%d=%d+%d\n",k,i,y);
			}
			else
			{
				continue;
			}
			break;
		}
		}

		return 0;
	}
	public static int c(int n)
	{
		int m;
		for (m = 2;m <= Math.sqrt(n);m++)
		{
			if (n % m == 0)
			{
			n = 0;
			break;
			}
		}
		return (n != 0?1:0);
	}

}

