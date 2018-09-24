package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 row = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 col = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < row;i++)
	 {
		 for (j = 0;j < col;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	if (row == 1)
	{
		for (j = 0;j < col;j++)
		{
	System.out.printf("%d\n",a[0][j]);
		}

	}
	else
	{
		for (j = 0;j < col;j++)
		{
		 i = 0;
		 k = j;
		 while (k >= 0 && i < row)
		 {
		 System.out.printf("%d\n",a[i][k]);
		   k--;
		   i++;
		 }
		}
	 for (i = 1;i < row - 1;i++)
	 {
		 j = col - 1;
		 k = i;
		 while (j >= 0 && k < row)
		 {
			 System.out.printf("%d\n",a[k][j]);
		   j--;
		   k++;
		 }
	 }
	 System.out.printf("%d\n",a[row - 1][col - 1]);
	}
	}
}

