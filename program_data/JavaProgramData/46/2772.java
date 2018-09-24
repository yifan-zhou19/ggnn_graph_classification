package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10000][10000];
	public static int Main()
	{
	 int row;
	 int col;
	 int i;
	 int j;
	 int k = 0;
	 int r;
	 int c;
	 int p = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 r = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 c = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < r;i++)
	 {
		 for (j = 0;j < c;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
		 }
	 }

	 for (row = r, col = c;(row > 0) && (col > 0);row = row - 1, col = col - 1)
	 {
		 if (p != r * c)
		 {
		 for (j = k;j < col;j++)
		 {
		   System.out.printf("%d\n",a[k][j]);
		   p++;
		 }
		 }
		 else
		 {
		 break;
		 }
		 if (p != r * c)
		 {
		 for (i = k;i < row - 1;i++)
		 {
		   System.out.printf("%d\n",a[i + 1][col - 1]);
		   p++;
		 }
		 }
		 else
		 {
		 break;
		 }
		 if (p != r * c)
		 {
		 for (j = col - 1;j > k;j--)
		 {
		   System.out.printf("%d\n",a[row - 1][j - 1]);
		   p++;
		 }
		 }
		 else
		 {
		 break;
		 }
		 if (p != r * c)
		 {
		   for (i = row - 1;i > k + 1;i--)
		   {
			 System.out.printf("%d\n",a[i - 1][k]);
			 p++;
		   }
		 }
		 else
		 {
		 break;
		 }
		 k++;

	 }
	return 0;
	}


}

