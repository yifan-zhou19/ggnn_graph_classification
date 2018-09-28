package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] sz = new int[100];
	  int[] sz1 = new int[100];
	  int n;
	  int i;
	  int j;
	  int l;
	  int k;
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
		   for (int j = 1 ; j <= n ; j++)
		   {
		   for (int l = 0; l < n - j; l++)
		   {
				e = sz[l + 1];
				sz[l + 1] = sz[l];
				sz[l] = e;
		   }
		   }
	System.out.printf("%d",sz[0]);
	for (k = 1;k < n;k++)
	{
	 System.out.printf(" %d",sz[k]);
	}
	return 0;
	}
}

