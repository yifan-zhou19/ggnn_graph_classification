package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int r,int a[10000]);
		void g(int m,int n,int a[1000],int b[1000],int c[1000]);
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
		int[] a = new int[1000];
		int[] b = new int[10000];
		int[] c = new int[1000];
		int i;
		int j;
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
		f(m, a);
		f(n, b);
		g(m, n, a, b, c);
		for (i = 0;i < m + n - 1;i++)
		{
		System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d\n",c[m + n - 1]);
	}
	public static void f(int r, int[] a)
	{
		int t;
		int i;
		int j;
		for (i = 0;i < r - 1;i++)
		{
			for (j = 0;j < r - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void g(int m, int n, int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 0;i < m + n;i++)
		{
			if (i < m)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i - m];
			}
		}
	}

}

