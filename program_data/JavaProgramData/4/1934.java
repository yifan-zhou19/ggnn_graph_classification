package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int duijiaoxian;
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
		duijiaoxian = row + col - 2;
		for (n = 0;n <= duijiaoxian;n++)
		{
			for (i = 0;i <= n;i++)
			{
				if (0 <= i != 0 && i < row && 0 <= (n - i) && (n - i) < col)
				{
					System.out.printf("%d\n",a[i][n - i]);
				}
			}
		}
	}
}

