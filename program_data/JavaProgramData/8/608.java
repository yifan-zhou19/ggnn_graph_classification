package <missing>;

public class GlobalMembers
{
	public static void paixu(int n, int[] a)
	{
		int i;
		int j;
		int m;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
	}
	public static void link(int[] a, int[] b, int[] c, int n, int m)
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


	public static void Main()
	{
		int i;
		int k;
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
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
		for (k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < m;k++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[k] = Integer.parseInt(tempVar4);
			}
		}
		paixu(n, a);
		paixu(m, b);
		link(a, b, c, n, m);
		System.out.printf("%d",c[0]);
		for (i = 1;i < n + m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
	}


}

