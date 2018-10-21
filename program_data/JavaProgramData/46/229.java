int[][] matrix = new int[101][101];

void transform(int, int);

int main()
{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1; i <= m ; i++)
		{
				for (j = 1; j <= n; j++)
				{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							matrix[i][j] = Integer.parseInt(tempVar3);
						}
				}
		}
		transform(m, n);

		return 0;
}

void transform(int m, int n)
{
		int total = m * n;
		int index = 0;
		int dir = 0;
		int x = 0;
		int y = 0;
		int[] times = new int[4];

		while (index < total)
		{
				switch (dir)
				{
						case 0:
								x++;
								y++;
								while (y < n - times[1])
								{
										System.out.printf("%d\n", matrix[x][y]);
										y++;
										index++;
								}
								break;
						case 1:
								while (x < m - times[2])
								{
										System.out.printf("%d\n", matrix[x][y]);
										x++;
										index++;
								}
								break;
						case 2:
								while (y > times[3] + 1)
								{
										System.out.printf("%d\n", matrix[x][y]);
										y--;
										index++;
								}
								break;
						case 3:
								while (x > times[0])
								{
										System.out.printf("%d\n", matrix[x][y]);
										x--;
										index++;
								}
								break;
						default:
								break;
				}
				if (total - index == 1)
				{
						if (dir == 3)
						{
							x++, y++;
						}
						System.out.printf("%d\n", matrix[x][y]);
						index++;
				}
				times[dir]++;
				dir = (dir + 1) % 4;
		}
}


