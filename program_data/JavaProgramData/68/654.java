package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int x;
		int y;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= t;m = m + 2)
		{
		for (x = 3;x <= m / 2;x = x + 2)
		{
			for (k = 2;k <= Math.sqrt(x) + 1;k++)
			{
				if (x % k == 0)
				{
					break;
				}
			}
			if (k > Math.sqrt(x))
			{
				y = m - x;
				for (k = 2;k <= Math.sqrt(y) + 1;k++)
				{
					if (y % k == 0)
					{
						break;
					}
				}
				if (k > Math.sqrt(y))
				{
					break;
				}

			}
		}
		System.out.printf("%d=%d+%d\n",m,x,y);
		}
	}


}

