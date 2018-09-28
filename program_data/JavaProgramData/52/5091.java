package <missing>;

public class GlobalMembers
{
	public static void move(int[] a, int[] b, int n, int m)
	{
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			if (i >= m)
			{
				b[i] = a[i - m];
			}
			else
			{
				b[i] = a[n - m + i];
			}
		}
	}

	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		move(a, b, n, m);
		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);
		return 0;
	}
}

