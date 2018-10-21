package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		int sum = 0;
		int i;
		int j;
		int l;
		int m;
		int n;
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
			if (n == 1 && m == 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sum = Integer.parseInt(tempVar4);
				}
				System.out.printf("%d",sum);
				sum = 0;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
				for (l = 0;l < n;l++)
				{
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						*(a + j) + l = tempVar5;
					}
				}
				}
			for (l = 0;l < n;l++)
			{
				sum = sum + *(*(a + 0) + l) + *(*(a + m - 1) + l);
			}
			for (l = 0;l < m;l++)
			{
				sum = sum + *(*(a + l) + 0) + *(*(a + l) + n - 1);
			}
			sum = sum - *(*(a + 0) + 0) - *(*(a + 0) + n - 1) - *(*(a + m - 1) + 0) - *(*(a + m - 1) + n - 1);
			System.out.printf("%d\n",sum);
			sum = 0;
			}
		}
		return 0;
	}

}

