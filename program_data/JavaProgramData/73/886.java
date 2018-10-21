package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[6][6]; //={0,1,1,1,1,1,0,11,3,5,6,9,0,12,4,7,8,10,0,10,5,6,9,11,0,8,6,4,7,2,0,15,10,11,20,25};
	public static int max(int hang)
	{
		int m = 0;
		int ji;
		for (int k = 1;k <= 5;k++)
		{
			if (a[hang][k] > m)
			{
				m = a[hang][k];
				ji = k;
			}
		}
		return ji;
	}
	public static int min(int lie)
	{
		int m = a[1][lie];
		int ji = 1;
		for (int k = 2;k <= 5;k++)
		{
			if (a[k][lie] < m)
			{
				m = a[k][lie];
				ji = k;
			}
		}
		return ji;
	}

	public static int Main()
	{
		  int i;
		  int j;
		  int x = 0;
		  for (i = 1;i <= 5;i++)
		  {
			  for (j = 1;j <= 5;j++)
			  {
				  //printf("%d ",a[i][j]); 
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar);
				  }
			  }
			  //printf("\n");
		  }
		  for (i = 1;i <= 5;i++)
		  {
			  j = max(i);
			  if (min(j) == i)
			  {
				  System.out.printf("%d %d %d\n",i,j,a[i][j]);
				  x = 1;
			  }
		  }
		  if (x == 0)
		  {
			  System.out.print("not found\n");
		  }
	}
}

