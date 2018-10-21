package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int k;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		i = 0;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			i = i + 1;
		}
		for (j = 0;j < n - 1;j = j + 1)
		{
						   for (i = j - 1;i < n - 1;i = i + 1)
						   {
												if (a[i] + a[j] == k)
												{
																break;
												}
						   }
						   if (a[i] + a[j] == k)
						   {
										   break;
						   }
		}
		if (a[i] + a[j] == k)
		{
					 System.out.print("yes");
		}
		else
		{
					 System.out.print("no");
		}
		return 0;
	}
}

