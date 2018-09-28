package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int kk;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[] c = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			kk = Integer.parseInt(tempVar);
		}
		for (i = 0;i < kk;i++)
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
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			c[i] = 0;
			if (m == 1 & n == 1)
			{
				c[i] = a[0][0];
			}
			else
			{
				for (j = 1,k = 0;j < m;j++)
				{
					c[i] += *(*(a + j) + k);
				}
				for (k = 1,j--;k < n;k++)
				{
					c[i] += *(*(a + j) + k);
				}
				for (j = j - 1,k--;j >= 0;j--)
				{
					c[i] += *(*(a + j) + k);
				}
				for (k = k - 1,j++;k >= 0;k--)
				{
					c[i] += *(*(a + j) + k);
				}
			}
		}
		for (i = 0;i < kk;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}
}

