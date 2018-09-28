package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[11][11];
	  int[][] b = new int[11][11];
	  int m;
	  int n;
	  int i;
	  int j;
	  int k;
	  int[] p1 = new int[11];
	  (int)(*p2)[11];
	  (int)(*pTemp)[11];
	  p1 = a;
	  p2 = b;


	  for (i = 0;i <= 10;i++)
	  {
			for (j = 0;j <= 10;j++)
			{
			 a[i][j] = 0;
			 b[i][j] = 0;
			}
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  a[5][5] = m;

	  for (k = 1;k <= n;k++)
	  {
			 for (i = 1;i <= 9;i++)
			 {
				  for (j = 1;j <= 9;j++)
				  {
					   int sum = + *(p1[i] + j - 1) + *(p1[i] + j + 1) + *(p1[i - 1] + j) + *(p1[i - 1] + j - 1) + *(p1[i - 1] + j + 1) + *(p1[i + 1] + j) + *(p1[i + 1] + j - 1) + *(p1[i + 1] + j + 1);
					* (*(p2 + i) + j) = sum + (* (p1[i] + j)) * 2;
				  }
			 }
			 pTemp = p1;
			 p1 = p2;
			 p2 = pTemp;
	  }

		for (i = 1;i <= 9;i++)
		{
				  for (j = 1;j <= 9;j++)
				  {
					  if (j != 9)
					  {
					  System.out.printf("%d ",p1[i][j]);
					  }
					  else
					  {
					  System.out.printf("%d\n",p1[i][j]);
					  }
				  }
		}



	}

}

