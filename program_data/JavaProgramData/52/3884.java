package <missing>;

public class GlobalMembers
{
	public static void xunhuan(int[] a, int n, int m)
	{
		int i;
		int j;
		int t;
		int temp;
		for (j = 0;j < m;j++)
		{
			temp = a[0];
			a[0] = a[n - 1];
			for (i = 0;i < n - 1;i++)
			{
				t = a[i + 1];
				a[i + 1] = temp;
				temp = t;
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
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
		xunhuan(a, n, m);
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}

