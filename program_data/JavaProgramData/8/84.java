package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int[] c = new int[40];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int temp;
	public static void Main()
	{
		void putin(int a[20],int b[20]);
		void exchange(int a[20],int b[20]);
		void together(int a[20],int b[20]);
		void putout(int c[40]);
		putin(a, b);
		exchange(a, b);
		together(a, b);
		putout(c);
	}
	public static void putin(int[] a, int[] b)
	{
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void exchange(int[] a, int[] b)
	{
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
	}
	public static void together(int[] a, int[] b)
	{
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			c[m + i] = b[i];
		}
	}
	public static void putout(int[] c)
	{
		for (i = 0;i < m + n;i++)
		{
			System.out.printf("%d",c[i]);
			if (i != m + n - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

