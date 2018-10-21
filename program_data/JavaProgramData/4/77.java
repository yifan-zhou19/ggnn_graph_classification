package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void print(int * p[101],int row,int col);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[101];
		int[] p = new int[101];
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
						  p[i] = (int)calloc(101,(Integer.SIZE / Byte.SIZE));
						  for (j = 0;j < col;j++)
						  {
											String tempVar3 = ConsoleInput.scanfRead();
											if (tempVar3 != null)
											{
												(p[i] + j) = Integer.parseInt(tempVar3);
											}
						  }
		}
		print(p, row, col);

		return 0;
	}

	public static void print(int[][] p, int row, int col)
	{
		 int k;
		 int i;
		 for (k = 0;k < (row + col - 1);k++)
		 {
								   for (i = 0;(i < k + 1) && (i < row);i++)
								   {
													 if ((k - i) < col)
													 {
													 System.out.printf("%d\n",*(p[i] + (k - i)));
													 }
								   }
		 }
	}
}

