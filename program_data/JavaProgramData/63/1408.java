package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int x2;
		  int y1;
		  int y2;
		  int m;
		  int s;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  int[][] i = new int[x1][y1];
		  for (m = 0;m < x1;m++)
		  {
		  for (s = 0;s < y1;s++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  i[m][s] = Integer.parseInt(tempVar3);
		  }
		  }
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  x2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  y2 = Integer.parseInt(tempVar5);
		  }
		  int[][] j = new int[x2][y2];
		  for (m = 0;m < x2;m++)
		  {
		  for (s = 0;s < y2;s++)
		  {
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  j[m][s] = Integer.parseInt(tempVar6);
		  }
		  }
		  }
		  int[][] c = new int[x1][y2];
		  for (m = 0;m < x1;m++)
		  {
		  for (s = 0;s < y2;s++)
		  {
		  c[m][s] = 0;
		  for (n = 0;n < y1;n++)
		  {
		  c[m][s] = c[m][s] + (i[m][n]) * (j[n][s]);
		  }
		  System.out.printf("%d",c[m][s]);
		  if (s == (y2 - 1))
		  {
			  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print(" ");
		  }
		  }
		  }
	}
}

