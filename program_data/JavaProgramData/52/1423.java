package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int n;
		int m;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (i < n - m)
			{
				a[i + m + n] = a[i];
			}
			if (i >= n - m)
			{
				a[i + m] = a[i];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			 System.out.printf("%d ",a[i + n]);
		}
		System.out.printf("%d",a[2 * n - 1]);
	return 0;
	}

}

