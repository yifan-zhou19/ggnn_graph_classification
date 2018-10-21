package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int yu7wuguan(int i);
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int n;
		int k;
		int max;
		int e;
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
		}
		for (k = 1;k <= 2;k++)
		{
						 max = 0;
			for (i = 0;i <= n - k;i++)
			{
			  if (sz[i] > sz[max])
			  {
				max = i;
			  }
			}
			  if (max != n - k)
			  {
				 e = sz[max];
				 sz[max] = sz[n - k];
				 sz[n - k] = e;
			  }
			   System.out.printf("%d\n",sz[n - k]);
		}

					return 0;
	}


}

