package <missing>;

public class GlobalMembers
{
	public static void input()
	{
		int i;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(int[] a, int n, int[] b, int m)
	{
		int i;
		int j;
		int min;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			min = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[min])
				{
					min = j;
				}
			}
			if (min != i)
			{
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			min = i;
			for (j = i + 1;j < m;j++)
			{
				if (b[j] < b[min])
				{
					min = j;
				}
			}
			if (min != i)
			{
				temp = b[i];
				b[i] = b[min];
				b[min] = temp;
			}
		}
	}
	public static void merger(int[] a, int n, int[] b, int m)
	{
		int i;
		int j;
		for (i = n,j = 0;i < n + m,j < m;i++)
		{
			a[i] = b[j++];
		}
	}
	public static void output(int[] a, int n, int m)
	{
		int i;
		for (i = 0;i < n + m - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n + m - 1]);
	}
	public static int n;
	public static int m;
	public static int[] a = new int[200];
	public static int[] b = new int[100];
	public static void Main()
	{
		input();
		sort(a, n, b, m);
		merger(a, n, b, m);
		output(a, n, m);
	}
}

