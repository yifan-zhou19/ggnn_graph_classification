package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int sum = 0;
		int p;
		int min;
		int max;

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
			p = 0;
			max = a[i][0];
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
	max = a[i][j];
	p = j;
				}
			}
			//printf("*%d*%d*\n",i,p);
			min = a[0][p];
			for (j = 0;j < 5;j++)
			{
				if (a[j][p] < min)
				{
				   min = a[j][p];
				}
			}
			if (min == a[i][p])
			{
				System.out.printf("%d %d %d",i + 1,p + 1,a[i][p]);
				sum++;
			}

		}
		if (sum == 0)
		{
			System.out.print("not found");
		}
	 return 0;
	}

}

