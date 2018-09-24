package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int ii;
		int jj;
		int[][] a = new int[8][8];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			int max = 0;
			for (j = 0;j < m;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					ii = i;
					jj = j;
				}
			}
			for (k = 0;k < n;k++)
			{
				if (a[k][jj] < a[ii][jj])
				{
					break;
				}
				if (k == n - 1)
				{
					System.out.print(ii);
					System.out.print("+");
					System.out.print(jj);
					return 0;
				}
			}
		}
		System.out.print("No");
		return 0;
	}

}

