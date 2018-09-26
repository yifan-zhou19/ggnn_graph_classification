package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int[][] b = new int[100][100];
	 int Row;
	 int Col;
	 int n;
	 int i;
	 int k;
	 int l;
	 int row;
	 int col;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 Row = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 Col = Integer.parseInt(tempVar2);
	 }
	 for (row = 0;row < Row;row++)
	 {
		for (col = 0;col < Col;col++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[row][col] = Integer.parseInt(tempVar3);
		 }
		}
	 }
	for (i = 1;s < Row * Col;i = i + 1)
	{
	  s = s + (Row + Col - 4 * i + 4) * 2 - 4;
	}
	 n = i - 1;
	 s = 0;
	 for (k = 1;k <= n;k++)
	 {
		for (l = k - 1;l <= Col - k && s != Row * Col;l++)
		{
		   System.out.printf("%d\n",b[k - 1][l]);
			s = s + 1;
		}
		for (l = k;l <= Row - k && s != Row * Col;l++)
		{
			System.out.printf("%d\n",b[l][Col - k]);
			s = s + 1;
		}
	   for (l = Col - k - 1;l >= k - 1 && s != Row * Col;l--)
	   {
		   System.out.printf("%d\n",b[Row - k][l]);
		   s = s + 1;
	   }
	   for (l = Row - k - 1;l >= k != 0 && s != Row * Col;l--)
	   {
		 System.out.printf("%d\n",b[l][k - 1]);
		 s = s + 1;
	   }
	 }
	return 0;
	 }

}

