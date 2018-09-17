package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30];
		int[] b = new int[30];
		int n;
		int i;
		int j;
		int max;
		int ans = 0;
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
			b[i] = 1;
		}
		for (i = n - 1;i >= 0;i--)
		{
			max = 0;
			for (j = n - 1;j > i;j--)
			{
				if (a[i] >= a[j])
				{
					if (b[j] > max)
					{
						max = b[j];
					}
				}
				if (a[i] >= a[j] != 0 && b[j] == max)
				{
					b[i] = b[j] + 1;
				}
			}
			if (b[j] > ans)
			{
				ans = b[j];
			}
		}

		System.out.printf("%d",ans);
		return 0;
	}
}

