package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] sz = new int[100][100];
	 int i = 0;
	 int j = 0;
	 int row;
	 int col;
	 int hxx;
	 int hsx;
	 int lxx;
	 int lsx;
	 int m1;
	 int m2;
	 int m3;
	 int m4;
	 int n1;
	 int n2;
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
	 for (i = 0;i < row;i++)
	 {
	  for (j = 0;j < col;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }

	 hxx = 0;
	 hsx = row - 1;
	 lxx = 0;
	 lsx = col - 1;
	 for (hxx = 0, hsx = row - 1, lxx = 0, lsx = col - 1;hxx < hsx && lxx < lsx;hxx++, hsx--, lxx++, lsx--)
	 {
		for (m1 = lxx;m1 < lsx;m1++)
		{
	  System.out.printf("%d\n",sz[hxx][m1]);
		}
	 for (m2 = hxx;m2 < hsx;m2++)
	 {
	  System.out.printf("%d\n",sz[m2][lsx]);
	 }
	 for (m3 = lsx;m3 > lxx;m3--)
	 {
	  System.out.printf("%d\n",sz[hsx][m3]);
	 }
		for (m4 = hsx;m4 > hxx;m4--)
		{
	  System.out.printf("%d\n",sz[m4][lxx]);
		}
	 }
	 if (hxx == hsx)
	 {
	  for (n1 = lxx;n1 <= lsx;n1++)
	  {
	   System.out.printf("%d\n",sz[hxx][n1]);
	  }
	 }
	 else if (lxx == lsx)
	 {
	  for (n2 = hxx;n2 <= hsx;n2++)
	  {
	   System.out.printf("%d\n",sz[n2][lxx]);
	  }
	 }
	  return 0;
	}
}

