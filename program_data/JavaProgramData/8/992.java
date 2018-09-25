package <missing>;

public class GlobalMembers
{
	public static void output(int[] c, int m, int n)
	{
		int i;
		System.out.printf("%d",c[1]);
		for (i = 2;i <= n + m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
	public static void combine(int[] a, int[] b, int m, int n)
	{
		int[] c = new int[100];
		int i;
		int j = 1;
		for (i = 1;i <= m;i++)
		{
			c[i] = a[i];
		}
		for (i = m + 1;i <= n + m;i++,j++)
		{
			c[i] = b[j];
		}
		output(c, m, n);
	}
	public static void order(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		combine(a, b, m, n);
	}
	public static void input()
	{
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		order(a, b, m, n);
	}
	public static int Main()
	{
		input();
		return 0;
	}
}

