package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[201];
		int n;
		int m;
		int i;
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n + 1;i <= 2 * n - m;i++)
		{
			a[i] = a[i - n];
		}
		for (i = n - m + 1;i <= 2 * n - m;i++)
		{
			if (i != n - m + 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i]);
		}
	}
}

