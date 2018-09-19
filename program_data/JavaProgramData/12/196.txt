package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[MAX][16];
		int[] b = {0, 0};
		int i;
		int j;
		int k;
		int h;
		int m;
		int count1;
		int count2;
		count2 = -1;
		for (i = 0;i < MAX;i++)
		{
			count1 = -1;
			for (j = 0;j < 16;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if ((a[i][j] == 0) || (a[i][j] == -1))
				{
					break;
				}
				count1++;
			}
			if (a[i][j] == -1)
			{
				break;
			}
			for (k = 0;k <= count1;k++)
			{
				for (h = 0;h <= count1;h++)
				{
					if (a[i][k] == 2 * a[i][h])
					{
						b[i]++;
					}
					else
					{
						continue;
					}
				}
			}
			count2++;
		}
		for (m = 0;m <= count2;m++)
		{
			System.out.printf("%d\n",b[m]);
		}
	}
}

