package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[][] max = new int[5][3];
		int[][] min = new int[5][3];
		int m = 0;
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
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max[i][0])
				{
					max[i][0] = a[i][j];
					max[i][1] = i;
					max[i][2] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
					min[i][0] = a[j][i];
					min[i][1] = j;
					min[i][2] = i;
				}
				if (a[j][i] < min[i][0])
				{
					min[i][0] = a[j][i];
					min[i][1] = j;
					min[i][2] = i;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (max[i][1] == min[j][1] && max[i][2] == min[j][2])
				{
					m++;
					System.out.printf("%d %d %d",max[i][1] + 1,max[i][2] + 1,max[i][0]);
				}
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}





}

