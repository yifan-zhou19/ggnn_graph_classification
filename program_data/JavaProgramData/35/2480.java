package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int M;
		int N;
		int O;
		int s;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		O = 0;
		s = m * n;
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				M = 0;
				for (k = 0; k < n; k++)
				{
					if (a[i][j] >= a[i][k])
					{
						M = M + 1;
					}
				}
				if (M == n)
				{
					N = 0;
					for (l = 0; l < m; l++)
					{
						if (a[i][j] <= a[l][j])
						{
							N = N + 1;
						}
					}
				}
				if (N == m)
				{
					System.out.printf("%d+%d\n", i, j);
					flag = 1;
					break;
				}
				else
				{
					O = O + 1;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		if (O == s)
		{
			System.out.print("No");
		}
		return 0;
	}



}

