package <missing>;

public class GlobalMembers
{
	/*?????? 
	a)  ??????????????????? 
	b)  ??????????? 
	c)  ?????????? 
	d)  ????????? 
	*/
	public static int exchange(int[] m, int n)
	{
		int i;
		int j;
		int l;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (m[i] > m[j])
				{
					l = m[i];
					m[i] = m[j];
					m[j] = l;
				}
			}
		}
		return m;
	}

	public static int add(int[] x, int[] y, int e, int f)
	{
		int g;
		for (g = 0;g < f;g++)
		{
			x[e + g] = y[g];
		}
		return x;
	}

	public static void getint(int[] r, int s)
	{
		int t;
		for (t = 0;t < s;t++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				r[t] = Integer.parseInt(tempVar);
			}
		}
	}

	public static void print(int[] u, int v)
	{
		int w;
		for (w = 0;w < v - 1;w++)
		{
			System.out.printf("%d ",u[w]);
		}
		System.out.printf("%d",u[v - 1]);
	}

	public static void Main()
	{
		int[] a = new int[40];
		int[] b = new int[20];
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		getint(a, c),getint(b,d);
		print(add(exchange(a, c), exchange(b, d), c, d), c + d);
	}
}

