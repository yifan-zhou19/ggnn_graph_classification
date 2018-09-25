package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int i;
		int j = 0;
		int b;
		int k = 0;
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
				b = Integer.parseInt(tempVar2);
			}
			if (b % 2 != 0)
			{
				a[k] = b;
				k += 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[k - 1]);
		return 0;
	}
}

