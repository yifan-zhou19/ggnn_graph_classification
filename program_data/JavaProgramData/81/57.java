package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][25];
		int h;
		int l;
		int e;
		int m;
		int n;
		for (h = 0;h < 5;h++)
		{
			for (l = 0;l < 5;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[h][l] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{

		for (l = 0;l < 5;l++)
		{
			e = sz[m][l];
			sz[m][l] = sz[n][l];
			sz[n][l] = e;
		}
		}
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			for (h = 0;h < 5;h++)
			{
			for (l = 0;l < 5;l++)
			{
				if (l == 4)
				{
					System.out.printf("%d\n",sz[h][l]);
				}
				else
				{
					System.out.printf("%d ",sz[h][l]);
				}
			}
			}
		}
		else
		{
			System.out.print("error");
		}








		return 0;
	}

}

