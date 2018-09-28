package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] sz = new int[1000];
	   int j;
	   int k;
	   int sum = 0;
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
	   for (i = 0;i < n;i++)
	   {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  sz[i] = Integer.parseInt(tempVar3);
					  }
	   }
			 for (i = 0;i < n / 2 + 1;i++)
			 {
							 for (j = i + 1;j < n;j++)
							 {
										if (sz[i] + sz[j] == k)
										{
											   sum++;
											   break;
										}
							 }
			 }

				  if (sum != 0)
				  {
					  System.out.print("yes");
				  }
				  if (sum == 0)
				  {
							System.out.print("no");
				  }


			return 0;
	}
}

