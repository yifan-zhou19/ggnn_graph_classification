package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int t;
	public static void shuru(int p,int q)
	{
		for (i = 0;i < p;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < q;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void shuchu(int p,int q)
	{
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < q - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[q - 1]);
	}
	public static void paixu(int p, int[] c)
	{
		for (i = 0;i < p;i++)
		{
		for (j = 0;j < i;j++)
		{
		if (c[i] < c[j])
		{
			t = c[i];
			c[i] = c[j];
			c[j] = t;
		}
		}
		}
	}
	public static int Main()
	{
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
		shuru(n, m);
		paixu(n, a);
		paixu(m, b);
		shuchu(n, m);

	}
}

