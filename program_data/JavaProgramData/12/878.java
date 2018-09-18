package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[100][16];
	 int i;
	 int j;
	 int k;
	 int t;
	 int s;
	 int[] b = new int[100];
	 for (i = 0;i <= 99;i++)
	 {

	  for (j = 0;j <= 15;j++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar);
	   }
	   if (a[i][j] == 0 || a[i][j] == -1)
	   {
		   break;
	   }
	  }
	  if (a[i][0] == -1)
	  {
		  b[i] = -1;
		  break;
	  }
	 }
		for (k = 0;k <= 99;k++)
		{
	  if (a[k][0] == -1)
	  {
		  break;
	  }
	  for (t = 0;t <= 15;t++)
	  {
	   if (a[k][t] == 0 || a[k][t] == -1)
	   {
		   break;
	   }
	   for (s = 0;s <= 15;s++)
	   {
		if (a[k][s] == 0)
		{
			break;
		}
		if (a[k][t] * 2 == a[k][s])
		{
			b[k]++;
		}
	   }
	  }
		}
	 for (int q = 0;q <= 99;q++)
	 {
	  if (b[q] == -1)
	  {
		  break;
	  }
	  System.out.printf("%d\n",b[q]);
	 }
	 return 0;
	}
}

