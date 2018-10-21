package <missing>;

public class GlobalMembers
{
	public static void pai(int n, int[] a)
	{
		for (int i = 0;i < n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (int i = 0;i < n;i++)
		{
		for (int r = 1;r < n - i;r++)
		{
		if (a[i + r] < a[i])
		{
		int k = a[i];
		a[i] = a[i + r];
		a[i + r] = k;
		}
		}
		}
	}
	public static int link(int n,int m)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		pai(n, a);
		pai(m, b);
		for (int i = 0;i < n;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		for (int i = 0;i < m - 1;i++)
		{
		System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[m - 1]);
	}

	public static int Main()
	{
		int n;
		int m;
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
		link(n, m);
		System.out.print("\n");
	}
}

