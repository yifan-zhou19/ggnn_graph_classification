package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] line = new int[5];
		int[] row = new int[5];
		int i;
		int j;
		int max;
		int min;
		int loc;
		int t = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = 0;
			min = 1000000;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					loc = j;
				}
			}
			line[i] = loc;
			for (j = 0;j < 5;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
					loc = j;
				}
			}
			row[i] = loc;
		}
		for (i = 0;i < 5;i++)
		{
			if (row[line[i]] == i)
			{
				System.out.printf("%d %d %d\n",i + 1,line[i] + 1,a[i][line[i]]);
			}
			else
			{
				t++;
			}
		}
		if (t == 5)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

