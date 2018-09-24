package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int t = 0;
	  int k;
	  int m;
	  int[][] a = new int[100][100];
	   for (j = 0;j < 100;j++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[t][j] = Integer.parseInt(tempVar);
		   }
		   if (a[t][j] == 0)
		   {
			   t = t + 1;
		   }
		   if (a[t][j] == -1)
		   {
			   break;
		   }
	   }
	  for (k = 0;k < t;k++)
	  {
		 m = 0;
		for (i = 0;i < 100;i++)
		{
		   for (j = 0;j < 100;j++)
		   {
			 if (a[k][i] == 2 * a[k][j] && a[k][i] != 0)
			 {
			 m++;
			 }
		   }

		}
		System.out.printf("%d\n",m);
	  }
	  return 0;
	}

}

