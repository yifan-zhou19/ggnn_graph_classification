package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int K;
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int sum;
		int p;
		int q;
		int[] result = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			K = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= K;i++)
		{
			sum = 0;
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
				for (k = 0;k < n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(a + j) + k = tempVar4;
					}
				}
			}
			if (m == 1)
			{
			for (q = 0;q < n;q++)
			{
				sum = sum + *(*(a + 0) + q);
			}
			for (p = 1;p < m - 1;p++)
			{
				sum = sum + *(*(a + p) + 0) + *(*(a + p) + n - 1);
			}
			}
			if (m > 1)
			{
			for (q = 0;q < n;q++)
			{
				sum = sum + *(*(a + 0) + q) + *(*(a + m - 1) + q);
			}
			for (p = 1;p < m - 1;p++)
			{
				sum = sum + *(*(a + p) + 0) + *(*(a + p) + n - 1);
			}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

