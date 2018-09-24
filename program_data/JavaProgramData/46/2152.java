package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int[][] sz = new int[100][100];
	  int k;
	  int i;
	  int j;
	  int a;
	  int b;
	  int c;
	  int d;

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
		   sz[k][i] = Integer.parseInt(tempVar3);
	   }
		}
	  }

	  a = 0;
	  b = col - 1;
	  c = row - 1;
	  d = 0;

	  while (a < c && d < b) //????????\n
	  {
		for (i = d; i < b; i++)
		{
	  System.out.printf("%d\n",sz[a][i]);
		}
	 for (j = a; j < c; j++)
	 {
	  System.out.printf("%d\n",sz[j][b]);
	 }
	 for (i = b; i > d; i--)
	 {
	  System.out.printf("%d\n",sz[c][i]);
	 }
	 for (j = c; j > a; j--)
	 {
	  System.out.printf("%d\n",sz[j][d]);
	 }
	 a++;
	 b--;
	 c--;
	 d++;
	  }
	  /*
	  * ????????????????
	  * ????????????????????????????????
	  */
	if (a == c && b == d)
	{
	 System.out.printf("%d\n",sz[a][b]);
	}
	  if (b == d && a != c)
	  {
		for (i = a; i <= c; i++)
		{
	  System.out.printf("%d\n",sz[i][b]);
		}
	  }
	  if (a == c && b != d)
	  {
		for (i = d; i <= b; i++)
		{
	  System.out.printf("%d\n",sz[a][i]);
		}
	  }
	  return 0;
	}
}

