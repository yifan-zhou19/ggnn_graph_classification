package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] a = new int[5][5];
		 int[][] b = new int[5][5];
		 int[][] c = new int[5][5];
		 int i;
		 int j;
		 int t;
		 int m;
		 int count = 0;
		 int q;
		 int w;
		 for (i = 0;i < 5;i++)
		 {
		 for (j = 0;j < 5;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar);
			 }
			 b[i][j] = 100000;
			 c[i][j] = 100000;
		 }
		 }
		 for (i = 0;i < 5;i++)
		 {
			 t = a[i][0];
			 m = 0;
			 for (j = 0;j < 5;j++)
			 {
				 if (a[i][j] > t)
				 {
					 t = a[i][j];
					 m = j;
				 }
			 }
			  b[i][m] = t;
		 }
		 for (j = 0;j < 5;j++)
		 {
			 t = a[0][j];
			 m = 0;
			 for (i = 0;i < 5;i++)
			 {
				 if (a[i][j] < t)
				 {
					 t = a[i][j];
					 m = i;
				 }
			 }
			 c[m][j] = t;
		 }
		 for (i = 0;i < 5;i++)
		 {
		 for (j = 0;j < 5;j++)
		 {
			 if (a[i][j] == b[i][j] && b[i][j] == c[i][j])
			 {
				 System.out.printf("%d %d %d\n",i + 1,j + 1,b[i][j]);
			 count++;
			 }

		 }
		 }
		 if (count == 0)
		 {
			 System.out.print("not found\n");
		 }
	}
}

