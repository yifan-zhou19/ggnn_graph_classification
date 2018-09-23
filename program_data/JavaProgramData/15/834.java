package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int star1;
		int star2;
		int end1;
		int end2;
		int f = -1;
		int re = 0;
		i = 0;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] s = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(s[i][j]) = Integer.parseInt(tempVar2);
				}
				if (s[i][j] == 0 && f == -1)
				{
					star1 = i + 1;
					star2 = j + 1;
					f = 1;
				}
				if (s[i][j] == 0)
				{
					end1 = i - 1;
					end2 = j - 1;
				}
			}
		}
		re = (end1 - star1 + 1) * (end2 - star2 + 1);
		System.out.printf("%d",re);
		return 0;
	}


}

