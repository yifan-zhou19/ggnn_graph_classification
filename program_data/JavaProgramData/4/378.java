package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int m;
		int p;
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
		int[][] a = new int[100][100];
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
			scanf("\n");
		}


		for (m = 0;m <= col + row - 2;m++)
		{
			if (m < col)
			{
				for (p = 0;p <= row - 1 && p <= m;p++)
				{

				System.out.printf("%d\n",a[p][m - p]);
				}
			}


			if (m >= col)
			{
				for (p = m - col + 1;p <= m != 0 && p <= row - 1;p++)
				{

				System.out.printf("%d\n",a[p][m - p]);
				}
			}

		}

		return 0;
	}

}

