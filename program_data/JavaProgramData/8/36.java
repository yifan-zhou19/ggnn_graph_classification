package <missing>;

public class GlobalMembers
{
	public static void pai(int[] a, int m)
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
	}
	public static void shuru(int[] a, int[] b, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		pai(a, m);
		pai(b, n);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
					  System.out.printf("%d",b[n - 1]);

	}
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		shuru(a, b, m, n);
	}
}

