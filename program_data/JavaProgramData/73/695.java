package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int[][] a = new int[5][5];
	   int[] x = new int[5];
	   int[] y = new int[5];
	   int[] b = new int[5];
	   int[] c = new int[5];
	   int k = 0;
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
			  if (x[i] < a[i][j])
			  {
				 x[i] = a[i][j];
				 b[i] = j;
			  }
		 }
	   }
	   for (j = 0;j < 5;j++)
	   {
		  y[j] = a[0][j];
		  for (i = 0;i < 5;i++)
		  {
			if (y[j] > a[i][j])
			{
				 y[j] = a[i][j];
			}
		  }
	   }
	   for (i = 0;i < 5;i++)
	   {
		  if (x[i] == y[b[i]])
		  {
			k++;
			System.out.printf("%d %d %d",i + 1,b[i] + 1,x[i]);
		  }
	   }
	   if (k == 0)
	   {
		 System.out.print("not found");
	   }


	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

