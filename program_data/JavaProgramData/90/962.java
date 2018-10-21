package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] f = new int[501][501];
		int i;
		int j;
		int num;
		int n;
		int m;
		  for (i = 1;i <= 500;i++)
		  {
			  f[i][1] = 1;
			  f[1][i] = 1;
			  f[i][0] = 1;
		  }

		  for (i = 2;i <= 500;i++)
		  {
		  for (j = 2;j <= 500;j++)
		  {
			  if (i > j)
			  {
				  f[i][j] = f[j][j];
			  }
			else
			{
				f[i][j] = f[i - 1][j] + f[i][j - i];
			}
		  }
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  num = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < num;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  System.out.printf("%d\n",f[n][m]);
		  }

	}

}

