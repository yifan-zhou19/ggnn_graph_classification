package <missing>;

public class GlobalMembers
{
	public static void get(int n, int[] a)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar;
			}
		}
	}
	public static void order(int n, int[] a)
	{
		int i;
		int j;
		int t;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
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
	public static void puttogether(int n, int[] a, int m, int[] b)
	{
		int i;
		for (i = n;i < n + m;i++)
		{
			a[i] = b[i - n];
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n + m;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int m;
		int n;
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
		get(n, a);
		get(m, b);
		order(n, a);
		order(m, b);
		puttogether(n, a, m, b);
		return 0;
	}
}

