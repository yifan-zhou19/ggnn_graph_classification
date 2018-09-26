package <missing>;

public class GlobalMembers
{
	 public static int hh(int a, int b)
	 {
		   if (a < 5 && b < 5)
		   {
			  return 1;
		   }
			else
			{
				return 0;
			}
	 }
	 public static int Main()
	 {
		 int i;
		 int j;
		 int m;
		 int n;
		 int a;
		 int b;
		 int s;
		 int[][] x = new int[5][5];
		 int[] y = new int[5];
		 for (i = 0;i < 5;i++)
		 {
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		 }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  if (hh(m, n) == 0)
		  {
		   System.out.print("error");
		  }
		  else
		  {
				for (i = 0;i < 5;i++)
				{
				  y[i] = x[n][i];
				  x[n][i] = x[m][i];
				  x[m][i] = y[i];
				}

			 for (i = 0;i < 5;i++)
			 {
			   for (j = 0;j < 5;j++)
			   {
				   if (j == 4)
				   {
					 System.out.printf("%d\n",x[i][4]);
				   }
				 else
				 {
					 System.out.printf("%d ",x[i][j]);
				 }
			   }
			 }
		  }
			 return 0;
	 }




}

