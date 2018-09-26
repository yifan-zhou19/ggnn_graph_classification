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
		for (i = 0;i < row;++i)
		{
			for (j = 0;j < col;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] + j = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < col;++i)
		{
			for (j = 0;(i - j >= 0) && (j < row);++j)
			{
				System.out.printf("%d\n",a[j][i - j]);
			}
		}
		for (i = 1;i < row;++i)
		{
			for (j = 0;(j < col) && (i + j < row);++j)
			{
				System.out.printf("%d\n",a[i + j][col - j - 1]);
			}
		}
		return 0;
	}

}

