package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int k;
		int i;
		int n;
		int m;
		n = 5;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][k] = Integer.parseInt(tempVar);
			}
			}
		}
			   m = 1;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (sz[i][k] >= sz[i][0] != 0 && sz[i][k] >= sz[i][1] != 0 && sz[i][k] >= sz[i][2] != 0 && sz[i][k] >= sz[i][3] != 0 && sz[i][k] >= sz[i][4])
				{
					if (sz[i][k] <= sz[0][k] != 0 && sz[i][k] <= sz[1][k] != 0 && sz[i][k] <= sz[2][k] != 0 && sz[i][k] <= sz[3][k] != 0 && sz[i][k] <= sz[4][k])
					{
						System.out.printf("%d %d %d",(i + 1),(k + 1),sz[i][k]);
				   m = 0;
					}
				}
			}
		}
					 if (m != 0)
					 {
					 System.out.print("not found");
					 }
				return 0;
	}

}

