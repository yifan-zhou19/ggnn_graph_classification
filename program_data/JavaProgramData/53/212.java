package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int bl;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			bl = 0;
			for (i = 0;i <= j - 1;i++)
			{
				if (a[i] == a[j])
				{
					bl = 1;
				}
			}
			if (bl == 0)
			{
				b[k++] = a[j];
			}
		}
		for (j = 0;j <= k - 1;j++)
		{
			if (j == k - 1)
			{
				System.out.printf("%d\n",b[j]);
			}
				else
				{
					System.out.printf("%d,",b[j]);
				}
		}
	}
}

