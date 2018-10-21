package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int m;
	public static int n;
	public static int Main()
	{
		void Read(),Ord(),Gath(),Prin();
		Read();
		Ord();
		Gath();
		Prin();
	}

	public static void Read()
	{
		int i;
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
		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void Ord()
	{
		int i;
		int j;
		void swap_a(int i,int j),swap_b(int i,int j);
		for (i = 1;i <= m - 1;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (a[i] > a[j])
				{
					swap_a(i, j);
				}
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (b[i] > b[j])
				{
					swap_b(i, j);
				}
			}
		}
	}

	public static void Gath()
	{
		int i;
		for (i = m + 1;i <= m + n;i++)
		{
			a[i] = b[i - m];
		}
	}

	public static void Prin()
	{
		int i;
		System.out.printf("%d",a[1]);
		for (i = 2;i <= m + n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

	public static void swap_a(int i,int j)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void swap_b(int i,int j)
	{
		int temp;
		temp = b[i];
		b[i] = b[j];
		b[j] = temp;
	}
}

