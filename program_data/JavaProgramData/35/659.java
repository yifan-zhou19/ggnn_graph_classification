package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int row;
		int col;
		int i = 0;
		int j = 0;
		int max1 = 0;
		int min1 = 0;
		int k;
		int max;
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
			min1 = 0;
			max1 = 0;
			for (j = 1;j < col;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					max1 = j;
				}
			}
			for (k = 0;k < row;k++)
			{
				if (a[k][max1] < a[i][max1])
				{
					min1 = 1;
				}
			}
			if (min1 == 0)
			{
				System.out.printf("%d+%d",i,max1);
				break;
			}
		}
		if (min1 != 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

