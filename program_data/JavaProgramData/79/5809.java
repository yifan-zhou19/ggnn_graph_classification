package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[301];
		int[] n = new int[301];
		int[] o = new int[301];
		int[][] a = new int[301][301];
		int i;
		int j;
		int k = 0;
		int p;
		int q;
		int r;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
			k++;
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 1;j <= n[i];j++)
			{
				a[i][j] = j;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0,q = 1,p = 1;p < n[i];)
			{
				j++;
				if (j == n[i] + 1)
				{
					j = 1;
				}
				if (a[i][j] != 0)
				{
					q++;
				}
				if (q == m[i] + 1)
				{
					q = 1;
					a[i][j] = 0;
					p++;
				}
			}
			for (r = 1;r <= n[i];r++)
			{
				o[i] += a[i][r];
			}
			System.out.printf("%d\n",o[i]);
		}
	}

}

