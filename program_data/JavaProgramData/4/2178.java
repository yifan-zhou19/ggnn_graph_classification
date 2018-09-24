package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
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
		for (i = 0;i < col;i++) //????????????
		{
			for (j = i,k = 0;j >= 0,k <= i;j--,k++)
			{
				if (k > (row - 1) || j > (col - 1) || k < 0 || j < 0) //??????
				{
					continue;
				}
				System.out.printf("%d\n",a[k][j]);
			}
		}
		for (i = 1;i <= row - 1;i++) //????????????
		{
			for (j = col - 1,k = i;j >= 0,k <= row - 1;j--,k++)
			{
				if (k > (row - 1) || j > (col - 1) || k < 0 || j < 0) //??????
				{
					continue;
				}
				System.out.printf("%d\n",a[k][j]);
			}
		}
		return 0;
	}

}

