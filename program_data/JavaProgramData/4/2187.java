package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
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
	  int[][] array = new int[row][col];
	  int i;
	  int j;
	  int k;
	  int l;
	  for (i = 0;i < row;i++)
	  {
	  for (j = 0;j < col;j++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  array[i][j] = Integer.parseInt(tempVar3);
	  }
	  }
	  }
	  for (k = 0;k < col + row - 1;k++)
	  {
	  for (l = 0;k - l > -1;l++)
	  {
	  if (k - l < col && l < row)
	  {
	  System.out.printf("%d\n",array[l][k - l]);
	  }
	  }
	  }
	  return 0;
	}

}

