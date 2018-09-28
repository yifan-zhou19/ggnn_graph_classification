package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 100;
		int k;
		int m;
		int n;
		int i;
		int[][] a = new int[N][N];
		int[] b = new int[N];
		int c;
		int d;
		int[] e = new int[N];
		int[] f = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			b[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				e[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				f[i] = Integer.parseInt(tempVar3);
			}
			m = e[i];
			n = f[i];
			for (c = 0;c < m;c++)
			{
				for (d = 0;d < n;d++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[c][d] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (c = 0;c < m;c++)
			{
				b[i] = b[i] + a[c][0] + a[c][n - 1];
			}
			for (d = 1;d < n - 1;d++)
			{
				b[i] = b[i] + a[0][d] + a[m - 1][d];
			}
			System.out.printf("%d",b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

