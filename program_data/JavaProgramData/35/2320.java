package <missing>;

public class GlobalMembers
{
	public static int test(int[][] a, int x, int y, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (a[x][i] < a[x][y])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int[][] a = new int[8][8];
		int s = 0;
		int p = 0;
		int q = 0;
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
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
			s = a[i][0];
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > s)
				{
					s = a[i][j];
					q = j;
				}
			}
			if (test(a, i, q, n) != 0)
			{
				System.out.printf("%d+%d",p,q);
				k++;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

