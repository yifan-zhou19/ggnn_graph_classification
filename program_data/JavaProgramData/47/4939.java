package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n % 2 == 0)
		{
			for (i = 0;i <= n / 2 - 1;i++)
			{
				t = a[i];
				a[i] = a[n - 1 - i];
				a[n - 1 - i] = t;
			}
			for (i = 0;i <= n - 1;i++)
			{
				if (i < n - 1)
				{
				System.out.printf("%d ",a[i]);
				}
			}
							   if (i = n - 1)
							   {
				System.out.printf("%d",a[i]);
							   }
		}
		if (n % 2 == 1)
		{
			for (i = 0;i <= (n - 1) / 2 - 1;i++)
			{
				t = a[i];
				a[i] = a[n - 1 - i];
				a[n - i - 1] = t;
			}
			for (i = 0;i <= n - 1;i++)
			{
							   if (i < n - 1)
							   {
				System.out.printf("%d ",a[i]);
							   }
			}
							   if (i = n - 1)
							   {
				System.out.printf("%d",a[i]);
							   }
		}
		return 0;
	}

}

