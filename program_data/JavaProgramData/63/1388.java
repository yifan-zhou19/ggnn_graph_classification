package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_x = new int[102][102];
int[][] y = new int[102][102];
int[][] z = new int[102][102];
	public static int Main()
	{
	  int x1;
	  int y1;
	  int x2;
	  int y2;
	  int i;
	  int j;
	  int k;
	  int a = 0;
	  int b = 0;
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
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//  static int x[102][102],y[102][102],z[102][102];
	  for (i = 1;i <= x1;i++)
	  {
		 for (j = 1;j <= y1;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 Main_x[i][j] = Integer.parseInt(tempVar3);
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
	  for (i = 1;i <= x2;i++)
	  {
		 for (j = 1;j <= y2;j++)
		 {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 y[i][j] = Integer.parseInt(tempVar6);
			 }
		 }
	  }
	  for (i = 1;i <= x1;i++)
	  {
		for (j = 1;j <= y2;j++)
		{
		   for (k = 1;k <= y1;k++)
		   {
			   z[i][j] += Main_x[i][k] * y[k][j];
		   }
		}
	  }
	  for (i = 1;i <= x1;i++)
	  {
		   for (j = 1;j <= y2;j++)
		   {
				if (a != 0)
				{
			 System.out.print(" ");
				}
			 System.out.printf("%d",z[i][j]);
			 a++;
		   }
		  a = 0;
		  System.out.print("\n");
	  }
	}
}

