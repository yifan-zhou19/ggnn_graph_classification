package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int[][] tianji = new int[100][1000];
		int[][] qiwang = new int[100][1000];
		int i;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			if (n[i] == 0)
			{
				break;
			}
			else
			{
				for (int j = 0;j <= n[i] - 1;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tianji[i][j] = Integer.parseInt(tempVar2);
					}
				}
				for (int k = 0;k <= n[i] - 1;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qiwang[i][k] = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (int l = 0;l <= i - 1;l++)
		{
			for (int j = n[l] - 1;j > 0;j--)
			{
				for (int k = 0;k < j;k++)
				{
					if (tianji[l][k] > tianji[l][k + 1])
					{
						int temp;
						temp = tianji[l][k + 1];
						tianji[l][k + 1] = tianji[l][k];
						tianji[l][k] = temp;
					}
					if (qiwang[l][k] > qiwang[l][k + 1])
					{
						int temp;
						temp = qiwang[l][k + 1];
						qiwang[l][k + 1] = qiwang[l][k];
						qiwang[l][k] = temp;
					}
				}
			}
		}
		for (int l = 0;l <= i - 1;l++)
		{
			int t1 = 0;
			int t2 = n[l] - 1;
			int q1 = 0;
			int q2 = n[l] - 1;
			int count = 0;
			for (;t1 <= t2;)
			{
				if (tianji[l][t2] > qiwang[l][q2])
				{
					count++;
					t2--;
					q2--;
				}
				else if (tianji[l][t1] > qiwang[l][q1])
				{
					count++;
					t1++;
					q1++;
				}
				else if (tianji[l][t1] < qiwang[l][q2])
				{
					count--;
					t1++;
					q2--;
				}
				else
				{
					t1++;
					q2--;
				}
			}
			System.out.printf("%d\n",200 * count);
		}
		return 0;
	}

}

