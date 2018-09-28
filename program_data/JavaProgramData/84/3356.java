package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int max = 0;
		int m2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > m2 && a[i] != max)
			{
				m2 = a[i];
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",m2);
		return 0;
	}
}

