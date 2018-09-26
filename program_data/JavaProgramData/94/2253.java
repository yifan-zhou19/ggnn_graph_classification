package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int[] a = new int[500];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j] > a[j + 1])
				{
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.printf("%d,", a[i]);
			}
		}
		if (a[n - 2] % 2 != 0)
		{
			System.out.printf("%d", a[n - 2]);
		}
		else
		{
			System.out.printf("%d", a[n - 1]);
		}
		return 0;
	}

}

