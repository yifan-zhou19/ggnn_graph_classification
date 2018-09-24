package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int shisushu = int j;
		int n;
		int i;
		int j;
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
		int i;
		int k;
		k = Math.sqrt((float)j);
		for (i = 2;i <= k;i++)
		{
			if (j % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}



}

