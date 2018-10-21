package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int n;
		 int[] sz = new int[1000];
		 int x;
		 int k;
		int j = 0;
		int a = 0;
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
							 x = Integer.parseInt(tempVar2);
						 }
						 if ((x % 2) != 0)
						 {
									  sz[j] = x;
									  j++;
									  a++;
						 }
		}
		   for (k = 1;k <= a;k++)
		   {
							 for (j = 0;j < a - k;j++)
							 {
											  if (sz[j] > sz[j + 1])
											  {
																int e;
																e = sz[j + 1];
																sz[j + 1] = sz[j];
																sz[j] = e;
											  }
							 }
		   }
		   System.out.printf("%d",sz[0]);
		   for (j = 1;j < a;j++)
		   {
							System.out.printf(",%d",sz[j]);
		   }




	   return 0;
	}

}

