package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int k;
		  int m;
		  int n = 0;
		  for (i = 0;i <= 4;i++)
		  {
			   for (j = 0;j <= 4;j++)
			   {
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[i][j] = Integer.parseInt(tempVar);
					}
			   }
		  }
		  for (i = 0;i <= 4;i++)
		  {
			   for (j = 0;j <= 4;j++)
			   {
					for (k = 0;k <= 4;k++)
					{
						if (a[i][j] >= a[i][k])
						{
						continue;
						}
						else
						{
						break;
						}
					}
					for (m = 0;m <= 4;m++)
					{
						if (a[i][j] <= a[m][j])
						{
						continue;
						}
						else
						{
						break;
						}
					}
					if (k == 5 && m == 5)
					{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					n = 1;
					}
			   }
		  }
		  if (n == 0)
		  {
		  System.out.print("not found");
		  }

	}

}

