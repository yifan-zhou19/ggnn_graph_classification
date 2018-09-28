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
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[100][100];
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					   a[i][j] = (int)malloc((Integer.SIZE / Byte.SIZE));
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
			   for (j = col - 1, temp_i = i;j >= 0 && temp_i < row;j--, temp_i++)
			   {
					 System.out.printf("%d\n", a[temp_i][j]);
			   }
		 }
		 return 0;
	}
}

