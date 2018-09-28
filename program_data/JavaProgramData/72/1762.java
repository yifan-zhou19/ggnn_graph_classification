package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	int p;
	int q;
	int x = 0;
		int[][] sz = new int[20][20];
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
				sz[i][j] = Integer.parseInt(tempVar3);
			}
		  }
		}
		for (i = 0;i < m;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			a = i + 1;
			b = i - 1;
			c = j + 1;
			d = j - 1;
			p = m - 1;
			q = n - 1;
			 if (i == 0 && j == 0)
			 {
			   if (sz[i][j] >= sz[0][1] != 0 && sz[i][j] >= sz[1][0])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			 }
			else if (i == 0 && j == q)
			{
			   if (sz[i][j] >= sz[0][d] != 0 && sz[i][j] >= sz[1][j])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else if (i == p && j == 0)
			{
			   if (sz[i][j] >= sz[i][1] != 0 && sz[i][j] >= sz[b][0])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else if (i == p && j == q)
			{
			   if (sz[i][j] >= sz[i][d] != 0 && sz[i][j] >= sz[b][j])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else if (i == 0 && j > 0 && j < q)
			{
			   if (sz[i][j] >= sz[i][c] != 0 && sz[i][j] >= sz[i][d] != 0 && sz[i][j] >= sz[1][j])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else if (i == p && j > 0 && j < q)
			{
			  if (sz[i][j] >= sz[i][c] != 0 && sz[i][j] >= sz[i][d] != 0 && sz[i][j] >= sz[b][j])
			  {
				  System.out.printf("%d %d\n",i,j);
			  }
			}
			else if (j == 0 && i > 0 && i < p)
			{
			   if (sz[i][j] >= sz[a][j] != 0 && sz[i][j] >= sz[b][j] != 0 && sz[i][j] >= sz[i][1])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else if (j == q && i > 0 && i < p)
			{
			   if (sz[i][j] >= sz[a][j] != 0 && sz[i][j] >= sz[b][j] != 0 && sz[i][j] >= sz[i][d])
			   {
				  System.out.printf("%d %d\n",i,j);
			   }
			}
			else
			{
			  if (sz[i][j] >= sz[i][c] != 0 && sz[i][j] >= sz[i][d] != 0 && sz[i][j] >= sz[a][j] != 0 && sz[i][j] >= sz[b][j])
			  {
				System.out.printf("%d %d\n",i,j);
			  }
			}

		  }
		}
	return 0;
	}
}

