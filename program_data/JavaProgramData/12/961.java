package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[100][16];
		int K;
		int I;
		int[] b = new int[100];
		for (i = 0; ;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			if (a[i][0] == -1)
			{
				break;
			}
			for (j = 1; ;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					break;
				}
			}
			for (k = 0;k <= j - 1;k++)
			{
				for (K = 0;K <= j - 1;K++)
				{
					if (a[i][K] == 2 * a[i][k])
					{
						b[i]++;
					}
				}
			}
		}
		for (I = 0;I < i;I++)
		{
		System.out.printf("%d\n",b[I]);
		}
		return 0;
	}

}

