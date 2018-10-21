package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int l;
		int[] a = new int[500];
		float k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,k = 0F;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			k = k + a[i];
		}
		k = k / n;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[i])
				{
					l = a[j];
					a[j] = a[i];
					a[i] = l;
				}
			}
		}
		if (k - a[0] * 1.0 > a[n - 1] * 1.0 - k)
		{
			System.out.printf("%d",a[0]);
		}
		if (k - a[0] * 1.0 < a[n - 1] * 1.0 - k)
		{
			System.out.printf("%d",a[n - 1]);
		}
		if (k - a[0] * 1.0 == a[n - 1] * 1.0 - k)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		return 0;
	}
}

