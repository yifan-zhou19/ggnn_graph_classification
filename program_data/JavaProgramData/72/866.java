package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int l;
		int j;
		int x;
		int z;
		int o;
		int p;
		int q;
		int r;
		int s;
		int[][] a = new int[20][20];
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
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		if ((a[0][0] >= a[0][1]) && (a[0][0] >= a[1][0]))
		{
			System.out.print("0 0\n");
		}
		for (i = 1;i < n - 1;i++)
		{
			if ((a[0][i] >= a[0][i - 1]) && (a[0][i] >= a[0][i + 1]) && (a[0][i] >= a[1][i]))
			{
				System.out.printf("0 %d\n",i);
			}
		}
		if ((a[0][n - 1] >= a[0][n - 2]) && (a[0][n - 1] > a[1][n - 1]))
		{
			x = n - 1;
		System.out.printf("0 %d\n",x);
		}
		for (i = 1;i < m - 1;i++)
		{
			if ((a[i][0] >= a[i - 1][0]) && (a[i][0] >= a[i + 1][0]) && (a[i][0] >= a[i][1]))
			{
				System.out.printf("%d 0\n",i);
			}
			for (j = 1;j < n - 1;j++)
			{
				if ((a[i - 1][j] <= a[i][j]) && (a[i + 1][j] <= a[i][j]) && (a[i][j - 1] <= a[i][j]) && (a[i][j + 1] <= a[i][j]))
				{
					System.out.printf("%d %d\n",i,j);
				}
			}

			if ((a[i][n - 1] >= a[i - 1][n - 1]) && (a[i][n - 1] >= a[i + 1][n - 1]) && (a[i][n - 1] >= a[i][n - 2]))
			{
				z = n - 1;
				System.out.printf("%d %d\n",i,z);
			}
		}
		if ((a[m - 1][0] >= a[m - 1][1]) && (a[m - 1][0] > a[m - 2][0]))
		{
			o = m - 1;
			System.out.printf("%d 0\n",o);
		}
		for (i = 1;i < n - 1;i++)
		{
			if ((a[m - 1][i] >= a[m - 1][i - 1]) && (a[m - 1][i] >= a[m - 1][i + 1]) && (a[m - 1][i] >= a[m - 2][i]))
			{
				p = m - 1;
				System.out.printf("%d %d\n",p,i);
			}
		}
		if ((a[m - 1][n - 1] >= a[m - 1][n - 2]) && (a[m - 1][n - 1] > a[m - 2][n - 1]))
		{
			q = m - 1;
		r = n - 1;
		System.out.printf("%d %d\n",q,r);
		}
		return 0;
	}



}

