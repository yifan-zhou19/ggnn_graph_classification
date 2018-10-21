package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int l, int r)
	{
		int t;
		int i;
		int j;
		t = a[l];
		i = l;
		j = r;
		do
		{
			while (i < j && t >= a[j])
			{
				j--;
			}
			if (i < j)
			{
				a[i] = a[j];
				i++;
				while (j > i && t <= a[i])
				{
					i++;
				}
				if (i < j)
				{
					a[j] = a[i];
					j--;
				}
			}
		}while (i < j);
		a[i] = t;
		i++;
		j--;
		if (i < r)
		{
			sort(a, i, r);
		}
		if (l < j)
		{
			sort(a, l, j);
		}
	}

	public static int r(int a,int b)
	{
		if (a > b)
		{
			return -200;
		}
		else if (a == b)
		{
			return 0;
		}
		else
		{
			return 200;
		}
	}

	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[][] f = new int[2][1001];
		int n;
		int i;
		int j;
		int max;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}

			sort(a, 0, n - 1);
			sort(b, 0, n - 1);
			t = 0;
			for (j = 0;j <= n;j++)
			{
				f[0][j] = 0;
				f[1][j] = 0;
			}
			for (i = 1;i <= n;i++)
			{
				t = 1 - t;
				for (j = 0;j <= i;j++)
				{
					if (j == 0)
					{
						f[t][j] = f[1 - t][j] + r(a[i - 1], b[n - i + j]);
					}
					else if (i == j)
					{
						f[t][j] = f[1 - t][j - 1] + r(a[i - 1], b[j - 1]);
					}
					else
					{
						f[t][j] = MAX(f[1 - t][j] + r(a[i - 1], b[n - i + j]),f[1 - t][j - 1] + r(a[i - 1], b[j - 1]));
					}
				}
			}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was replaced by Java's logical right shift operator since the left operand was originally of an unsigned type, but you should confirm this replacement:
			max = ~0>>>1 ^ ~0;
			for (i = 0;i <= n;i++)
			{
				if (f[t][i] > max)
				{
					max = f[t][i];
				}
			}

			System.out.printf("%d\n",max);

			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}
}

