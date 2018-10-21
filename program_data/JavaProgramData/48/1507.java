package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] square = new int[9][9];
	int[][] squ = new int[9][9];
	 int m;
	 int n;
	 int i;
	 int j;
	 int k;
	 int t;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 square[4][4] = squ[4][4] = m;
	 for (i = 1;i <= n;i++)
	 {
		 for (j = 0;j <= 8;j++)
		 {
		 for (k = 0;k <= 8;k++)
		 {
		if (square[j][k] != 0)
		{
			squ[j][k] = squ[j][k] + square[j][k];
		 squ[j][k + 1] += square[j][k];
		 squ[j][k - 1] += square[j][k];
		 squ[j + 1][k] += square[j][k];
		 squ[j + 1][k + 1] += square[j][k];
		 squ[j + 1][k - 1] += square[j][k];
		 squ[j - 1][k] += square[j][k];
		 squ[j - 1][k + 1] += square[j][k];
		 squ[j - 1][k - 1] += square[j][k];
		}
		 }
		 }
	  for (t = 0;t <= 8;t++)
	  {
		 for (q = 0;q <= 8;q++)
		 {
		 square[q][t] = squ[q][t];
		 }
	  }
	 }
	 for (t = 0;t <= 8;t++)
	 {
		 for (q = 0;q <= 7;q++)
		 {
	 System.out.printf("%d ",square[t][q]);
		 }
	 System.out.printf("%d",square[t][8]);
	 System.out.print("\n");
	 }
	}
}

