package <missing>;

public class GlobalMembers
{
	public static int[][] vs = new int[MaxN][MaxN];
	public static int[][] f = new int[MaxN][MaxN];
	public static int[] qiwang = new int[MaxN];
	public static int[] tianji = new int[MaxN];

	public static int max(int x, int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

	public static int vs1(int x, int y)
	{

		if (tianji[x] > qiwang[y])
		{
			return 200;
		}
		else if (tianji[x] < qiwang[y])
		{
			return -200;
		}
			else
			{
				return 0;
			}
	}

	public static int sort(int[] a, int l, int r)
	{

		int i = l;
		int j = r;
		int k = a[(i + j) / 2];

		while (i <= j)
		{
			while (a[i] > k)
			{
				++i;
			}
			while (k > a[j])
			{
				--j;
			}
			if (i <= j)
			{

				int x = a[i];
				a[i] = a[j];
				a[j] = x;
				++i;
				--j;
			}
		}
		if (l < j)
		{
			sort(a, l, j);
		}
		if (i < r)
		{
			sort(a, i, r);
		}
	}
	public static int Main()
	{
	  //  freopen("1.in","r",stdin);
	   // printf("2\n");


		int k;
		int L;
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{



			//qiwang = (int*)malloc(n*sizeof(int));
		//	tianji = (int*)malloc(n*sizeof(int));
			for (i = 0 ; i < n ; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianji[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0 ; i < n ; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qiwang[i] = Integer.parseInt(tempVar3);
				}
			} //printf(" %d ",i);}

			sort(tianji, 0, n - 1);
			sort(qiwang, 0, n - 1);

		for (i = 0; i < n; ++i)
		{
			f[i][i] = vs1(i, n - 1);
		}
		   for (L = 1; L < n; ++L)
		   {
				for (i = 0; i < n - L; ++i)
				{
					j = i + L;
					f[i][j] = max(f[i + 1][j] + vs1(i, n - 1 - L), f[i][j - 1] + vs1(j, n - 1 - L));
				}
		   }
			System.out.printf("%d\n",f[0][n - 1]);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
		return 0;
	}

}

