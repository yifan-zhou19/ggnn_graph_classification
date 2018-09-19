package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int star1;
		int star2;
		int end1;
		int end2;
		int b;
		int n;
		int f = 0;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0 && f == 0)
				{
					star1 = i + 1;
					star2 = j + 1;
					f = 1;
				}
				if (a[i][j] == 0)
				{
					end1 = i - 1;
					end2 = j - 1;
				}
			}
		}
			b = (end1 - star1 + 1) * (end2 - star2 + 1);
			System.out.printf("%d",b);
			return 0;
	}
}

