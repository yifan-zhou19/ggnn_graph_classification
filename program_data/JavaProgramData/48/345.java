package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int j;
		 int l;
		 int k;
		 int[][] s = new int[10][10];
		 int[][] a = new int[10][10];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }

		 for (i = 1;i <= 9;i++)
		 {
		 for (j = 1;j <= 9;j++)
		 {
		 a[i][j] = 0;
		 s[i][j] = 0;
		 }
		 }
		  s[5][5] = n;
		  a[5][5] = n;
		 for (l = 1;l <= k;l++)
		 {
		 for (i = 1;i <= 9;i++)
		 {
		 for (j = 1;j <= 9;j++)
		 {
		  if (s[i][j] > 0)
		  {
		   a[i][j] += s[i][j];
		   a[i - 1][j - 1] += s[i][j];
		   a[i][j - 1] += s[i][j];
		   a[i - 1][j] += s[i][j];
		   a[i + 1][j - 1] += s[i][j];
		   a[i - 1][j + 1] += s[i][j];
		   a[i + 1][j] += s[i][j];
		   a[i][j + 1] += s[i][j];
		   a[i + 1][j + 1] += s[i][j];
		  }
		 }
		 }
		 for (i = 1;i <= 9;i++)
		 {
		 for (j = 1;j <= 9;j++)
		 {
		 s[i][j] = a[i][j];
		 }
		 }
		 }
		 for (i = 1;i <= 9;i++)
		 {
		 for (j = 1;j <= 8;j++)
		 {
		 System.out.printf("%d ",a[i][j]);
		 }
		 System.out.printf("%d\n",a[i][9]);
		 }

	}

}

