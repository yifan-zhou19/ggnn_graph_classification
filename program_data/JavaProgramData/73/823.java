package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int max;
		int min;
		for (i = 1;i < 6;i++)
		{
			a[i][0] = 1;
			max = a[i][1];
			for (j = 1;j < 6;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					a[i][0] = j;
				}
			}
		}
		for (i = 1;i < 6;i++)
		{
			a[0][i] = 1;
			min = a[1][i];
			for (j = 1;j < 6;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
					a[0][i] = j;
				}
			}
		}
		int t = 0;
		for (i = 1;i < 6;i++)
		{
				if (a[0][a[i][0]] == i)
				{
					t++;
					System.out.printf("%d %d %d\n",i,a[i][0],a[i][a[i][0]]);
				}
		}
		if (t == 0)
		{
			System.out.print("not found\n");
		}

	}
}

