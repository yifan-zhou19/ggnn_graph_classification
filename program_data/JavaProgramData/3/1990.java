package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		j = 0;
		int[] a = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   a[i] = Integer.parseInt(tempVar3);
						   }
		}
		for (i = 1;i <= n;i++)
		{
						 for (j = 0;j <= n - i - 1;j++)
						 {
											if (a[j] > a[j + 1])
											{
														   tmp = a[j];
														   a[j] = a[j + 1];
														   a[j + 1] = tmp;
											}
						 }
		}

		for (i = 0;i <= n - 1;i++)
		{
			 for (j = i + 1;j <= n - i - 1;j++)
			 {
								if (k == a[i] + a[j])
								{
												 System.out.print("yes");
												 break;
								}
			 }
			 if (k == a[i] + a[j])
			 {
				  break;
			 }
		}
		if (i == n)
		{
			System.out.print("no");
		}

		return 0;
	}

}

