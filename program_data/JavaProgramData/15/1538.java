package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int f = 1;
		int a1;
		int a2;
		int b1;
		int b2;
		int[][] area = new int[100][100];
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
					area[i][j] = Integer.parseInt(tempVar2);
				}
				if (area[i][j] == 0 && f == 1)
				{
					a1 = i;
					b1 = j;
					f = 0;
				}
				if (area[i][j] == 0)
				{
					a2 = i;
					b2 = j;
				}
			}
		}
		s = (a2 - a1 + 1) * (b2 - b1 + 1) - 2 * (a2 - a1 + 1) - 2 * (b2 - b1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

