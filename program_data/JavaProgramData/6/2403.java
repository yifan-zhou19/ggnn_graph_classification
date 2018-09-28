package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sum;
		int m;
		int[][] a = new int[200][220];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= m;k++)
		{
			sum = 0;
			int row;
			int col;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				col = Integer.parseInt(tempVar3);
			}
			for (i = 1;i <= row;i++)
			{
				for (j = 1;j <= col;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}

			for (i = 1;i <= row;i++)
			{
				sum = sum + a[i][1] + a[i][col];
			}

			for (j = 2;j <= col - 1;j++)
			{
				sum = sum + a[1][j] + a[row][j];
			}

					   if (row == 1)
					   {
						   sum /= 2;
					   }


						 System.out.printf("%d\n",sum);
		}
		return 0;
	}


}

