package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void px(int x[100],int k);
		void lh(int c[100],int p,int d[100],int q);
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		px(a, m);
		px(b, n);
		lh(a, m, b, n);
		for (i = 0;i < m + n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < m + n - 1)
			{
				System.out.print(" ");
			}
		}
	}
	public static void px(int[] x, int k)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (x[i] > x[j])
				{
					t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}
		}
	}
	public static void lh(int[] c, int p, int[] d, int q)
	{
		int y;
		for (y = 0;y < q;y++)
		{
			c[p + y] = d[y];
		}
	}
}

