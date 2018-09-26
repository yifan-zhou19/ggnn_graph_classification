package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int row;
		  int col;
		  int i;
		  int j;
		  int d = 0;
		  int count = 0;
		  int[] de = {0, 1, 2, 3};
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
		  int[][] a = new int[row][col];
		  int[][] b = new int[row][col];
		  for (i = 0;i < row;i++)
		  {
				  for (j = 0;j < col;j++)
				  {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  a[i][j] = Integer.parseInt(tempVar3);
					  }
					  b[i][j] = 1;
				  }
		  }
		  i = 0;
		  j = 0;
		  for (count = 0;count < row * col;count++)
		  {
					   System.out.printf("%d\n",a[i][j]);
					   b[i][j] = 0;
					   switch (de[d])
					   {
						case 0:
							j++;
							break;
						case 1:
							i++;
							break;
						case 2:
							j--;
							break;
						case 3:
							i--;
							break;
					   }
					   if (i < 0 || i >= row != 0 || j < 0 || j >= col != 0 || b[i][j] == 0)
					   {
					 switch (de[d])
					 {
						case 0:
							j--;
							i++;
							break;
						case 1:
							i--;
							j--;
							break;
						case 2:
							j++;
							i--;
							break;
						case 3:
							i++;
							j++;
							break;
					 }
					 d = (d + 1) % 4;
					   }
		  }
	return 0;
	}
}

