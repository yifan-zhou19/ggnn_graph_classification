package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x1;
	 int y1;
	 int x2;
	 int y2;
	 int i;
	 int r;
	 int m;
	 int[][] a = new int[100][100];
	 int[][] b = new int[100][100];
	 int[][] c = new int[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 y1 = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < x1;i++)
	 {
	  for (r = 0;r < y1;r++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i][r] = Integer.parseInt(tempVar3);
	  }
	  }
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 x2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 y2 = Integer.parseInt(tempVar5);
	 }
	 for (i = 0;i < x2;i++)
	 {
	  for (r = 0;r < y2;r++)
	  {
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  b[i][r] = Integer.parseInt(tempVar6);
	  }
	  }
	 }
	 for (i = 0;i < x1;i++)
	 {
	  for (r = 0;r < y2;r++)
	  {
		  c[i][r] = 0;
		  for (m = 0;m < x2;m++)
		  {
		   c[i][r] += a[i][m] * b[m][r];
		  }
	  }
	 }
	 for (i = 0;i < x1;i++)
	 {
		 for (r = 0;r < y2;r++)
		 {
		  if (r == y2 - 1)
		  {
		  System.out.printf("%d\n",c[i][r]);
		  }
		  else
		  {
		  System.out.printf("%d ",c[i][r]);
		  }
		 }
	 }
	 return 0;
	}
}

