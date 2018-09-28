package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[100][100];

	public static int Main()
	{

		int n;
		int m;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		i = 0;
		j = 0;
		while (true)
		{
				System.out.printf("%d\n", sz[i][j]);
				if (i == (n - 1) && j == (m - 1))
				{
					break;
				}
				if (j == 0)
				{
						  j = i + 1;
						  i = 0;
				}
				else
				{
					 i++;
					 j--;
				}

				if (i >= n)
				{
						  j = i + j + 1;
						  i = 0;
				}
				if (j >= m)
				{
						  i = j + 1 - m;
						  j = m - 1;
				}
		}

		return 0;
	}

}

