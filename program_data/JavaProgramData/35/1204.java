package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int r;
		int s;
		int max = 0;
		int min = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (j == 0)
				{
				max = sz[i][0];
				r = 0;
				}
			 if (sz[i][j] > max)
			 {
					max = sz[i][j];
					r = j;
			 }
			}
			for (k = 0;k < m;k++)
			{
				for (l = 0;l < n;l++)
				{
						 if (l == 0)
						 {
							   min = sz[0][k];
							   s = 0;
						 }
						 if (sz[l][k] < min)
						 {
								min = sz[l][k];
								s = l;

						 }
				}
							if (max == min && i == s && r == k)
							{
								System.out.printf("%d+%d",s,r);
								t++;
								max = 0;
								min = 100;
							}
			}


		}
		if (t == 0)
		{
			System.out.print("No");
		}
	  return 0;
	}

}

