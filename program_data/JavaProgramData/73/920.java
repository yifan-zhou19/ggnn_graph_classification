package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int b = 1;
		for (i = 0;i < 5;i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i][0] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   a[i][1] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i][2] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   a[i][3] = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ");
		   if (tempVar5 != null)
		   {
			   a[i][4] = Integer.parseInt(tempVar5);
		   }
		}
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  if (a[i][j] < a[i][0])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] < a[i][1])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] < a[i][2])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] < a[i][3])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] < a[i][4])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] > a[0][j])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] > a[1][j])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] > a[2][j])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] > a[3][j])
			  {
				  b = 0;
				  continue;
			  }
			  if (a[i][j] > a[4][j])
			  {
				  b = 0;
				  continue;
			  }
			  System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
			  b = 1;
			  break;
		   }
		   if (b == 1)
		   {
			   break;
		   }
		}
		if (b == 0)
		{
		  System.out.print("not found");
		}


	}

}

