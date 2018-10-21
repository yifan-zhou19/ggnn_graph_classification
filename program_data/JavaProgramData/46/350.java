package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int n;
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
		int[][] array = new int[R][C];
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
	 for (n = 0;;n++)
	 {
	  for (i = n;i <= col - n - 1;i++)
	  {
	   System.out.printf("%d\n",array[n][i]);
	   time++;
	  }
	  if (time == row * col)
	  {
		  break;
	  }
	  for (j = n + 1;j <= row - n - 1;j++)
	  {
	   System.out.printf("%d\n",array[j][col - n - 1]);
	   time++;
	  }
	  if (time == row * col)
	  {
		  break;
	  }
	  for (i = col - n - 2;i >= n;i--)
	  {
	   System.out.printf("%d\n",array[row - n - 1][i]);
	   time++;
	  }
	  if (time == row * col)
	  {
		  break;
	  }
	  for (j = row - n - 2;j >= n + 1;j--)
	  {
	   System.out.printf("%d\n",array[j][n]);
	   time++;
	  }
	  if (time == row * col)
	  {
		  break;
	  }
	 }
	 return 0;
	}
}

