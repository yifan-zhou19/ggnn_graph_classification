package <missing>;

public class GlobalMembers
{
	public static int[][][] pool = new int[11][11][2]; //?????????????????????

	public static void breed(int j,int k) //?????????????
	{
		pool[j][k][1] += 2 * pool[j][k][0];
	 pool[j - 1][k - 1][1] += pool[j][k][0];
	 pool[j + 1][k][1] += pool[j][k][0];
	 pool[j - 1][k][1] += pool[j][k][0];
	 pool[j][k + 1][1] += pool[j][k][0];
	 pool[j][k - 1][1] += pool[j][k][0];
	 pool[j + 1][k + 1][1] += pool[j][k][0];
	 pool[j + 1][k - 1][1] += pool[j][k][0];
	 pool[j - 1][k + 1][1] += pool[j][k][0];
	 pool[j][k][0] = 0;
	}


	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int k;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 pool[5][5][0] = m;
	 for (i = 0;i < n;i++)
	 {
			 for (j = 1;j < 10;j++)
			 {
				 for (k = 1;k < 10;k++)
				 {
					 breed(j, k);
				 }
			 }
		  for (j = 1;j < 10;j++)
		  {
			  for (k = 1;k < 10;k++)
			  {
				  pool[j][k][0] = pool[j][k][1]; //????
			  }
		  }
		  for (j = 1;j < 10;j++)
		  {
			  for (k = 1;k < 10;k++)
			  {
				  pool[j][k][1] = 0; //????
			  }
		  }

	 }
	 for (j = 1;j < 10;j++)
	 {
		 for (k = 1;k < 9;k++)
		 {
			 System.out.print(pool[j][k][0]);
			 System.out.print(" ");
		 }
		 System.out.print(pool[j][9][0]);
		 System.out.print("\n");
	 }
	 return 0;
	}

}

