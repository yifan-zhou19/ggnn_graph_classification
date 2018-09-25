package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n;
	public static int m;
	public static int[] c = new int[1000];
	public static void input(int[] a, int[] b)
	{
		int i;
		int j;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= m - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void charge(int[] a, int[] b)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i <= m - 2;i++)
		{
			for (j = i + 1;j <= m - 1;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
	public static void hook(int[] a, int[] b)
	{
		int i;
		int j;
		for (i = n,j = 0;i <= n + m - 1;i++,j++)
		{
			a[i] = b[j];
		}
	}
	public static void print(int[] a)
	{
		int i;
		for (i = 0;i <= m + n - 2;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[m + n - 1]);
	}
	public static int Main()
	{
		input(a, b);
		charge(a, b);
		hook(a, b);
		print(a);
		return 0;
	}
}

