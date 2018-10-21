package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[SIZE];
		int[] b = new int[SIZE];
		int m;
		int n;
		int i;
		int t;
		int j;
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
		//printf("%d %d",m, n);

		for (i = 0; i < m; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0; i < n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1 - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		System.out.printf("%d", a[0]);
		for (i = 1; i < m; i++)
		{
			System.out.printf(" %d", a[i]);
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf(" %d", b[i]);
		}
		return 0;
	}

}

