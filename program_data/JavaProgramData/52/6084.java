package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] a = new int[200];
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
		System.in.read();
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
			a[n + i] = a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			a[i] = a[n - m + i];
			System.out.printf("%d ",a[i]);
		}
		a[n - 1] = a[2 * n - m - 1];
		System.out.printf("%d",a[n - 1]);
		return 0;
	}

}

