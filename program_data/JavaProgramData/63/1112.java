package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int max(int x, int y);
	public static int Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[400][400];
		int x1;
		int x2;
		int y1;
		int y2;
		int x3;
		int y3;
		int i;
		int j;
		int k;
		int m;
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
		 for (j = 0;j < y1;j++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i][j] = Integer.parseInt(tempVar3);
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
		 for (j = 0;j < y2;j++)
		 {
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 b[i][j] = Integer.parseInt(tempVar6);
		 }
		 }
		}
		 x3 = x1;
		 y3 = y2;
		 for (i = 0;i < x3;i++)
		 {
		 for (j = 0;j < y3;j++)
		 {
			 for (k = 0;k < y1;k++)
			 {
			 c[i][j] += a[i][k] * b[k][j];
			 }
		 }
		 }
		 for (i = 0;i < x3;i++)
		 {
		 for (j = 0;j < y3;j++)
		 {
			  if (j < y3 - 1)
			  {
				  System.out.printf("%d ",c[i][j]);
			  }
			  else
			  {
			  System.out.printf("%d\n",c[i][j]);
			  }

		 }
		 }
	}



}

