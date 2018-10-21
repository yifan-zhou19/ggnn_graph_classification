package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
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
	for (i = 0;i < row + col - 1;i++)
	{
		 if (i >= col)
		 {
		   for (j = col - 1;j >= i - row + 1 && j >= 0;j--)
		   {
			   System.out.printf("%d\n",a[i - j][j]);
		   }
		 }
		 else
		 {
		   for (j = i;j >= i - row + 1 && j >= 0;j--)
		   {
			   System.out.printf("%d\n",a[i - j][j]);
		   }
		 }
	}
	return 0;
	}
}

