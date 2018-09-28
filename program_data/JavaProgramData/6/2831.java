package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int m;
	  int n;
	  int i;
	  int j;
	  int a;
	  int[][] sz = new int[100][100];
	  int s;
	  s = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (a = 0;a < k;a++)
	  {
	s = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 for (i = 0;i < m;i++)
		 {
			for (j = 0;j < n;j++)
			{
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar4);
			   }
			}
		 }
		 for (i = 0;i < m;i++)
		 {
			for (j = 0;j < n;j++)
			{
			   if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
			   {
				  s = s + sz[i][j];
			   }
			}
		 }

		  System.out.printf("%d\n",s);
	  }
	  return 0;
	}

}

