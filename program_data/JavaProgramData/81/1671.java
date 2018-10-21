package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int row;
		int col;
		for (row = 0;row < 5;row++)
		{
			for (col = 0; col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		int n;
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int o;
		int p;
		int q;
		int r;
		int s;
		int i;
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			o = sz[n][0];
			p = sz[n][1];
			q = sz[n][2];
			r = sz[n][3];
			s = sz[n][4];
			for (i = 0;i < 5;i++)
			{
				sz[n][i] = sz[m][i];
			}
			sz[m][0] = o;
			sz[m][1] = p;
			sz[m][2] = q;
			sz[m][3] = r;
			sz[m][4] = s;
			for (row = 0; row < 5;row++)
			{
				for (col = 0;col < 4; col++)
				{
					System.out.printf("%d ", sz[row][col]);
				}
				System.out.printf("%d\n",sz[row][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}


}

