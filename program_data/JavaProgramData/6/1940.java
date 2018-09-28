package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int sum;
		int[][] matrix = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k > 0)
		{
			k--;
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
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(matrix + i) + j = tempVar4;
					}
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.printf("%d\n", * matrix);
			}
			else if (m == 1)
			{
				for (i = 0; i < n; i++)
				{
					sum += *(matrix + i);
				}
				System.out.printf("%d\n", sum);
			}
			else if (n == 1)
			{
				for (i = 0; i < m; i++)
				{
					sum += **(matrix + i);
				}
				System.out.printf("%d\n", sum);
			}
			else
			{
				for (i = 0; i < n; i++)
				{
					sum += *(matrix + i);
				}
				for (i = 0; i < n; i++)
				{
					sum += *(*(matrix + m - 1) + i);
				}
				for (i = 1; i < m - 1; i++)
				{
					sum += (**(matrix + i) + *(*(matrix + i) + n - 1));
				}
				System.out.printf("%d\n", sum);
			}
		}
		return 0;
	}
}

