package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int line;
		int i;
		int j;
		int judge = 0;
		int t;
		int T;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (T = 0;T < t;T++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				line = Integer.parseInt(tempVar3);
			}
			if (row == 1 || line == 1)
			{
				for (i = 0;i < row;i++)
				{
					for (j = 0;j < line;j++)
					{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							(*(a + i) + j) = tempVar4;
						}
					}
				}
				for (i = 0;i < row;i++)
				{
					for (j = 0;j < line;j++)
					{
						sum += *(*(a + i) + j);
					}
				}
				System.out.printf("%d\n",sum);
				return 0;
			}
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < line;j++)
				{
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						(*(a + i) + j) = tempVar5;
					}
				}
			}
			for (i = 0;i < row;i++)
			{
				sum += *(*(a + i) + 0);
				sum += *(*(a + i) + line-1);
			}
			for (j = 0;j < line;j++)
			{
				sum += *(*(a + 0) + j);
				sum += *(*(a + row - 1) + j);
			}
			sum = sum - *(*(a + 0) + 0) - *(*(a + 0) + line-1) - *(*(a + row - 1) + line-1) - *(*(a + row - 1) + 0);
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

