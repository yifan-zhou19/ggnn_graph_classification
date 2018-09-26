package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int h;
		int m;
		int n;
		int sum = 0;
		int minus = 0;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (h = 0;h < k;h++)
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
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
					sum += a[i][j];
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
					minus += a[i][j];
				}
			}
			b[h] = sum - minus;
			sum = 0;
			minus = 0;
		}
		 for (h = 0;h < k;h++)
		 {
			 System.out.printf("%d\n",b[h]);
		 }
			 return 0;
	}



}

