package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = a[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i + m <= n - 1)
			{
				a[i + m] = b[i];
			}
			if (i + m > n - 1)
			{
				a[i + m - n] = b[i];
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);

	}
}

