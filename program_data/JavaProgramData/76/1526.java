package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int x;
		int a;
		int b;
		int s = 0;
		int[] sz = new int[50001];
		int[] szz = new int[50001];
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
							  sz[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  szz[i] = Integer.parseInt(tempVar3);
						  }
		}
		for (k = 1;k <= n;k++)
		{
						  for (i = 0;i < n - k;i++)
						  {
											 if (sz[i] > sz[i + 1])
											 {
															   a = sz[i];
															   sz[i] = sz[i + 1];
															   sz[i + 1] = a;
															   b = szz[i];
															   szz[i] = szz[i + 1];
															   szz[i + 1] = b;
											 }
						  }
		}
		 for (i = 0;i < n - 1;i++)
		 {
							if (sz[i + 1] <= szz[i])
							{
							   s += 1;
							}
							else
							{
								 for (j = 0;j < i;j++)
								 {
												  if (sz[i + 1] <= szz[j])
												  {
													  s += 1;
												  }
								 }
							}
		 }
		for (k = 1;k <= n;k++)
		{
						  for (i = 0;i < n - k;i++)
						  {
											 if (szz[i] > szz[i + 1])
											 {
																 x = szz[i];
																 szz[i] = szz[i + 1];
																 szz[i + 1] = x;
											 }
						  }
		}
		if (s == n - 1)
		{
				 System.out.printf("%d %d",sz[0],szz[n - 1]);
		}
		else
		{
			 System.out.print("no");
		}


		 return 0;
	}


}

