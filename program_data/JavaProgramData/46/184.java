package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] array = new int[100][100];
	 int row;
	 int col;
	 int i;
	 int k;
	 int j;
	 int t = 0;
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
		int m = row * col;
	 for (i = 0;i < row;i++)
	 {
	  for (k = 0;k < col;k++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   array[i][k] = Integer.parseInt(tempVar3);
	   }
	  }
	 }

	 for (j = 0;;j++)
	 {

	  for (k = j;k <= col - 1 - j;k++)
	  {
	   System.out.printf("%d\n",array[j][k]);
	   t++;
	  }
	  if (t == m)
	  {
		  break;
	  }

	  for (i = j + 1;i <= row - 1 - j;i++)
	  {
	   System.out.printf("%d\n",array[i][col - j - 1]);
	   t++;
	  }
	  if (t == m)
	  {
		  break;
	  }

	  for (k = col - j - 2;k >= j;k--)
	  {
	   System.out.printf("%d\n",array[row - j - 1][k]);
	   t++;
	  }
	  if (t == m)
	  {
		  break;
	  }

	  for (i = row - j - 2;i > j;i--)
	  {
	   System.out.printf("%d\n",array[i][j]);
	   t++;
	  }
	  if (t == m)
	  {
		  break;
	  }
	 }

		return 0;
	}
}

