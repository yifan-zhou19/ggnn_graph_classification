package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		int q = 0;
		int max = 0;
		int min = 0;
		int[][] a = new int[8][8];
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
			max = a[i][0];
			for (j = 0;j < col;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					k = j;
				}
			}
			min = a[0][k];
			for (p = 0;p < row;p++)
			{
				if (a[p][k] < min)
				{
					min = a[p][k];
					q = p;
				}
			}
			if (max == min)
			{
				num++;
				System.out.printf("%d+%d\n",q,k);
			}
		}
		if (num == 0)
		{
			System.out.print("No");
		}
	}
}

