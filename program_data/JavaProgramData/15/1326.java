package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[1000][1000];

	public static int Main()
	{
		int i = 0;
		int n;
		int s;
		int[] rrr = new int[5000];
		int[] ccc = new int[5000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int row = 0;row < n;row++)
		{
			for (int col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
				if (sz[row][col] == 0)
				{
					rrr[i] = row;
					ccc[i] = col;
					i++;
				}
			}
		}
		s = (rrr[i - 1] - rrr[0] - 1) * (ccc[i - 1] - ccc[0] - 1);
		System.out.printf("%d",s);
		return 0;
	}

}

