package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int[] b = new int[20];
	public static int[] c = new int[20];
	public static void f()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
	}
	public static void g(int[] d, int s)
	{
	   for (i = 0;i < s;i++)
	   {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				d[i] = Integer.parseInt(tempVar);
			}
	   }
	}
	public static void h(int[] a, int n, int p)
	{
		for (j = 0;j < n - 1;j++)
		{
		for (i = 0;i < n - 1 - j;i++)
		{
			if (a[i] > a[i + 1])
			{
				m = a[i];
				a[i] = a[i + 1];
				a[i + 1] = m;
			}
		}
		}
			for (i = 0;i < n - 1;i++)
			{
				System.out.printf("%d ",a[i]);
			}
		if (p == 1)
		{
			System.out.printf("%d ",a[n - 1]);
		}
		if (p == 2)
		{
			System.out.printf("%d\n",a[n - 1]);
		}
	}
	public static void Main()
	{
		f();
		g(b, l);
		g(c, k);
		h(b, l, 1);
		h(c, k, 2);
	}

}

