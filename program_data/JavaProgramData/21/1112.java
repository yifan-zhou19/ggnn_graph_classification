package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int n;
		int b;
		double k = 0;
		double k1;
		double k2;
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
			k = k + a[i];
		}
		k = (k * 1.0) / (n * 1.0);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
		k1 = k - a[0];
		k2 = a[n - 1] - k;
		if (k1 > k2)
		{
			System.out.printf("%d",a[0]);
		}
		if (k1 < k2)
		{
			System.out.printf("%d",a[n - 1]);
		}
		if (k1 == k2)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);

		}
	}
}

