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
		int k;
		int n = 0;
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
		for (i = 0;i < row;i = i + 1)
		{
			for (j = 0;j < col;j = j + 1)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k <= 100;k = k + 1)
		{
			for (i = k;i < col - k;i = i + 1)
			{
				if (n != row * col)
				{
				System.out.printf("%d\n",a[k][i]);
				n = n + 1;
				}

			}
			for (i = k + 1;i < row - k;i = i + 1)
			{
				if (n != row * col)
				{

				System.out.printf("%d\n",a[i][col - 1 - k]);
				n = n + 1;
				}
			}
			for (i = col - 2 - k;i >= k;i = i - 1)
			{
				if (n != row * col)
				{

				System.out.printf("%d\n",a[row - 1 - k][i]);
				n = n + 1;
				}
			}
			for (i = row - 2 - k;i >= 1 + k;i = i - 1)
			{
				if (n != row * col)
				{

				System.out.printf("%d\n",a[i][k]);
				n = n + 1;
				}
			}
		}
		return 0;
	}
}

