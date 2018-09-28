package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int sum = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				b[0] = a[0];
			}
			if (i >= 1)
			{
				for (k = 0;k < i;k++)
				{
					if (a[k] == a[i])
					{
						break;
					}
				}
				if (k == i)
				{
					sum++;
					b[sum] = a[i];
				}
			}
		}
		for (k = 0;k < sum;k++)
		{
			System.out.printf("%d,",b[k]);
		}
		System.out.printf("%d",b[sum]);
		return 0;
	}
}

