package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int array[],int k);
		void g(int c[],int d[],int o,int p);
		int n;
		int m;
		int[] a = new int[200];
		int[] b = new int[100];
		int i;
		int j;
		int[] e = new int[200];
		int z;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= m - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		f(a, n);
		f(b, m);
		g(a, b, n, m);
		for (z = 0;z < n + m - 1;z++)
		{
			System.out.printf("%d ",a[z]);
		}
		System.out.printf("%d",a[n + m - 1]);
	}
	public static void f(int[] array, int k)
	{
		int r;
		int s;
		int t;
		for (r = 0;r < k - 1;r++)
		{
		   for (s = 0;s < k - 1 - r;s++)
		   {
			  if (array[s] > array[s + 1])
			  {
				  t = array[s];
				  array[s] = array[s + 1];
				  array[s + 1] = t;
			  }
		   }
		}
	}
	public static void g(int[] c, int[] d, int o, int p)
	{
		int u;
		for (u = o;u <= o + p - 1;u++)
		{
			c[u] = d[u - o];
		}
	}

}

