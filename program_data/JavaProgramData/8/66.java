package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[200];

	public static void Main()
	{
		void to(int a[],int b[],int n,int m);
		  void hebing(int a[],int b[],int n,int m);
		void print(int c[],int n,int m);
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}

		to(a, b, n, m);
		hebing(a, b, n, m);
		print(c, n, m);
	}

	public static void to(int[] a, int[] b, int n, int m)
	{
		int t;
		int u;
		int s;
		int f;
		int e;
		int p;
		for (t = 0;t < n - 1;t++)
		{
			for (u = t + 1;u < n;u++)
			{
				if (a[t] > a[u])
				{
					s = a[t];
					a[t] = a[u];
					a[u] = s;
				}
			}
		}
		for (f = 0;f < m - 1;f++)
		{
			for (e = f + 1;e < m;e++)
			{
				if (b[f] > b[e])
				{
					p = b[f];
					b[f] = b[e];
					b[e] = p;
				}
			}
		}

	}
	public static void hebing(int[] a, int[] b, int n, int m)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			c[n + i] = b[i];
		}
	}
	public static void print(int[] c, int n, int m)
	{
		int i;
		for (i = 0;i < n + m - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d\n",c[n + m - 1]);
	}
}

