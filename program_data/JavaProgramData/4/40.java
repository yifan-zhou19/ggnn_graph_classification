package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int n;
	  int i;
	  int j;
	  int k;
	  (int)(*p)[100];
	  int[][] a = new int[100][100];
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
	  p = a;
	  for (i = 0;i < row;i++)
	  {
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(p + i) + j = tempVar3;
			}
		}
	  }
	  p = a[0][0];
	  for (k = 0;k < row + col;k++)
	  {
		for (i = 0;i <= k;i++)
		{
		if (i < row && k - i < col)
		{
		  System.out.printf("%d\n",*(*(p + i) + (k - i)));
		}
		}
	  }
	}
}

