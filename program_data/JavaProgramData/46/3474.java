package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static void shuchu(int e,int b,int row,int col,int c)
	{
		int i;
		int j;
		if (e == 0 || b == 0)
		{
			;
		}
		else if (e == 1 && b == 1)
		{
			System.out.printf("%d\n",a[c][c]);
		}
		else if (e == 1 && b != 1)
		{
			for (j = c;j < col - c;j++)
			{
			System.out.printf("%d\n",a[c][j]);
			}
		}
		else if (e != 1 && b == 1)
		{
			for (j = c;j < row - c;j++)
			{
			System.out.printf("%d\n",a[j][c]);
			}
		}
		else
		{
			for (i = c;i < col - c;i++)
			{
			System.out.printf("%d\n",a[c][i]);
			}
			for (i = c + 1;i < row - c;i++)
			{
			System.out.printf("%d\n",a[i][col - c - 1]);
			}
			for (i = col - c - 2;i >= c;i--)
			{
			System.out.printf("%d\n",a[row - c - 1][i]);
			}
			for (i = row - c - 2;i > c;i--)
			{
			System.out.printf("%d\n",a[i][c]);
			}
			shuchu(e-2, b - 2, row, col, c + 1);
		}
	}
	public static int Main()
	{
		 int row;
		 int col;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 row = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
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
		 shuchu(row, col, row, col, 0);
		 return 0;
	}
}

