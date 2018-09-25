package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 5;
		int i;
		int j;
		int e;
		int lie = 0;
		int hang = 0;
		int k = 0;
		int m;
		int[][] sz = new int[100][100];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			e = -1;
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] > e)
				{
					e = sz[i][j];
					lie = j + 1;
					hang = i + 1;
				}
			}
			k = 0;
			for (m = 0;m < n;m++)
			{
				if (e > sz[m][lie-1])
				{
					k = 1;
					break;
				}
			}
				if (k == 0)
				{
					System.out.printf("%d %d %d",hang,lie,e);
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						1 = Integer.parseInt(tempVar2);
					}
					return 0;
				}
		}
		System.out.print("not found");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			1 = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

