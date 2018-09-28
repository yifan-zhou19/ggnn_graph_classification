package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,a = 0,b = 1,j = 0,k = 0;i < m * n;i++,j += a,k += b)
		{
			System.out.printf("%d\n",sz[j][k]);
			if (a == 0 && b == 1 && j + k == n - 1)
			{
				a = 1;
				b = 0;
			}
			else if (a == 1 && b == 0 && j - k == m - n)
			{
				a = 0;
				b = -1;
			}
			else if (a == 0 && b == -1 && j + k == m - 1)
			{
				a = -1;
				b = 0;
			}
			else if (a == -1 && b == 0 && j - k == 1)
			{
				a = 0;
				b = 1;
			}
		}
		return 0;
	}

}

