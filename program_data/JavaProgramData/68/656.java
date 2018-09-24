package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (x = 3;x <= n / 2;x++)
			{
				for (j = 2;j <= Math.sqrt(x);j++)
				{
					if (x % j == 0)
					{
						break;
					}
				}
				if (j <= Math.sqrt(x))
				{
					continue;
				}
				y = i - x;
				for (j = 2;j <= Math.sqrt(y);j++)
				{
					if (y % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(y))
				{
					System.out.printf("%d=%d+%d\n",i,x,y);
					break;
				}
			}
		}
	}
}

