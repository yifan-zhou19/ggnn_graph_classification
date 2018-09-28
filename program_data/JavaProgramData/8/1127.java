package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n - i;j++)
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

	public static void ipt(int[] a, int n)
	{
		int i = 1;
		while (i <= n)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (i != n)
			{
				scanf(" ");
			}
			i++;
		}
	}

	public static void opt(int[] a, int n)
	{
		int i = 1;
		while (i <= n)
		{
			System.out.printf("%d",a[i]);
			if (i != n)
			{
				System.out.print(" ");
			}
			i++;
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		ipt(a, n);
		ipt(b, m);
		sort(a, n);
		sort(b, m);
		opt(a, n);
		System.out.print(" ");
		opt(b, m);
	}
}

