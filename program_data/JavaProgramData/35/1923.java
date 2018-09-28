package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int[] xx = new int[10];
	public static int[] yy = new int[10];

	public static int hang(int no,int n)
	{
		int ans = 0;
		int max = a[no][0];
		for (int i = 1;i < n ;i++)
		{
			if (a[no][i] > max)
			{
				max = a[no][i];
				ans = i;
			}
		}
		return ans;
	}

	public static int lie(int no,int n)
	{
		int ans = 0;
		int max = a[0][no];
		for (int i = 1;i < n ;i++)
		{
			if (a[i][no] < max)
			{
				max = a[i][no];
				ans = i;
			}
		}
		return ans;
	}

	public static int Main()
	{
		int m;
		int n;
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
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			xx[i] = hang(i, m);
		}
		for (int i = 0; i < m; i++)
		{
			yy[i] = lie(i, n);
		}
		for (int i = 0; i < n; i++)
		{
			if (yy[(xx[i])] == i)
			{
				System.out.printf("%d+%d\n",i,xx[i]);
				return 0;
			}
		}
		System.out.print("No\n");
		return 0;
	}

}

