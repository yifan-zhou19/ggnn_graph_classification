package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] sz = new int[max];
	  int[] dx = new int[max];
	  int n;
	  int i;
	  int m;
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
		  (sz[i]) = Integer.parseInt(tempVar2);
	  }
	  }
	  for (m = 0,i = n - 1;i > 0,m < n - 1;i--,m++)
	  {
	  dx[m] = sz[i];
	  System.out.printf("%d ",dx[m]);
	  }
	  dx[n - 1] = sz[0];
	  System.out.printf("%d\n",dx[m]);
	return 0;
	}

}

