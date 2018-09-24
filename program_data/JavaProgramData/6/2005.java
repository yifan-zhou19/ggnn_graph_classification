package <missing>;

public class GlobalMembers
{
	public static void juzhen(int m,int n)
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			sum = sum + *((a) + j) + *(*(a + m - 1) + j);
		}
		for (i = 1;i < m - 1;i++)
		{
			sum = sum + *(*(a + i) + 0) + *(*(a + i) + n - 1);
		}
		if (m == 1)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				sum = sum + *(a + i);
			}
		}
		if (n == 1)
		{
			sum = 0;
			for (i = 0;i < m;i++)
			{
				sum = sum + *(*(a + i) + 0);
			}
		}
		System.out.printf("%d\n",sum);
	}
	public static int Main()
	{
		int k;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			juzhen(m, n);
		}
	}
}

