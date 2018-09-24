package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   int[] sz = new int[n];
		 for (i = 0;i < n - 1;i++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar3);
		   }
		 }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   sz[n - 1] = Integer.parseInt(tempVar4);
		   }
		   m = m % n;
	   for (i = n - m;i < n;i++)
	   {
		 System.out.printf("%d ",sz[i]);
	   }
		for (i = 0;i < n - m - 1;i++)
		{
		   System.out.printf("%d ",sz[i]);
		}
		  System.out.printf("%d",sz[n - m - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(sz);
	  return 0;
	}

}

