package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int d;
		int x1;
		int y1;
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
		int[][] a = new int[1000][1000];
		for (i = 1;i <= x1;i++)
		{
			 for (m = 1;m <= y1;m++)
			 {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i][m] = Integer.parseInt(tempVar3);
				  }
			 }
		}
		 int x2;
		 int y2;
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
		int[][] b = new int[1000][1000];
		for (i = 1;i <= x2;i++)
		{
			 for (m = 1;m <= y2;m++)
			 {
				  String tempVar6 = ConsoleInput.scanfRead();
				  if (tempVar6 != null)
				  {
					  b[i][m] = Integer.parseInt(tempVar6);
				  }
			 }
		}
		int[][] c = new int[1000][1000];
		for (i = 1;i <= x1;i++)
		{
			 for (m = 1;m <= y2;m++)
			 {
				  c[i][m] = 0;
				  for (d = 1;d <= y1;d++)
				  {
					  c[i][m] = a[i][d] * b[d][m] + c[i][m];
					  if (d == y1)
					  {
					  if (m == y2)
					  {
						  System.out.printf("%d\n",c[i][m]);
					  }
					  else
					  {
						  System.out.printf("%d ",c[i][m]);
					  }
					  }
				  }
			 }
		}
		return 0;
	}



}

