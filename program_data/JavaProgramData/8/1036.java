package <missing>;

public class GlobalMembers
{
	public static void input(int[] a, int[] b)
	{
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[49] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[49] = Integer.parseInt(tempVar2);
		}
		m = a[49];
		n = b[49];
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
	}
	public static void order(int m, int n, int[] a, int[] b)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
	}
	public static void comb(int m, int n, int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < (m + n);i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void print(int m, int n, int[] c)
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;i < (m + n);i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
	public static void Main()
	{
		int[] a = new int[50];
		int[] b = new int[50];
		int[] c = new int[100];
		input(a, b);
		order(a[49], b[49], a, b);
		comb(a[49], b[49], a, b, c);
		print(a[49], b[49], c);
	}
}

