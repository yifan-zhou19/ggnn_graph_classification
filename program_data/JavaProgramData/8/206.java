package <missing>;

public class GlobalMembers
{
	public static void a(int k, int n)
	{
		int[] e = new int[300];
		int[] f = new int[300];
		int i = 0;
		int j = 0;
		int t = 0;
		for (i = 0;i < k;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				e[i] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f[j] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1;j++)
			{
				if (e[j] > e[j + 1])
				{
					t = e[j];
					e[j] = e[j + 1];
					e[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (f[j] > f[j + 1])
				{
					t = f[j];
					f[j] = f[j + 1];
					f[j + 1] = t;
				}
			}
		}
		for (i = k,j = 0;i < k + n;i++,j++)
		{
			e[i] = f[j];
		}
		for (i = 0;i < n + k;i++)
		{
			System.out.printf("%d",e[i]);
			if (i != n + k - 1)
			{
				System.out.print(" ");
			}
		}
	}
	public static void Main()
	{
		int k = 0;
		int n = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a(k, n);
	}
}

