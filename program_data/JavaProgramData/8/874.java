package <missing>;

public class GlobalMembers
{
	public static void read(int[] a, int m)
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
	}
	public static void bubble(int[] a, int m)
	{
		int i;
		int j;
		int tmp;
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
	public static void add(int[] a, int[] b, int[] c, int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			c[i + m] = b[i];
		}
	}
	public static void out(int[] c, int m)
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
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
		read(a, m);
		read(b, n);
		bubble(a, m);
		bubble(b, n);
		add(a, b, c, m, n);
		out(c, m + n);
		return 0;
	}














}

