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
		  int j;
		  int t;
		  int m;
		  int n;
		  int[][] a = new int[200][200];
		  int[][] b = new int[200][200];
		  int[][] c = new int[200][200];
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
		  for (i = 0;i < x1;i++)
		  {
			  for (j = 0;j < y1;j++)
			  {

					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						m = Integer.parseInt(tempVar3);
					}
				  a[i][j] = m;
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
		  for (i = 0;i < x2;i++)
		  {
			  for (j = 0;j < y2;j++)
			  {

					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						n = Integer.parseInt(tempVar6);
					}
				  b[i][j] = n;
			  }
		  }
		   for (i = 0;i < x1;i++)
		   {
			  for (j = 0;j < y2;j++)
			  {
				c[i][j] = 0;
				for (t = 0;t < y1;t++)
				{
				  c[i][j] = c[i][j] + a[i][t] * b[t][j];
				}
				  if (j != y2 - 1)
				  {
				  System.out.printf("%d ",c[i][j]);
				  }
				  else
				  {
					  System.out.printf("%d\n",c[i][j]);
				  }
			  }
		   }
		return 0;
	}


}

