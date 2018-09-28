package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s;
	int r;
	int l;
	int[][] sz = new int[100][100];
	s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			r = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		for (int j = 0;j < r;j++)
		{
			for (int k = 0;k < l;k++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					(sz[j][k]) = Integer.parseInt(tempVar4);
				}
				if ((j == 0) || (j == r - 1) || ((j != 0) && (k == 0)) || ((j != 0) && (k == l - 1)))
				{
					s = s + sz[j][k];

				}
			}
		}
		System.out.printf("%d\n",s);
	   s = 0;
	}
		return 0;
	}

}

