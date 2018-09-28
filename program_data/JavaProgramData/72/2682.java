package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int[][] a = new int[25][25];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < m;j++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < m;j++)
		 {
			 if (i == 0 && j == 0)
			 {
				if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (i == 0 && j == m - 1)
			 {
				if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (i == n - 1 && j == 0)
			 {
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (i == n - 1 && j == m - 1)
			 {
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (i < n - 1 && i>0 && j == 0)
			 {
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (i < n - 1 && i>0 && j == m - 1)
			 {
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (j < m - 1 && j>0 && i == 0)
			 {
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (j < m - 1 && j>0 && i == n - 1)
			 {
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
			 if (j < m - 1 && j>0 && i < n - 1 && i>0)
			 {
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
				{
					System.out.printf("%d %d\n",i,j);
				}
			 }
		 }
	 }

	 return 0;

	}
}

