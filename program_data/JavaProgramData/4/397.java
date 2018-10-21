package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k = 0;
		int[] b = new int[10000];
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		if (row >= col)
		{
			for (s = 0;s < col;s++)
			{
				for (i = 0;i <= s;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
			for (s = col;s < row;s++)
			{
				for (i = s - col + 1;i <= s;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
			for (s = row;s < row + col - 1;s++)
			{
				for (i = s - col + 1;i < row;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
		}
		else
		{
			for (s = 0;s < row;s++)
			{
				for (i = 0;i <= s;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
			for (s = row;s < col;s++)
			{
				for (i = 0;i < row;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
			for (s = col;s < col + row - 1;s++)
			{
				for (i = s - col + 1;i < row;i++)
				{
					b[k] = a[i][s - i];
					k++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

