package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[MAX];
	public static int Main()
	{
		a[0] = 1;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= MAX;j++)
			{
				a[j] = 2 * a[j];
			}
			for (j = 0;j <= MAX;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] += a[j] / 10;
					a[j] = a[j] % 10;
				}
			}
		}
		int k;
		for (i = MAX;i >= 0;i--)
		{
			if (a[i] != 0)
			{
			   k = i;
			   break;
			}
		}
		for (i = k;i >= 0;i--)
		{
		System.out.printf("%d",a[i]);
		}
	}
}

