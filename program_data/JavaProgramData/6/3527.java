package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int N;
		int i;
		int j;
		int a;
		int b;
		int sum = 0;
		int[][] data = new int[M][M];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 0;n < N;n++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < a;i++)
			{
				for (j = 0;j < b;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						data[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < a;i++)
			{
				for (j = 0;j < b;j++)
				{
					if (i == 0 || i == a - 1 || j == 0 || j == b - 1)
					{
						sum += data[i][j];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}


}

