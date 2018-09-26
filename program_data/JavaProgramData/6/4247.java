package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l;
		int m;
		int n;
		int[][] a = new int[100][100];
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(a + j) + l = tempVar4;
					}
				}
			}
			sum = 0;
			if (m != 1)
			{
				for (j = 0; j < n; j++)
				{
					sum = sum + *(a + j) + *(*(a + m - 1) + j);
				}
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					sum = sum + *(a + j);
				}
			}
			for (j = 1; j < m - 1; j++)
			{
				sum = sum + *(*(a + j)) + *(*(a + j) + n - 1);
			}

			System.out.printf("%d\n",sum);
		}

		return 0;
	}

}

