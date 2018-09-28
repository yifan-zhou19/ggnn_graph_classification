package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[] a = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] b = new int[100];

		for (i = 0;i < n;i++)
		{
			if (i < n - m)
			{
				b[i + m] = a[i];
			}
			else if (i >= n - m)
			{
				b[i - n + m] = a[i];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);

		return 0;
	}
}

