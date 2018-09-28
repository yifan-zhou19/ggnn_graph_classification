package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] sz = new int[50000][2];
		int[] a = new int[100000];
		int t = 0;
		int k;
		int p;
		int q;
		int j;
		int c;
		int b = 0;
		int e = 1;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
				a[t] = sz[i][j];
				t++;
			}
		}
		for (q = 1;q <= (n + n);q++)
		{
			for (k = 0;k < (n + n - q);k++)
			{
				if (a[k] > a[k + 1])
				{
					p = a[k + 1];
					a[k + 1] = a[k];
					a[k] = p;
				}
			}
		}
		for (i = a[0];i <= (a[t - 1] - 1);i++)
		{
			f = i + 0.5;
			b = 0;
			for (c = 0;c < n;c++)
			{
				if (f < sz[c][0] || f> sz[c][1])
				{
					b++;
				}
			}
			if (b == n)
			{
				System.out.print("no");
				e = 0;
				break;
			}
		}
			if (e == 1)
			{
				System.out.printf("%d %d",a[0],a[t - 1]);
			}
		return 0;
	}

}

