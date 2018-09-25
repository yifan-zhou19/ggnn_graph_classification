package <missing>;

public class GlobalMembers
{
	public static void f(int[] a, int n)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[i])
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
	}
	public static void cmp(int[] a, int n, int[] b, int m)
	{
		int i = n;
		int j;
		for (j = 0;j < m;j++)
		{
			a[i] = b[j];
			i++;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[1000];
		int[] b = new int[500];
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
		f(a, n);
		f(b, m);
		cmp(a, n, b, m);
		for (i = 0;i < n + m - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n + m - 1]);
	}

}

