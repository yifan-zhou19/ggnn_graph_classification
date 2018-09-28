package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int r;
	 int[][] a = new int[8][8];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	  for (i = 0;i < m;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  int s = 0;
			  t = a[i][j];
			  for (r = 0;r < n;r++)
			  {
				  if (a[i][r] > t)
				  {
					  s = s + 1;
				  }
			  }
			  for (r = 0;r < m;r++)
			  {
				  if (a[r][j] < t)
				  {
					  s = s + 1;
				  }
			  }
			  if (s == 0)
			  {
				  t = 1;
				  System.out.printf("%d+%d",i,j);
				  break;
			  }
			  if (t == 0)
			  {
				  System.out.print("No");
			  }
		  }
	  }
	  return 0;
	}


}

