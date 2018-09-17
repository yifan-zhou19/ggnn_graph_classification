package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int p,int q,int t);

		int n;
		int i;
		int[] g = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				g[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f(2, g[i], 1));
		}


		return 0;
	}

	public static int f(int p,int q,int t)
	{
		int[][] h = new int[100][100];
		int i;
		int k = 0;
		for (i = p;i * i <= q;i++)
		{
			k = 0;
			if (q % i == 0)
			{
				h[k][0] = i;
				h[k][1] = q / i;
				k++;
				if (k != 0)
				{
					t = f(h[k - 1][0], h[k - 1][1], t);
				}

			}
			t = t + k;
		}
		return t;
	}
}

