package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	int m;
	int n;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	int[][] sz = new int[m][n];
	 for (int a = 0;a < m;a++)
	 {
	   for (int b = 0;b < n;b++)
	   {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  sz[a][b] = Integer.parseInt(tempVar4);
		  }
	   }
	 }
	 int s = 0;
	 int p = 0;
	 int q = 0;
	 int r = 0;
	  int sum = 0;
	 if (m >= 3 && n >= 3)
	 {
		 for (int a = 0;a < m;a++)
		 {
	 s = s + sz[a][0];
	 p = p + sz[a][n - 1];
		 }
	 for (int b = 1;b < n - 1;b++)
	 {
	 q = q + sz[0][b];
	 r = r + sz[m - 1][b];
	 }
	 sum = r + s + p + q;
	 }
	 else
	 {

	  for (int a = 0;a < m;a++)
	  {
	   for (int b = 0;b < n;b++)
	   {
		sum = sum + sz[a][b];
	   }
	  }

	 }

	 System.out.printf("%d\n",sum);
	}
	return 0;
	}

}

