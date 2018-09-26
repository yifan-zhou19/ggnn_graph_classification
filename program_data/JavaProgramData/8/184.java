package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void f()
	{
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
		int i;
		int j;
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static int g(int[] a, int l)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < l;j++)
		{
			for (i = 0;i < l - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		return a[0];

	}
	public static void p(int[] a, int[] b)
	{
		int i;
		int j;
		for (i = 0;i <= m - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		for (j = 0;j <= n - 2;j++)
		{
			System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d",b[n - 1]);


	}
	public static void Main()
	{
		f();
	g(a, m);
	g(b, n);
	p(a, b);
	}

}

