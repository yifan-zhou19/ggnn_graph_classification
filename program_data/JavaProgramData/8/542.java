package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void f1()
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

	public static void f2(int[] k, int l)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < l - 1;i++)
		{
			for (j = i;j < l;j++)
			{
				if (k[i] > k[j])
				{
					t = k[i];
					k[i] = k[j];
					k[j] = t;
				}
			}
		}
	}

	public static void f3()
	{
		f2(a, m);
		f2(b, n);
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

	public static void f4()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}

	public static void Main()
	{
		f1();
		f3();
		f4();
	}


}

