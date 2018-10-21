package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sz = new char[101][101];
		int row;
		int col;
		for (row = 0;row <= n + 1;row++)
		{
			for (col = 0;col <= n + 1;col++)
			{
				sz[row][col] = '#';
			}
		}
		for (row = 1;row <= n;row++)
		{
			for (col = 1;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					sz[row][col] = tempVar2.charAt(0);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				sz[row][n] = tempVar3.charAt(0);
			}
		}
		int m;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		int day;
		int people;
		people = 0;
		for (day = 1;day < m;day++)
		{
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					if (sz[row][col] == '@')
					{
					if (sz[row][col + 1] == '.')
					{
						sz[row][col + 1] = 'a';
					}
					if (sz[row][col - 1] == '.')
					{
						sz[row][col - 1] = 'a';
					}
					if (sz[row - 1][col] == '.')
					{
						sz[row - 1][col] = 'a';
					}
					if (sz[row + 1][col] == '.')
					{
						sz[row + 1][col] = 'a';
					}
					}
				}
			}
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					if (sz[row][col] == 'a')
					{
						sz[row][col] = '@';
					}
				}
			}
		}
		for (row = 1;row <= n;row++)
		{
			for (col = 1;col <= n;col++)
			{
				if (sz[row][col] == '@')
				{
					people = people+1;
				}
			}
		}
		System.out.printf("%d",people);
		return 0;
	}




}

