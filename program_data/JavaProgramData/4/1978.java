package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return a > b != 0?a:b;
	}
	public static int min(int a,int b)
	{
		return a < b != 0?a:b;
	}
	public static int Main()
	{
		int i;
		int j;
		int t;
		int col;
		int row;
		int[][] a = new int[100][100];
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
		for (t = 0;t <= col - 1;t++)
		{
		   j = t;
		   for (i = 0;i <= min(t, row - 1);i++)
		   {
			 System.out.printf("%d\n",a[i][j]);
			 j--;
		   }
		}
		for (t = 1;t <= row - 1;t++)
		{
		   i = t;
		   for (j = col - 1;j >= max(col - row + t, 0);j--)
		   {
			 System.out.printf("%d\n",a[i][j]);
			 i++;
		   }
		}

	}

}

