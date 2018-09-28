package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][6];
	   int i;
	   int j;
	   int h;
	   int total;
	   int m;
	   int s;
	   for (i = 0;i < 100;i++)
	   {
		   for (j = 0;j < 6;j++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar);
			   }
		   }
		 if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
		 {
			   m = i;
			   break;

		 }
	   }
		for (i = 0;i < m;i++)
		{
		  h = 0;
		  s = 0;
		  total = 0;
		  h = a[i][3] + 12 - a[i][0];
		  s = a[i][4] * 60 + a[i][5] - a[i][1] * 60 - a[i][2];
		  total = h * 3600 + s;
		  System.out.printf("%d\n",total);
		}
		  return 0;
	}

}

