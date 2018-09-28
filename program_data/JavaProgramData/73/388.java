package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int col;
		int[] flag = new int[5];
		int finding;
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
			finding = a[i][0];
			col = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > finding)
				{
					finding = a[i][j];
					col = j;
				}
			}
			flag[i] = 1;
			for (k = 0;k < 5;k++)
			{
				if (a[k][col] < finding)
				{
					flag[i] = 0;
					break;
				}
			}
			if (flag[i] == 1)
			{
				System.out.printf("%d %d %d",i + 1,col + 1,finding);
			}
		}
		if (flag[0] == 0 && flag[1] == 0 && flag[2] == 0 && flag[3] == 0 && flag[4] == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}



}

