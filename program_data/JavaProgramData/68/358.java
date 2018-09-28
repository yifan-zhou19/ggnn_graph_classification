package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int x;
		int y;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m += 2)
		{
			for (x = 3;x <= m / 2;x += 2)
			{
				k = (int)Math.sqrt(x);
				for (i = 2;i <= k;i++)
				{
					if (x % i == 0)
					{
						break;
					}
				}
				if (i > k)
				{
					y = m - x;
					k = (int)Math.sqrt(y);
					for (i = 2;i <= k;i++)
					{
						if (y % i == 0)
						{
							break;
						}
					}
					if (i > k)
					{
						System.out.printf("%d=%d+%d\n",m,x,y);
						break;
					}
				}
			}
		}
	}
}

