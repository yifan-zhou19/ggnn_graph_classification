package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}

		for (i = 1;i <= n - 1;i++)
		{
			for (j = n - i;j <= n - 1;j++)
			{
				if (a[n - 1 - i] >= a[j])
				{
					if (b[n - i - 1] < b[j] + 1)
					{
						b[n - i - 1] = b[j] + 1;
					}
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);

	}
}

