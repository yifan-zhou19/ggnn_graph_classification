package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[2][102][102];
	public static int[] x = new int[2];
	public static int[] y = new int[2];
	public static int t;

	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   for (i = 0 ; i < 2 ; i++)
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x[i] = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 y[i] = Integer.parseInt(tempVar2);
		 }
		 for (j = 0 ; j < x[i] ; j++)
		 {
		  for (k = 0 ; k < y[i] ; k++)
		  {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j][k] = Integer.parseInt(tempVar3);
		   }
		  }
		 }
	   }
	   for (i = 0 ; i < x[0] ; i++)
	   {
		 for (j = 0 ; j < y[1] ; j++)
		 {
		   t = 0;
		   for (k = 0 ; k < x[1] ; k++)
		   {
			t += a[0][i][k] * a[1][k][j];
		   }
		   System.out.printf("%d", t);
		   if (j < y[1] - 1)
		   {
			   System.out.print(" ");
		   }
		 }
		 System.out.print("\n");
	   }
	  // getchar (); getchar ();
	   return 0;
	}

}

