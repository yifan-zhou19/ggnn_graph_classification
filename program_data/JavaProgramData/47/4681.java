package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[max];
		int[] a = new int[max];
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k < n;k++)
		{
			a[k] = sz[n - k + 1];
			System.out.printf("%d ",a[k]);
		}
		a[n] = sz[1];
		System.out.printf("%d",a[n]);
		return 0;
	}

}

