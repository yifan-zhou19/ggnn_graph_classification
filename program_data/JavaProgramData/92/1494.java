package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int c;
		  int[] a = new int[1010];
		  int[] b = new int[1010];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
			  int win = 0;
				int lose = 0;
				int equal = 0;
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
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = n - 2;i >= 0;i--)
				{
					for (j = 0;j <= i;j++)
					{
						if (a[j] > a[j + 1])
						{
										t = a[j + 1];
										a[j + 1] = a[j];
										a[j] = t;
						}
					}
				}
				for (i = n - 2;i >= 0;i--)
				{
					for (j = 0;j <= i;j++)
					{
						if (b[j] > b[j + 1])
						{
										t = b[j + 1];
										b[j + 1] = b[j];
										b[j] = t;
						}
					}
				}

			   for (i = 0;i <= n - 1;i++)
			   {
				   t = 0;
				   for (j = 0;j <= n - 1;j++)
				   {
					   if (b[j] == 100000)
					   {
									continue;
					   }
					   else
					   {
						   if (a[i] - b[j] > 0)
						   {
								   t = j;
						   }
					   }
				   }
				   if (a[i] - b[t] > 0)
				   {
						   win++;
						   b[t] = 100000;
						   a[i] = -2;
				   }
			   }
			   for (i = 0;i <= n - 1;i++)
			   {
				 if (a[i] == -2)
				 {
					continue;
				 }
				 else
				 {
					 c = 0;
					 t = 0;
					 for (j = 0;j <= n - 1;j++)
					 {
						 if (b[j] == 100000)
						 {
									 continue;
						 }
						 else
						 {
							 if (a[i] == b[j])
							 {
										   a[i] = -2;
										   b[j] = 100000;
										   equal = equal + 1;
										   break;
							 }
						 }
					 }
				 }
			   }
				  lose = n - win - equal;
				  int money;
				  money = (win - lose) * 200;
				  System.out.printf("%d\n",money);
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  n = Integer.parseInt(tempVar4);
				  }
		  }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}


}

