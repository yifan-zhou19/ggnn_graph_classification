package <missing>;

public class GlobalMembers
{
	public static void swap(int[] pa, int n, int m)
	{
		int[] a = new int[100];
		int i;
		for (i = 0;i < m;i++)
		{
			a[i] = pa[n - m + i];
		}
		for (i = 0;i < n - m;i++)
		{
			pa[n - 1 - i] = pa[n - 1 - i - m];
		}
		for (i = 0;i < m;i++)
		{
			pa[i] = a[i];
		}
		return;
	}
	public static void Main()
	{
		int[] c = new int[100];
		int i;
		int n;
		int m;
		int[] p = c;
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
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		swap(p, n, m);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[n - 1]);
	}

}

