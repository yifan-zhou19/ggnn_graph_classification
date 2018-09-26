package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int n1;
		int n2;
		void shubingpai(int x[],int y[],int z[],int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n2;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		shubingpai(a, b, c, n1, n2);
		for (i = 0;i < (n1 + n2 - 1);i++)
		{
		System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[n1 + n2 - 1]);
	}
	public static void shubingpai(int[] x, int[] y, int[] z, int m, int n)
	{
		void pai(int c[],int n);
		int i;
		pai(x, m);
		pai(y, n);
		for (i = 0;i < m;i++)
		{
		z[i] = x[i];
		}
		for (i = m;i < m + n;i++)
		{
		z[i] = y[i - m];
		}
	}
	public static void pai(int[] c, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
			if (c [j] < c [k])
			{
			k = j;
			}
			}
			t = c[k];
			c[k] = c[i];
			c[i] = t;
		}
	}

}

