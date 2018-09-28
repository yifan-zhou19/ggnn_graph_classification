package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[150];
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
		if (n % 2 == 0)
		{
			for (i = 0;i < n / 2;i++)
			{
				t = a[i];
				a[i] = a[n - 1 - i];
				a[n - 1 - i] = t;
			}
			for (i = 0;i < n - 1;i++)
			{
				System.out.printf("%d ",a[i]);
			}
			System.out.printf("%d\n",a[n - 1]);
		}
		else
		{
			for (i = 0;i < (n - 1) / 2;i++)
			{
				t = a[i];
				a[i] = a[n - 1 - i];
				a[n - 1 - i] = t;
			}
			for (i = 0;i < n - 1;i++)
			{
				System.out.printf("%d ",a[i]);
			}
			System.out.printf("%d\n",a[n - 1]);
		}
		return 0;
	}



}

