package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][2];
		int i;
		int j;
		int sum = 0;
		int n;
		int sum_max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (((a[i][0] >= 90) && (a[i][0] <= 140)) && ((a[i][1] <= 90) && (a[i][1] >= 60)))
			{
				sum += 1;
			}
			else
			{
				if (sum > sum_max)
				{
					sum_max = sum;
				}
				sum = 0;
			}
		}
		if (sum > sum_max)
		{
			sum_max = sum;
		}
		System.out.printf("%d",sum_max);
		return 0;
	}

}

