package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int p;
		int q;
		int i;
		int k;
		int m = 0;
		int e;
		int s;
		int t;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < p;i++)
		{
			for (k = 0;k < q;k++)
			{
							   String tempVar3 = ConsoleInput.scanfRead();
							   if (tempVar3 != null)
							   {
								   a[i][k] = Integer.parseInt(tempVar3);
							   }
			}
		}
		for (i = 0;i < p;i++)
		{
			if (m == 1)
			{
					 break;
			}
			for (k = 0;k < q;k++)
			{
				if (m == 1)
				{
						 break;
				}
				e = a[i][k];
				c = 0;
				for (s = 0;s < q;s++)
				{
								 if (e+1 <= a[i][s])
								 {
											   break;
								 }
								 else
								 {
									  c += 1;
								 }
				}
								 if (c == q)
								 {
										   c = 0;
										   for (t = 0;t < p;t++)
										   {
															if (e-1 >= a[t][k])
															{
																		  break;
															}
															else
															{
																 c += 1;
															}
										   }
										   if (c == p)
										   {
												   System.out.printf("%d+%d",i,k);
												   m = 1;
										   }
								 }
			}
		}
		if (m == 0)
		{
				 System.out.print("No");
		}
		return 0;
	}
}

