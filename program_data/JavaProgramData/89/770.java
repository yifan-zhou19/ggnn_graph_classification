package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int row;
		 int col;
		 int i;
		 int num;
		 int x;
		 int[][] sz = new int[1000000][2];
		 int[] brs = new int[10000];
		 int[] rs = new int[10000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (row = 0;row < n * n;row++)
		 {
				for (col = 0;col < 2;col++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						sz[row][col] = Integer.parseInt(tempVar2);
					}
				}
				if (sz[row][0] == 0 && sz[row][1] == 0)
				{
					break;
				}
		 }
		x = row;
		for (i = 0;i < n;i++)
		{
			num = 0;
			for (row = 0;row <= x;row++)
			{
				if (sz[row][1] == i)
				{
					num++;
				}
			}
			brs[i] = num;
		}
		for (i = 0;i < n;i++)
		{
			num = 0;
			for (row = 0;row <= x;row++)
			{
				if (sz[row][0] == i)
				{
					num++;
				}
			}
			rs[i] = num;
		}
		num = 0;
		for (i = 0;i < n;i++)
		{
			if (brs[i] == n - 1 && rs[i] == 0)
			{
				System.out.printf("%d",i);
			}
			else
			{
				num++;
			}
		}
		if (num == n)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}
}

