package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[1000][7];
	   int i;
	   int j;
	   int s = 0;
	   int w;
	   int e;
	   int q;
	   for (i = 0;i < 1000;i++)
	   {
	   for (j = 0;j < 6;j++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   sz[i][j] = Integer.parseInt(tempVar);
		   }
	   }
	   if (sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0 && sz[i][0] == 0)
	   {
		   break;
	   }
	   else
	   {
		   s++;
	   }
	   }
	   for (i = 0;i < s;i++)
	   {
	   for (j = 0;j < 6;j++)
	   {
		 e = sz[i][0] * 3600 + sz[i][1] * 60 + sz[i][2];
		 w = (sz[i][3] + 12) * 3600 + sz[i][4] * 60 + sz[i][5];
		 q = w - e;
	   }
		System.out.printf("%d\n",q);
		 e = 0;
		 w = 0;
		 q = 0;
	   }
		return 0;
	}

}

