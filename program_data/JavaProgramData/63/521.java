package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int x1;
		int x2;
		int y;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
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
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   x2 = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   y = Integer.parseInt(tempVar5);
	   }
		 for (i = 0;i < x2;i++)
		 {
		 for (j = 0;j < y;j++)
		 {
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  b[i][j] = Integer.parseInt(tempVar6);
		  }
		 }
		 }
	  for (i = 0;i < x1;i++)
	  {
	   for (j = 0;j < y;j++)
	   {
		   for (m = 0;m < x2;m++)
		   {
			 c[i][j] += a[i][m] * b[m][j];
		   }
		   if (i != x1 - 1)
		   {
		   if (j != y - 1)
		   {
		   System.out.printf("%d ",c[i][j]);
		   }
		   else
		   {
		   System.out.printf("%d\n",c[i][j]);
		   }
		   }
		   else
		   {
		   if (j != y - 1)
		   {
		   System.out.printf("%d ",c[i][j]);
		   }
		   else
		   {
		   System.out.printf("%d",c[i][j]);
		   }
		   }
	   }
	  }
	   System.in.read();
	   System.in.read();
	}
}

