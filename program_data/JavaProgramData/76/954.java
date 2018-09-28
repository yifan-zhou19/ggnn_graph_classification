package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 1;
		int[] a = new int[5000];
		int[] b = new int[5000];
		int i;
		int j;
		int p;
		double t;
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
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b[i] = Integer.parseInt(tempVar3);
						  }
	}



			  int min = a[0];
			   for (i = 0;i < n;i++)
			   {
					 if (a[i] < min)
					 {
									  min = a[i];
					 }
			   }

					 int max = b[0];
					 for (i = 0;i < n;i++)
					 {
									 if (b[i] > max)
									 {
													  max = b[i];
									 }
					 }
					int[] sz = new int[5000];
	for (t = min + 0.5,p = 0;t <= max - 0.5;t++,p++)
	{

								  for (i = 0;i < n;i++)
								  {
												   if (t > a[i] && t < b[i])
												   {
																  sz[p] = 1;
												   }

								  }
								  if (sz[p] == 0)
								  {
											  x = 0;
											  System.out.print("no");
								  }

	}
	if (x == 1)
	{
			 System.out.printf("%d %d",min,max);
	}

			 return 0;
	}

}

