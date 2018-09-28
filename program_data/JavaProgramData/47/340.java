package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i = n - 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int e;
		for (k = 1;k < n / 2 + 1;k++)
		{
			e = a[n - k];
			a[n - k] = a[k - 1];
			a[k - 1] = e;
		}
		for (t = 0;t < n - 1;t++)
		{
			System.out.printf("%d ",a[t]);
		}
		if (t = n - 1)
		{
			System.out.printf("%d",a[t]);
		}
		return 0;
	}
}

