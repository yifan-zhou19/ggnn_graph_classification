package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] area = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = 1;
		int start1;
		int start2;
		int end1;
		int end2;
		int re;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					area[i][j] = Integer.parseInt(tempVar2);
				}
				if (area[i][j] == 0 && f == 1)
				{
					start1 = i;
					start2 = j;
					f = 2;
				}
				if (area[i][j] == 0)
				{
					end1 = i;
					end2 = j;
				}
			}
		}
		re = (end1 - start1 - 1) * (end2 - start2 - 1);
		System.out.printf("%d",re);
		return 0;
	}


}

