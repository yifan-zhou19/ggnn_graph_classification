package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static void Do(int m,int n)
	{
		int[] a = new int[m];
		int[] b = new int[n];
		int i;
		for (i = 0;i < m;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		}
		qsort(a,m,4,compare);
		qsort(b,n,4,compare);
		for (i = 0;i < m;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[n - 1]);
	}
	public static int Main()
	{
		int m;
		int n;
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
		Do(m, n);
	}

}

