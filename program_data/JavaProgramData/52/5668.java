package <missing>;

public class GlobalMembers
{
	public static void swap(int x, int y, int[] a)
	{
		int t;
		while (x < y)
		{
			t = a[x];
			a[x] = a[y];
			a[y] = t;
			x++;
			y--;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
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
		swap(0, n - 1, a);
		swap(0, m - 1, a);
		swap(m, n - 1, a);
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}

