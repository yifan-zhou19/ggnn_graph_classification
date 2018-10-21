package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int max1 = 0;
		int max2 = 0;
		int n;
		int i;
		int p;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (max1 < a[i])
			{
				max1 = a[i];
				p = i;
			}
		}
		a[p] = 0;
		for (i = 1;i <= n;i++)
		{
			if (max2 < a[i])
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n%d\n",max1,max2);
		return 0;
	}

}

