package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[ROW][COL];
		int i;
		int j;
		int n;
		int a = 0;
		int s1;
		int s2;
		int e1;
		int e2;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
				if (sz[i][j] == 0 && a == 0)
				{
					s1 = i;
					s2 = j;
					a = 1;
				}
				if (sz[i][j] == 0)
				{
					e1 = i;
					e2 = j;
				}
			}
		}
		sum = (e1 - s1 - 1) * (e2 - s2 - 1);
		System.out.printf("%d",sum);
		return 0;
	}


}

