package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static int m;
	public static int n;
	public static void loaddata()
	{
		int l;
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
		for (l = 0;l < m;l++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[l] = Integer.parseInt(tempVar3);
			}
		}
		for (l = 0;l < n;l++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[l] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void arrsort()
	{
		int i;
		int j;
		int k;
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (a[i] > a[j])
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] > b[j])
				{
					k = b[i];
					b[i] = b[j];
					b[j] = k;
				}
			}
		}

	}
	public static void add()
	{
		int p;
		for (p = 0;p < n;p++)
		{
			a[p + m] = b[p];
		}
	}
	public static void print()
	{
		int q;
		System.out.printf("%d",a[0]);
		for (q = 1;q < m + n;q++)
		{
			System.out.printf(" %d",a[q]);
		}
	}

	public static int Main()
	{
		loaddata();
		arrsort();
		add();
		print();
		return 0;
	}
}

