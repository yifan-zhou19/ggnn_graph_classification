package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	int b = 0;
	int[] sz = new int[n];
	int[] js = new int[b];
	  for (int i = 0;i < n;i++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (sz[i]) = Integer.parseInt(tempVar2);
		   }
		  if (sz[i] % 2 != 0)
		  {

				  js[b] = sz[i];
				   b = b + 1;
		  }
	  }
	  for (int m = 1;m <= b;m++)
	  {
						int maxIndex;
						int e;
						maxIndex = 0;
					   for (int i = 0;i <= b - m;i++)
					   {
							if (js[i] > js[maxIndex])
							{
									maxIndex = i;
							}
					   }
					  if (maxIndex != b - m)
					  {
						 e = js[maxIndex];
						 js[maxIndex] = js[b - m];
						 js[b - m] = e;
					  }
	  }

	for (int m = 0;m < b - 1;m++)
	{
	System.out.printf("%d,",js[m]);
	}
	System.out.printf("%d",js[b - 1]);
	return 0;
	}



}

