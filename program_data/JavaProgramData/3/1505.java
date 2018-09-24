package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int s;
		int[] sz = new int[1000];
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
		for (i = 0;i < n;i++)
		{
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 sz[i] = Integer.parseInt(tempVar3);
						 }
		}
		for (i = 0;i < n - 1;i++)
		{
						   for (j = i + 1;j <= n - 1;j++)
						   {
												if (sz[i] + sz[j] == k)
												{
													  s = 1;
													  break;
												}
												else
												{
													   s = 0;
												}
						   }
						   if (s == 1)
						   {
									  System.out.print("yes");
									  break;
						   }
						   if (i == n - 2 && s == 0)
						   {
									System.out.print("no");
						   }
		}

									return 0;
	}


}

