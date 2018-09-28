package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[100];
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
		for (i = n - 1;i > 0;i--)
		{
			if (a[i] > a[i - 1])
			{
				k = a[i];
				a[i] = a[i - 1];
				a[i - 1] = k;
			}
		}
		for (i = n - 1;i > 1;i--)
		{
			if (a[i] > a[i - 1])
			{
				k = a[i];
				a[i] = a[i - 1];
				a[i - 1] = k;
			}
		}
		System.out.printf("%d\n%d\n",a[0],a[1]);
		return 0;
	}
}

