package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int p;
		int[][] sz = new int[5][5];
		p = 0;
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  sz[i][j] = Integer.parseInt(tempVar);
			  }
		   }
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					t = 1;
					if (k != j && sz[i][j] < sz[i][k] || k != i && sz[k][j] < sz[i][j])
					{
					   t = 0;
					   break;
					}
				}
				 if (t == 1)
				 {
					   System.out.printf("%d %d %d",i + 1,j + 1,sz[i][j]);
					   p = 1;
				 }
			}
		}
		if (p == 1)
		{
		  return 0;
		}
		else
		{
		  System.out.print("not found");
		}
		return 0;
	}


}

