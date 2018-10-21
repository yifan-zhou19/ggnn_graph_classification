package <missing>;

public class GlobalMembers
{
	public static int order(int n, int[] a)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
		for (j = i;j < n;j++)
		{
		if (a[i] > a[j])
		{
		k = a[i];
		a[i] = a[j];
		a[j] = k;
		}
		}
		}
	}
	public static int combine(int[] a, int[] b, int n, int m, int[] c)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (j = 0;j < m;j++,i++)
		{
			c[i] = b[j];
		}
	}
	public static int input(int n, int[] a)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static int output(int n, int[] a)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
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
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[n + m];
		input(n, a);
		input(m, b);
		order(n, a);
		order(m, b);
		combine(a, b, n, m, c);
		output(n + m, c);
		return 0;
	}
}

