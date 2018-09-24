package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[10000];
		for (i = 0;i < 10000;i++)
		{
			if (i % 2 != 0)
			{
				a[i] = i;
			}
		}
		for (i = 3;i < 100;i = i + 2)
		{
			for (j = i + 2;j < 10000;j++)
			{
				if (a[j] != 0)
				{
					a[j] = j % i;
				}
			}
		}
		for (i = 0;i < 10000;i++)
		{
			if (a[i] != 0)
			{
				a[i] = i;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n / 2 + 1;i++)
		{
		if (a[i] != 0 && (a[n - a[i]]))
		{
			System.out.printf("%d %d\n",a[i],n - a[i]);
		}
		}

	}

}

