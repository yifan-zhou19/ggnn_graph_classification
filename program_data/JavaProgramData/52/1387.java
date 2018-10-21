package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int j;
		int m;
		int n;
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
		}
		for (i = 0;i < n - m;i++)
		{
			j = i + m + n;
			a[j] = a[i];
		}
		for (i = n - m;i < n;i++)
		{
			j = i + m;
			a[j] = a[i];
		}
		System.out.printf("%d",a[n]);
		for (i = n + 1;i < 2 * n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return (0);
	}
}

