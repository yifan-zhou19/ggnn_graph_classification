package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int row;
		 int col;
		 int i;
		 int j;
		 int temp_i;
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
		 for (j = 0;j < col;j++)
		 {
			   for (i = 0;i <= j != 0 && i < row;i++)
			   {
					 System.out.printf("%d\n", a[i][j - i]);
			   }
		 }
		 for (i = 1;i < row;i++)
		 {
			   temp_i = i;
			   for (j = col - 1;j >= 0 && temp_i < row;j--)
			   {
					 System.out.printf("%d\n", a[temp_i][j]);
					 temp_i++;
			   }
		 }
		 return 0;
	}

}

