package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int N;
		int[][] a = new int[101][101];
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
		N = row + col - 2;
		for (k = 0;k <= N;k++)
		{
			i = 0;
			j = k - i;
			do
			{
				if (i >= 0 && j >= 0 && i < row && j < col)
				{
					System.out.printf("%d\n",a[i][j]);
					i++;
					j--;
				}
				else
				{
					i++;
					j--;
				}
			}while (j >= 0);
		}
		return 0;
	}
}

