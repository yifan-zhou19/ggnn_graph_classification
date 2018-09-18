int zhongliu = new int(int, int, int, int);
int[][] num = new int[1001][1001];
int n;
int main()
{
	int i;
	int j;
	int judge = 0;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (num[i][j] == 255)
			{
				judge = zhongliu(i, j, 0,1) + zhongliu(i, j, 0, -1) + zhongliu(i, j, 1, 0) + zhongliu(i, j, -1, 0);
			}
			if (judge == 4)
			{
				sum++;
			}
			judge = 0;
		}
	}
	System.out.print(sum);
	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	return 0;
}

int zhongliu(int x, int y, int a, int b)
{
	if (x < 0 || y < 0 || x >= n != 0 || y >= n)
	{
		return 0;
	}
	if (num[x][y] == 0)
	{
		return 1;
	}
	else
	{
		return zhongliu(x + a, y + b, a, b);
	}
}



