package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[8][8];
		int i;
		int j;
		int K;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			int max = a[i][0];
			int lie = 0;
			int min;
			for (j = 0;j < col;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j],lie = j;
				}
			}
			min = max;
			for (K = 0;K < row;K++)
			{
				if (min > a[K][lie])
				{
					min = a[K][lie];
				}
			}
			if (min == max)
			{
				System.out.printf("%d+%d",i,lie),num++;
			}
		}
		if (num == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

