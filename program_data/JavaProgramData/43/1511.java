package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int l;
		int i;
		int j;
		int[] a = new int[10000];
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m;i = i + 2)
		{
			for (j = 3;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
				if (j >= i)
				{
					a[k] = i;
				k++;
				}
		}
		for (n = 1;n <= k;n++)
		{
			for (l = n;l <= k;l++)
			{
		if (a[n] + a[l] == m)
		{
			System.out.printf("%d %d\n",a[n],a[l]);
		}
			}
		}

		return 0;
	}
}

