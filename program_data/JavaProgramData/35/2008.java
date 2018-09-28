package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int max = 0;
		int min = 0;
		int row = 0;
		int col = 0;
		int num = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					col = j;
				}
			}

			min = a[0][col];
			for (k = 0;k < m;k++)
			{
				if (a[k][col] < min)
				{
					min = a[k][col];
					row = k;
				}
			}

			if (min == max)
			{
				num++;
				System.out.printf("%d+%d\n",row,col);
			}
		}
		if (num == 0)
		{
			System.out.print("No");
		}
	}
}

