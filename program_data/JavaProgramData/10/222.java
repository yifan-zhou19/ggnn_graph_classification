package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp;
		int[] high = new int[30];
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 30;i++)
		{
			a[i] = 1;
		}
		for (i = n;i >= 1;i--)
		{
			for (j = n;j > i;j--)
			{
				if (high[j] <= high[i])
				{
					if (a[j] + 1 > a[i])
					{
						a[i] = a[j] + 1;
					}
				}
			}
		}
		tmp = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] > tmp)
			{
				tmp = a[i];
			}
		}
		System.out.printf("%d",tmp);
		return 0;
	}
}

