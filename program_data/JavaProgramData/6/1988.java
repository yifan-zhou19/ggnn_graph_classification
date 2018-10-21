package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int[][] a = new int[100][100];
			int r;
			int l;
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= r - 1;j++)
			{
				for (k = 0;k <= l - 1;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(a + j) + k = tempVar4;
					}
				}
			}
			for (j = 0;j <= r - 1;j++)
			{
				for (k = 0;k <= l - 1;k++)
				{
					if (j == r - 1 || j == 0 || k == l - 1 || k == 0)
					{
						sum += *(*(a + j) + k);
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

