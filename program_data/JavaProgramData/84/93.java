package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int k1 = 0;
		int k2 = 0;
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
			if (a[i] > k1)
			{
				k2 = k1,k1 = a[i];
			}
			else if (a[i] <= k1 != 0 && a[i] >= k2)
			{
				k2 = a[i];
			}
		}
		System.out.printf("%d\n%d\n",k1,k2);
	}

}

