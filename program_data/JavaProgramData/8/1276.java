package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static void f1(int[] a, int[] b, int h, int k)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = h;
		n = k;
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
		return;
	}
	public static void f2(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
		int k;
		for (j = m - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (a[i] > a[i + 1])
				{
					k = a[i];
					a[i] = a[i + 1];
					a[i + 1] = k;
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (b[i] > b[i + 1])
				{
					k = b[i];
					b[i] = b[i + 1];
					b[i + 1] = k;
				}
			}
		}
	}
	public static void f3(int[] a, int[] b, int[] c, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void f4(int[] c, int m, int n)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[i]);
	}
	public static void Main()
	{
		f1(a, b, m, n);
		f2(a, b, m, n);
		f3(a, b, c, m, n);
		f4(c, m, n);
	}
}

