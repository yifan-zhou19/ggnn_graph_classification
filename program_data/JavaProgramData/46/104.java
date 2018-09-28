package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int row;
	 int col;
	 int i;
	 int j;
	 int k;
	 int time = 0;
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
	 int[][] array = new int[100][100];

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

	 for (k = 0;;k++)
	 {
			  for (i = k;i < col - k;i++)
			  {
				System.out.printf("%d\n",array[k][i]);
				time++;

			  if (time == row * col)
			  {
				  break;
			  }
			  }
	if (time == row * col)
	{
		break;
	}
			  for (j = k + 1;j < row - k;j++)
			  {
				System.out.printf("%d\n",array[j][col - k - 1]);
				time++;

			  if (time == row * col)
			  {
				  break;
			  }
			  }
			  if (time == row * col)
			  {
				  break;
			  }
			  for (i = col - 2 - k;i >= k;i--)
			  {
				System.out.printf("%d\n",array[row - k - 1][i]);
				time++;

			  if (time == row * col)
			  {
				  break;
			  }
			  }
			  if (time == row * col)
			  {
				  break;
			  }
			  for (j = row - 2 - k;j > k;j--)
			  {
				System.out.printf("%d\n",array[j][k]);
				time++;

			  if (time == row * col)
			  {
				  break;
			  }
			  }
	if (time == row * col)
	{
		break;
	}
	 }
	return 0;
	}
}

