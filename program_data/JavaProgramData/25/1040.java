package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int k = 1;
		int i;
		int n;
		int j;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				a[j] = a[j] * 2 + r;
				if (a[j] > 9)
				{
					r = a[j] / 10;
					a[j] = a[j] % 10;
					if (j + 1 == k)
					{
						k++;
					}
				}
				else
				{
					r = 0;
				}
			}
		}
		if (r != 0)
		{
			a[k] = r;
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
		return 0;
	}
}

