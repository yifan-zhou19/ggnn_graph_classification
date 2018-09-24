package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int[][] a = new int[100][100];
	  int i;
	  int k;
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
	  for (k = 0;k < row;k++)
	  {
		for (i = 0;i < col;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (a[k][i]) = Integer.parseInt(tempVar3);
		  }
		}
	  }
	  for (i = 0;i < 201;i++)
	  {
		k = 0;
		j = i;
		while (j >= 0)
		{
		  if (0 <= j != 0 && j < col && 0 <= k != 0 && k < row)
		  {
			  System.out.printf("%d\n",a[k][j]);
		  }
		  j--;
		  k++;
		}
	  }
	  return 0;
	}

}

