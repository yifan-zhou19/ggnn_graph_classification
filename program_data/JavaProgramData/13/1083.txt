package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int i;
	   int j;
	   int m;
		int[] x = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		 System.out.printf("%d",x[0]);
		for (i = 0;i <= k - 2;i++)
		{
						   for (j = i + 1;j <= k - 1;)
						   {
												if (x[i] == x[j])
												{
															  for (m = j + 1;m <= k - 1;m++)
															  {
																  x[m - 1] = x[m];
															  }
															  k--;
												}
															else
															{
																j++;
															}
						   }
		}
		for (i = 1;i <= k - 1;i++)
		{
			System.out.printf(" %d",x[i]);
		}
	}
}

