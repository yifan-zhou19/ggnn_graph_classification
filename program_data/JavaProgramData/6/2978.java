package <missing>;

public class GlobalMembers
{
	public static String name = new String(new char[100]);
	public static double[] s = new double[100];
	public static int[][] num = new int[1000][1000];
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int m;
		int sum = 0;
		int k = 0;
		int flag = 0;
		int p = 0;
		int a = 0;
		int c = 0;
		int b = 0;
		int q = 0;
		double result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

		while (p < a)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						num[i][j] = Integer.parseInt(tempVar4);
					}
					if (i == 0)
					{
						sum += num[i][j];
					}
					if (i == n - 1)
					{
						sum += num[i][j];
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
					if (i == 0)
					{
						sum += num[j][i];
					}
					if (i == m - 1)
					{
						sum += num[j][i];
					}
				}
			}

			System.out.printf("%d\n",sum);
			sum = 0;
			p++;


		}





			return 0;
	}

}

