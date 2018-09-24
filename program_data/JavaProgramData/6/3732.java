package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int k;
		 int m;
		 int n;
		 int[][] a = new int[100][100];
		 int i;
		 int j;
		 int sum;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (;k > 0;k--)
		 {
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
			 sum = 0;
			 for (i = 0;i < m;i++)
			 {
			 for (j = 0;j < n;j++)
			 {
			 a[i][j] = 0;
			 }
			 }
			 for (i = 0;i < m;i++)
			 {
			 for (j = 0;j < n;j++)
			 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar4);
			 }
			 }
			 }
			 for (j = 0;j < n;j++)
			 {
			 sum = sum + a[0][j] + a[m - 1][j];
			 }
			 for (i = 1;i < m - 1;i++)
			 {
			 sum = sum + a[i][0] + a[i][n - 1];
			 }
			 System.out.printf("%d\n",sum);
		 }
	}
}

