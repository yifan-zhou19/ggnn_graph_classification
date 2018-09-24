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
	 String tempVar2 = ConsoleInput.scanfRead(" ");
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
	  for (n = 0;;n++)
	  {
	   for (i = n;i < col - n;i++)
	   {
		System.out.printf("%d\n",array[n][i]);
		time++;
	   }
	   System.out.print("\n");
	   if (time == row * col)
	   {
		   break;
	   }
	   for (j = n + 1;j < row - n;j++)
	   {
		System.out.printf("%d\n",array[j][col - n - 1]);
		time++;
	   }

	   if (time == row * col)
	   {
		   break;
	   }
	   for (i = col - 2 - n;i >= n;i--)
	   {
		System.out.printf("%d\n",array[row - n - 1][i]);
		time++;
	   }
	   if (time == row * col)
	   {
		   break;
	   }
	   for (j = row - 2 - n;j > n;j--)
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

