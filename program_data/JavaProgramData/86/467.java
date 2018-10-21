package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int k;
		int m;
		int[][] A = new int[1000][10];
		int[] B = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][j] = Integer.parseInt(tempVar3);
				}
			}
			if (A[i][m] + 3 * m < 60)
			{
				B[i] = 60 - 3 * m;
			}
			else
			{
				for (k = 1;k <= m;k++)
				{
					if (A[i][k] + 3 * k >= 60 && A[i][k] + 3 * k <= 63)
					{
						B[i] = A[i][k];
					}
					else if (A[i][k - 1] + 3 * k - 3 < 60 && A[i][k] + 3 * k >= 60)
					{
						B[i] = 60 - k * 3 + 3;
					}
				}
			}
		}
		for (l = 1;l <= n;l++)
		{
			System.out.printf("%d\n", B[l]);
		}
		return 0;
	}
}

