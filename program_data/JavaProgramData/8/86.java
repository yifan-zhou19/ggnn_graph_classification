package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] x = new int[100];
	public static int[] y = new int[100];
	public static int[] z = new int[100];
	public static void Main()
	{
		void read();
		void orde(int c[100],int d[100]);
		void resm(int e[100],int f[100]);
		void show(int g[100]);
		read();
		orde(x, y);
		resm(x, y);
		show(x);
	}
	public static void read()
	{
		int i;
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
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void orde(int[] c, int[] d)
	{
		int i;
		int j;
		int q;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (c[j + 1] < c[j])
				{
					q = c[j + 1];
					c[j + 1] = c[j];
					c[j] = q;
				}
			}
		}
			for (i = 0;i < m;i++)
			{
				x[i] = c[i];
			}
			for (i = 0;i < n - 1;i++)
			{
			for (j = 0;j < n - i - 1;j++)
			{
				if (d[j + 1] < d[j])
				{
					q = d[j + 1];
					d[j + 1] = d[j];
					d[j] = q;
				}
			}
			}
			for (i = 0;i < n;i++)
			{
				y[i] = d[i];
			}
	}
	public static void resm(int[] e, int[] f)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			e[i + m] = f[i];
		}
		for (i = 0;i < 100;i++)
		{
			x[i] = e[i];
		}
	}
	public static void show(int[] g)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",x[i]);
		}
		System.out.printf("%d\n",x[m + n - 1]);
	}

}

