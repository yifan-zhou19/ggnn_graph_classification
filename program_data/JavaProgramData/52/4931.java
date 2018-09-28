package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[202];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1] = Integer.parseInt(tempVar3);
		}
		for (i = 2;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = n + 1;i <= 2 * n - m;i++)
		{
			a[i] = a[i - n];
		}
		System.out.printf("%d",a[n - m + 1]);
		for (i = n - m + 2;i <= 2 * n - m;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return 0;
	}
}

