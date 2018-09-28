package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int max = 0;
	int row = 0;
	int line = 0;
	int judge = 0;
	 for (int i = 0;i < 5;i++)
	 {
		 for (int j = 0;j < 5;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar);
			 }
		 }
	 }
		 for (int i = 0;i < 5;i++)
		 {
			 int j = 0;
			 max = a[i][j];
			 line = i;
			 row = j;
			 for (int j = 0;j < 5;j++)
			 {

				 for (int k = j + 1;k < 5;k++)
				 {
					 if (max < a[i][k])
					 {
						max = a[i][k];
						line = i;
						row = k;
					 }
				 }
			 }
			  if (max <= a[0][row] != 0 && a[line][row] <= a[1][row] != 0 && a[line][row] <= a[2][row] != 0 && a[line][row] <= a[3][row] != 0 && a[line][row] <= a[4][row])
			  {
				 System.out.printf("%d %d %d",line+1,row + 1,max);
				 judge = 1;
			  }
		 }
	 if (judge == 0)
	 {
		System.out.print("not found");
	 }
	}

}

