package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int k;
	  int up = 0;
	  int down = 0;
	  int left = 0;
	  int right = 0;
	  int[][] a = new int[22][22];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;i <= m;i++)
	  {
		   for (j = 1;j <= n;j++)
		   {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
		   }
	  }

	  for (i = 1;i <= m;i++)
	  {
		  for (j = 1;j <= n;j++)
		  {
			  up = a[i][j] - a[i - 1][j];
			  down = a[i][j] - a[i + 1][j];
			  left = a[i][j] - a[i][j - 1];
			  right = a[i][j] - a[i][j + 1];

			   if (up >= 0 && down >= 0 && left >= 0 && right >= 0)
			   {
				   System.out.printf("%d %d\n",i - 1,j - 1);
			   }
		  }
	  }
	}

}

