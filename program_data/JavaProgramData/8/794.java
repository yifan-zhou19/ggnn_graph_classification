package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[1000];
		int b;
		int k = 0;
		int tmp;
		int j;
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
		for (i = 1;i <= n + m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n + 1;i++)
		{
			for (j = 1;j <= n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		for (i = 1;i <= m + 1;i++)
		{
			for (j = n + 1;j <= n + m - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n + m;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}

