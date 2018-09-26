package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int m;
		int n;
		int k;
		int min;
		int sum = 0;
		int temp;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			m = col - 1;
			for (j = 0;j < col;j++)
			{
				if (array[i][j] > array[i][m])
				{
					m = j;
				}
			}
			n = i;
			min = i;
			for (k = 0;k < row;k++)
			{
				if (array[k][m] < array[min][m])
				{
					min = k;
				}
			}
			if (n == min)
			{
				System.out.printf("%d+%d",n,m);
				break;
			}
			if (n != min)
			{
				sum += 1;
			}
		}
		if (sum == row)
		{
				System.out.print("No");
		}
		return 0;
	}

}

