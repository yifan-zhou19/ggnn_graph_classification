package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int M;
		int N;
		int t;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			for (j = 1;j <= N;j++)
			{
				a[1][j] = 1;
			}
			for (j = 1;j <= M;j++)
			{
				a[j][1] = 1;
			}
			for (j = 2;j <= M;j++)
			{
				for (k = 2;k <= N;k++)
				{
					if (j < k)
					{
						a[j][k] = a[j][j];
					}
					if (j == k)
					{
						a[j][k] = a[j][j - 1] + 1;
					}
					if (j > k)
					{
						a[j][k] = a[j - k][k] + a[j][k - 1];
					}
				}
			}
			System.out.printf("%d\n",a[M][N]);
		}
	}

}

