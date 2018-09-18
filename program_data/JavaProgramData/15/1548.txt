package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[100][100];
		int row;
		int col;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int s = 0;
		int p = 0;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p != 1)
			{
				for (j = 0;j < n;j++)
				{
					if (sz[j][i] == 0)
					{
						a = j;
						b = i;
						p = 1;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
		for (k = n - 1;k >= 0;k--)
		{
			if (p != 0)
			{
				for (l = n - 1;l >= 0;l--)
				{
					if (sz[l][k] == 0)
					{
						c = l;
						d = k;
						p = 0;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

