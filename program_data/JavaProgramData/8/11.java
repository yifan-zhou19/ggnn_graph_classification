package <missing>;

public class GlobalMembers
{
	public static void read(int[] a, int m, int[] b, int n)
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
	}
	public static void order(int[] a, int n)
	{
		int i;
		int j;
		int aaa;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					aaa = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aaa;
				}
			}
		}

	}
	public static void combine(int[] a, int m, int[] b, int n)
	{
		int i;
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
		int[] a = new int[100];
		int[] b = new int[100];
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
		read(a, m, b, n);
		order(a, m);
		order(b, n);
		combine(a, m, b, n);
	}
}

