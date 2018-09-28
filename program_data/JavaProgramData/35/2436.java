package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int i;
		int j;
		int k;
		int e;
		int f;
		x = 0;
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
		int[][] a = new int[MAX][MAX];
		int[][] b = new int[MAX][MAX];
		int[] c = new int[n];
		for (i = 0;i < m;i++)
		{
			 c[i] = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = a[i][j];
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > a[i][0])
				{
					a[i][0] = a[i][j];
				   c[i] = j;
				}
			}
		}


		for (i = 0;i < m;i++)
		{
			e = c[i];
		for (k = 0;k < m;k++)
		{
			if (b[0][e] >= b[k][e])
			{
				b[0][e] = b[k][e];
				f = k;
			}
		}
		if (f == i)
		{

			System.out.printf("%d+%d",i,e);
			x = 1;
		}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

