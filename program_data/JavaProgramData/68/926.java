package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int shisushu = int j;
		int n;
		int i;
		int j;
		int p;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j <= (i / 2);j++)
			{
				if (shisushu(j) != 0 && shisushu(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
	public static int shisushu(int j)
	{
		int k;
		int p;
		if (j == 2 || j == 3 || j == 5 || j == 7 || j == 11 || j == 13 || j == 17)
		{
			return 1;
		}
		else
		{
		k = Math.sqrt(j);
		for (p = 2;p <= k;p++)
		{
			if (j % p == 0)
			{
				break;
			}
		}
			if (p > k)
			{
				return 1;
			}
		}
		return 0;
	}
}

