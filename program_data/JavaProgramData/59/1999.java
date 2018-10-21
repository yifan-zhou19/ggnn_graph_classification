package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		char[][] sz = new char[110][110];

		int n;
		int row;
		int col;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String s0 = new String(new char[110]);

		for (row = 0;row < n;row++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s0 = tempVar2.charAt(0);
			}

			for (col = 0;col < n;col++)
			{

				//scanf("%",&sz[row][col]);

				sz[row][col] = s0.charAt(col);

				//if(sz[row][col]=='\n') col=col-1;

			}

		}

		for (row = 0;row < n;row++)
		{

			for (col = 0;col < n;col++)
			{

				if (sz[row][col] == '.')
				{
					sz[row][col] = 1;
				}

				if (sz[row][col] == '@')
				{
					sz[row][col] = 2;
				}

				if (sz[row][col] == '#')
				{
					sz[row][col] = 3;
				}

			}

		}

		int m;
		int i;

		char[][] szz = new char[110][110];

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < m - 1;i++)
		{

			for (row = 0;row < n;row++)
			{

				for (col = 0;col < n;col++)
				{

					if (sz[row][col] == 2)
					{

						if (sz[row - 1][col] == 1)
						{
							szz[row - 1][col] = 2;
						}

						if (sz[row + 1][col] == 1)
						{
							szz[row + 1][col] = 2;
						}

						if (sz[row][col + 1] == 1)
						{
							szz[row][col + 1] = 2;
						}

						if (sz[row][col - 1] == 1)
						{
							szz[row][col - 1] = 2;
						}

					}

				}

			}

			for (row = 0;row < n;row++)
			{

				for (col = 0;col < n;col++)
				{

					if (szz[row][col] == 2)
					{
						sz[row][col] = 2;
					}

				}

			}

		}

		int s = 0;

		for (row = 0;row < n;row++)
		{

			for (col = 0;col < n;col++)
			{

				if (sz[row][col] == 2)
				{
					s = s++;
				}

			}

		}

		System.out.printf("%d",s);

		return 0;

	}
}

