package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105];
	public static int Main()
	{
	  int m;
	  int n;
	  int t;
	  int i;
	  int j;
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
	  for (i = 0;i < m;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  t = 0;
			if (a[i][j] >= a[i + 1][j] != 0 || i + 1 >= m)
			{
				t++;
			}
			if (a[i][j] >= a[i][j + 1] != 0 || j + 1 >= n)
			{
				t++;
			}
			if (a[i][j] >= a[i - 1][j] != 0 || i - 1 < 0)
			{
				t++;
			}
			if (a[i][j] >= a[i][j - 1] != 0 || j - 1 < 0)
			{
				t++;
			}
			if (t == 4)
			{
				System.out.printf("%d %d\n",i,j);
			}

		  }
	  }
	 return 0;

	}

}

