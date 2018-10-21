package <missing>;

public class GlobalMembers
{
	public static int q;
	public static int[][] a = new int[101][101];
	public static int[][] b = new int[101][101];
	public static int c(int i,int j)
	{
		int m = 0;
		int k;
	 for (k = 0;k < q;k++)
	 {
	 m += a[i][k] * b[k][j];
	 }
	 return m;
	}
	public static int Main()
	{
	  int x1;
	  int y1;
	  int x2;
	  int y2;
	  int s;
	  int p;
	  int i;
	  int j;
	  int k;
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
	  for (s = 0;s < x1;s++)
	  {
			for (p = 0;p < y1;p++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[s][p] = Integer.parseInt(tempVar3);
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
	  for (s = 0;s < x2;s++)
	  {
			for (p = 0;p < y2;p++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[s][p] = Integer.parseInt(tempVar6);
			}
			}
	  }
		 q = y1;

	  for (i = 0;i < x1;i++)
	  {
		   for (j = 0;j < y2;j++)
		   {
				 System.out.printf("%d",c(i, j));
			  if (j != y2 - 1)
			  {
			  System.out.print(" ");
			  }
		   }
		  if (i != x1 - 1)
		  {
		  System.out.print("\n");
		  }
	  }


		System.in.read();
	}
}

