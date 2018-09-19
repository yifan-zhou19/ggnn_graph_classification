package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[16][16];
		int i;
		int j;
		int[] t = new int[15];
		int k = 0;
		int f;
		int[] b = new int[16];
		for (i = 0;i <= 10;i++)
		{
		  for (j = 0;j <= 15;j++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar);
			  }
			  if (a[i][j] == -1)
			  {
				  break;
			  }
			  if (a[i][j] == 0)
			  {
			  break;
			  }
			  t[i] = t[i] + 1;
		  }
		   if (a[i][j] == -1)
		   {
			   break;
		   }
			 k = k + 1;
		}
		 for (i = 0;i < k;i++)
		 {
			for (j = 0;j < t[i];j++)
			{
			  for (f = j + 1;f <= t[i];f++)
			  {
				if ((a[i][j] == 2 * a[i][f]) || (a[i][f] == 2 * a[i][j]))
				{
				  b[i]++;
				}
			  }
			}
		 }
		  for (i = 0;i < k;i++)
		  {
		  System.out.printf("%d\n",b[i]);
		  }
		  return 0;
	}

}

