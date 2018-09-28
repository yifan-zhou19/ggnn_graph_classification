package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar);
			  }
		   }
		}
	  for (i = 0;i < 5;i++)
	  {
		for (j = 0;j < 5;j++)
		{
		  for (k = 0;k < 5;k++)
		  {
		   if (a[i][k] > a[i][j])
		   {
			break;
		   }
		  }
		 if (k < 5)
		 {
		  continue;
		 }
	   for (k = 0;k < 5;k++)
	   {
		 if (a[k][j] < a[i][j])
		 {
		   break;
		 }
	   }
	   if (k < 5)
	   {
		continue;
	   }
	   System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
	   return 0;
		}
	  }
	   System.out.print("not found");
	   return 0;
	}
}

