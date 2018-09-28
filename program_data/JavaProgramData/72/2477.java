package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int[][] WL = new int[21][21];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   WL[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 int a;
	 int b;
	 b = m - 1;
		a = n - 1;
	 if (WL[0][0] >= WL[0][1] != 0 && WL[0][0] >= WL[1][0])
	 {
	  System.out.print("0 0\n");
	 }
	 for (i = 1;i < n - 1;i++)
	 {
		 if (WL[0][i] >= WL[0][i + 1] != 0 && WL[0][i] >= WL[1][i] != 0 && WL[0][i] >= WL[0][i - 1])
		 {
	   System.out.printf("0 %d\n",i);
		 }
	 }
	 if (WL[0][n - 1] >= WL[0][n - 2] != 0 && WL[0][n - 1] >= WL[1][n - 1])
	 {

	  System.out.printf("0 %d\n",a);
	 }
		for (j = 1;j < m - 1;j++)
		{
			if (WL[j][0] >= WL[j - 1][0] != 0 && WL[j][0] >= WL[j + 1][0] != 0 && WL[j][0] >= WL[j][1])
			{
				System.out.printf("%d %d\n",j,0);
			}
	  for (i = 1;i < n - 1;i++)
	  {
			  if (WL[j][i] >= WL[j - 1][i] != 0 && WL[j][i] >= WL[j][i - 1] != 0 && WL[j][i] >= WL[j + 1][i] != 0 && WL[j][i] >= WL[j][i + 1])
			  {
			   System.out.printf("%d %d\n",j,i);
			  }
	  }
	  if (WL[j][n - 1] >= WL[j - 1][n - 1] != 0 && WL[j][n - 1] >= WL[j + 1][n - 1] != 0 && WL[j][n - 1] >= WL[j][n - 2])
	  {
				System.out.printf("%d %d\n",j,a);
	  }
		}
	   if (WL[m - 1][0] >= WL[m - 2][0] != 0 && WL[m - 1][0] >= WL[m - 1][1])
	   {
	  System.out.printf("%d %d\n",b,0);
	   }
	 for (i = 1;i < n - 1;i++)
	 {
		 if (WL[m - 1][i] >= WL[m - 1][i + 1] != 0 && WL[m - 1][i] >= WL[m - 2][i] != 0 && WL[m - 1][i] >= WL[m - 1][i - 1])
		 {
	   System.out.printf("%d %d\n",b,i);
		 }
	 }


	 if (WL[m - 1][n - 1] >= WL[m - 2][n - 1] != 0 && WL[m - 1][n - 1] >= WL[m - 1][n - 2])
	 {
	  System.out.printf("%d %d\n",b,a);
	 }

	 return 0;
	}
}

