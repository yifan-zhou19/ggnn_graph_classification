package <missing>;

public class GlobalMembers
{
	public static int maxj(int[] a, int i, int m)
	{
		int j = 0;
		int ma;
		int max = 0;
		ma = a[0];
		for (;j < m;j++)
		{
			if (a[j] > ma)
			{
			ma = a[j];
			max = j;
			}
		}
		return max;
	}

	public static int Main()
	{
		int n;
		int m;
		int p = 0;
		int k;
		int[][] a = new int[8][8];
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
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			k = maxj(a[i], i, m);
			for (j = 0;j < n;j++)
			{
				if (a[i][k] > a[j][k])
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.printf("%d+%d\n",i,k);
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

