package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int tmp;
		int[][] array = new int[20][20];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(array[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				tmp = 0;
				if ((i == 0) || (array[i][j] >= array[i - 1][j]))
				{
					tmp++;
				}
				if ((j == 0) || (array[i][j] >= array[i][j - 1]))
				{
					tmp++;
				}
				if ((i == m - 1) || (array[i][j] >= array[i + 1][j]))
				{
					tmp++;
				}
				if ((j == n - 1) || (array[i][j] >= array[i][j + 1]))
				{
					tmp++;
				}
				if (tmp == 4)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
}

