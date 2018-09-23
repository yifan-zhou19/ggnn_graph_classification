package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] h = new int[MAX];
		int[] a = new int[MAX];
		int n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		a[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
				a[i] = 1;
			for (j = i + 1;j < k;j++)
			{
					if (h[j] < h[i] || h[j] == h[i])
					{
							if ((a[j] + 1) > a[i])
							{
							a[i] = a[j] + 1;
							}
					}
			}

		}
		for (i = 0;i < k;i++)
		{
			if (a[i] > n)
			{
				n = a[i];
			}
		}
		System.out.printf("%d",n);
	}
}

