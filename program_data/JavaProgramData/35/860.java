package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int s = 0;
		int r;
		int l;
		int q = 0;
		int t = 0;
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
		for (i = 0;i < m;i++)
		{
			k = a[i][0];
			s = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j - 1] < a[i][j])
				{
					k = a[i][j];
					s = j; //????s???
				}
			}
			l = a[0][s];
			q = 0;
			for (r = 1;r < m;r++)
			{
				if (a[r - 1][s] > a[r][s])
				{
					l = a[r][s];
					q = r;
				}
			}
			if (k == l)
			{
				System.out.printf("%d+%d",q,s);
				t = 1;
			}

		}
		if (t == 0)
		{
		System.out.print("No");
		}
	}
}

