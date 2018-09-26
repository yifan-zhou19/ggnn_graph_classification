package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][][] sz = new char[101][103][103];
	   int n;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  sz[0][i][1] = tempVar2.charAt(0);
			  }
	   }
	   int m;
	   int k;
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   m = Integer.parseInt(tempVar3);
	   }


		   for (i = 0;i <= (n + 1);i++)
		   {
			   for (j = 0;j <= (n + 1);j++)
			   {
				   if (i == 0 || j == 0 || i == n + 1 || j == n + 1)
				   {
					   sz[0][i][j] = '#';
				   }
				   else
				   {
					   sz[0][i][j] = sz[0][i][j];
				   }
			   }
		   }


		   for (k = 0;k < m;k++)
		   {
					for (i = 1;i <= n;i++)
					{
			   for (j = 1;j <= n;j++)
			   {
			   sz[k + 1][i][j] = sz[k][i][j];
					   if (sz[k][i][j] == '.' && (sz[k][i][j + 1] == '@' || sz[k][i][j - 1] == '@' || sz[k][i + 1][j] == '@' || sz[k][i - 1][j] == '@'))
					   {
						   sz[k + 1][i][j] = '@';
					   }

			   }
					}
		   }


	   int sum = 0;
	   int h;
	   int w;
	   for (h = 1;h <= n;h++)
	   {
		   for (w = 1;w <= n;w++)
		   {
			   if (sz[m - 1][h][w] == '@')
			   {
				   sum++;
			   }
		   }
	   }
	   System.out.printf("%d\n",sum);

	   return 0;

	}
}

