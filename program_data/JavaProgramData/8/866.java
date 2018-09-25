package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static void f1()
	{
		int i;
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
	public static void f2()
	{
		int i;
		int j;
		int p;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					p = b[j];
					b[j] = b[j + 1];
					b[j + 1] = p;
				}
			}
		}
	}
	public static void f3()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = n;i < n + m;i++)
		{
			c[i] = b[i - n];
		}
	}
	public static void f4()
	{
		int i;
		int count = 0;
		for (i = 0;i < n + m;i++)
		{
			if (count == 0)
			{
				System.out.printf("%d",c[i]);
				count++;
			}
			else
			{
				System.out.printf(" %d",c[i]);
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		f1();
		f2();
		f3();
		f4();
		return 0;
	}

}

