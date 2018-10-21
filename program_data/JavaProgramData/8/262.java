package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int i;
	public static int j;
	public static int n;
	public static int m;
	public static void read()
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
	public static void sort()
	{
		int t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = i;j < m;j++)
			{
				if (a[j] < a[i])
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
				if (b[j] < b[i])
				{
					t = b[j];
					b[j] = b[i];
					b[i] = t;
				}
			}
		}
	}
	public static void add()
	{
		for (i = m,j = 0;j < n;i++,j++)
		{
			a[i] = b[j];
		}
	}
	public static void print()
	{
		for (i = 0;i < m + n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}

	public static void Main()
	{
		read();
		sort();
		add();
		print();
	}

}

