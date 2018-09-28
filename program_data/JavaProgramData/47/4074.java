package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < (n / 2);i++)
		{
					e = a[i];
					a[i] = a[n - i - 1];
					a[n - i - 1] = e;
		}
		for (i = 0;i < n;i++)
		{
			if (i != (n - 1))
			{
				System.out.printf("%d ",a[i]);
			}
			if (i == (n - 1))
			{
				System.out.printf("%d",a[i]);
			}
		}

		return 0;

	}

}

