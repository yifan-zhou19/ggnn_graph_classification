package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int[][] b = new int[5][5];
	  int m;
	  int n;
	  int i;
	  int j;
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
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  if (n < 5 && m < 5 && n >= 0 && m >= 0)
	  {
		 for (i = 0;i < 5;i++)
		 {

		   for (j = 0;j < 5;j++)
		   {
			   if (i == m)
			   {
				   b[i][j] = a[n][j];
			   }
			   else if (i == n)
			   {
				   b[i][j] = a[m][j];
			   }
			   else
			   {
				   b[i][j] = a[i][j];
			   }

		   }

		 }
		 for (i = 0;i < 5;i++)
		 {
		 for (j = 0;j < 5;j++)
		 {
			   if (j == 0)
			   {
			 System.out.printf("%d",b[i][j]);
			   }
			   else if (j == 4)
			   {
				   System.out.printf(" %d\n",b[i][j]);
			   }
			   else
			   {
				   System.out.printf(" %d",b[i][j]);
			   }
		 }
		 }

	  }
	  else
	  {
		  System.out.print("error");
	  }
	  return 0;
	}



}

