package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 0;i <= n - m - 1;i++)
		{
			b[i + m] = a[i];
		}
		for (i = n - m;i <= n - 1;i++)
		{
			b[i - n + m] = a[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = b[i];
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

}

