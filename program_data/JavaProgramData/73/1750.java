package <missing>;

public class GlobalMembers
{
	public static int row_max(int[][] a, int i, int j)
	{
		int k;
		int flag = 1;

		for (k = 0;k < 5;k++)
		{
			if (*(*(a + i) + k) > *(*(a + i) + j))
			{
				flag = 0;
				break;
			}
		}

		return flag;
	}

	public static int col_min(int[][] a, int i, int j)
	{
		int k;
		int flag = 1;

		for (k = 0;k < 5;k++)
		{
			if (*(*(a + k) + j) < *(*(a + i) + j))
			{
				flag = 0;
				break;
			}
		}

		return flag;
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int flag = 0;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
		}

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (row_max(a, i, j) != 0 && col_min(a, i, j) != 0)
				{
					flag = 1;
					System.out.printf("%d %d %d\n",i + 1,j + 1,*(*(a + i) + j));
				}
			}
		}

		if (flag == 0)
		{
			System.out.print("not found\n");
		}
	}

}

