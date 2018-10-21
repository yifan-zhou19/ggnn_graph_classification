package <missing>;

public class GlobalMembers
{
	public static void f1(int n, int[] a)
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
	public static void f2(int n, int[] a)
	{
		int i;
		int j;
		int k;

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}


	}
	public static void f3(int n, int m, int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = n;i < n + m;i++)
		{
			c[i] = b[i - n];
		}

	}
	public static void f4(int n, int m, int[] c)
	{
		System.out.printf("%d",c[0]);
		int i;
		for (i = 1;i < n + m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
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
		f1(n, a);
		f1(m, b);
		f2(n, a);
		f2(m, b);
		f3(n, m, a, b, c);
		f4(n, m, c);
		return 0;
	}

}

