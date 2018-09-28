package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int min = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i - 1] > max)
			{
			max = a[i - 1];
			}
		}
		System.out.printf("%d\n",max);
		for (i = 1;i <= n;i++)
		{
			if (a[i - 1] < max && a[i - 1]> min)
			{
			min = a[i - 1];
			}
		}
		System.out.printf("%d\n",min);
		return 0;
	}
}

