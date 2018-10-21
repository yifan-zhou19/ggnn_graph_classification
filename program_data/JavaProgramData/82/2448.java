package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		int k = 0;
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			if (sz[i][0] <= 140 && sz[i][0] >= 90 && sz[i][1] <= 90 && sz[i][1] >= 60)
			{
				sum++;
			}
			else
			{
				if (k < sum)
				{
					k = sum;
				}
				sum = 0;
			}
		}
		if (sum > k)
		{
			System.out.printf("%d",sum);
		}
		else
		{
			System.out.printf("%d",k);
		}
		return 0;
	}
}

