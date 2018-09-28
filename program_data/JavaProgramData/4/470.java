package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[] b = new int[100000];
		int row;
		int col;
		int i;
		int j;
		int k = (-1);
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (sum = 0;sum <= ((row + col) - 2);sum++)
		{
			for (i = 0;i < row;i++)
			{
				if (sum - i >= 0 && sum - i < col)
				{
					k += 1;
					b[k] = a[i][sum - i];
				}
			}
		}
		for (k = 0;k <= row * col - 1;k++)
		{
			System.out.printf("%d\n",b[k]);
		}




		return 0;


	}

}

