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
		int[][] xueya = new int[101][2];
		int[] outcome = new int[101];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xueya[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xueya[i][1] = Integer.parseInt(tempVar3);
			}
			if (xueya[i][0] >= 90 && xueya[i][0] <= 140 && xueya[i][1] >= 60 && xueya[i][1] <= 90)
			{
				outcome[i] = 1;
			}
			else
			{
				outcome[i] = 0;
			}
		}

		int j = 0;
		int k = 0;
		int m;
		int[] count = new int[101];
		for (m = 0;m < n;m++)
		{
			if (outcome[m] == 1)
			{
				count[m] = 1;
			}
			else
			{
				count[m] = 0;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (outcome[j] == 1)
			{
				for (k = j + 1;k < n && outcome[k] == 1;k++)
				{
					count[j]++;
				}
			}
		}



		int p;
		int q;
		int t;
		for (p = n - 1;p > 0;p--)
		{
			for (q = 0;q < p;q++)
			{
				if (count[q] >= count[q + 1])
				{
					t = count[q];
					count[q] = count[q + 1];
					count[q + 1] = t;
				}
			}
		}
		System.out.printf("%d\n",count[n - 1]);
		return 0;
	}
}

