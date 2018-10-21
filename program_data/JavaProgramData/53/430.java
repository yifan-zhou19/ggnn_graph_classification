package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int m = 0;
		int k;
		int x;
		int[] b = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
	for (i = 0;i < n;i++)
	{
	b[i] = a[i];
	}
	for (j = 0;j < n;j++)
	{
			for (i = j + 1;i < n;i++)
			{
				if (b[j] == b[i])
				{
					m++;
					b[i] = 12345 + i;
				}
			}
	}
		for (x = 0;x < 5;x++)
		{
		for (j = 0;j < n;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				if (a[j] == a[i])
				{
					for (k = i;k < n - 1;k++)
					{
						a[k] = a[k + 1];
					}

				}
			}
		}
		}
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[n - m - 1]);

	}
}

