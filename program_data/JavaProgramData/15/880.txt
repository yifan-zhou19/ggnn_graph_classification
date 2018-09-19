package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bian;
		int row;
		int col;
		int[][] shuzu = new int[500][500];
		int i;
		int j;
		int m = 0;
		int n = 0;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bian = Integer.parseInt(tempVar);
		}
		row = bian;
		col = bian;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (shuzu[i][j] == 0)
				{
					m += 1;
					break;
				}
			}
		}

		for (j = 0;j < col;j++)
		{
			for (i = 0;i < row;i++)
			{
				if (shuzu[i][j] == 0)
				{
					n += 1;
					break;
				}
			}
		}

		sum = (m - 2) * (n - 2);
		System.out.printf("%d",sum);
		return 0;
	}

}

