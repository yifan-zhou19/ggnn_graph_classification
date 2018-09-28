package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static void f1(int[] a, int[] b)
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
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void f2(int[] a, int[] b)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < (n - 1);j++)
		{
			for (i = (n - 1);i > j;i--)
			{
			if (a[i] < a[i - 1])
			{
			t = a[i];
		a[i] = a[i - 1];
		a[i - 1] = t;
			}
			}
		}
		for (j = 0;j < (n - 1);j++)
		{
			for (i = (m - 1);i > j;i--)
			{
			if (b[i] < b[i - 1])
			{
			t = b[i];
		b[i] = b[i - 1];
		b[i - 1] = t;
			}
			}
		}
	}
	public static void f3(int[] a, int[] b)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			a[n + i] = b[i];
		}
	}
	public static void f4(int[] a)
	{
		int i;
		for (i = 0;i < (n + m);i++)
		{
			System.out.printf("%d",a[i]);
		if (i != (n + m - 1))
		{
			System.out.print(" ");
		}
		}
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		f1(a, b);
		f2(a, b);
		f3(a, b);
		f4(a);
	}

}

