package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int m;
	public static int n;


	public static void inputarray(int[] a, int n)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
	}

	public static void input()
	{
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
		inputarray(a, m);
		inputarray(b, n);
	}

	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void combine(int[] a, int[] b, int[] c, int m, int n)
	{
		int i;
		for (i = 0; i < m; i++)
		{
			c[i] = a[i];
		}
		for (; i < m + n; i++)
		{
			c[i] = b[i - m];
		}
	}

	public static void output(int[] a, int n)
	{
		int i;
		for (i = 0; i < n - 1; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d", a[i]);
	}

	public static void Main()
	{
		input();
		sort(a, m);
		sort(b, n);
		combine(a, b, c, m, n);
		output(c, m + n);
	}

}

