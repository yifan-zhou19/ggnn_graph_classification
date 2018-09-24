package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] array = new int[100][100];
	 int i;
	 int j;
	 int a;
	 int b;
	 int b1;
	 int c;
	 int c1;
	 int d;
	 int e;
	 int f;
	 int f1;
	 int g;
	 int g1;
	 int h;
	 int row;
	 int col;
	 int[] sz = new int[10000];
	 int n = 0;
	 int s = 0;
	 int p;
	 int k = 0;
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
		   array[i][j] = Integer.parseInt(tempVar3);
	   }
	   s++;
	  }
		}
	 while (n <= s)
	 {
	  for (k = 0;k < col;k++)
	  {
	  a = k;
	  b1 = k;
			  for (b = b1;b < col - k;b++)
			  {
			   sz[n] = array[a][b];
		 n++;
			  }
		 d = col - k - 1;
		 for (c = k + 1;c < row - k;c++)
		 {
	   sz[n] = array[c][d];
	   n++;
		 }
	  e = row - k - 1;
	  f1 = col - 2 - k;
			   for (f = f1;f >= k;f--)
			   {
		 sz[n] = array[e][f];
		 n++;
			   }
	  h = k;
	  g1 = row - 2 - k;
			for (g = g1;g >= 1 + k;g--)
			{
		 sz[n] = array[g][h];
		 n++;
			}

	  }
	 }
		 for (p = 0;p < s;p++)
		 {
	   System.out.printf("%d\n",sz[p]);
		 }

	return 0;
	}
}

