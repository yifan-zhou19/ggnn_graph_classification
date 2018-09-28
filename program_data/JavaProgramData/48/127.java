void spread(int [9][9]);
int main()
{
	int[][] a = new int[9][9];
	int m;
	int n;
	int i;
	int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 9;j++)
		{
			a[i][j] = 0;
		}
	}
	a[4][4] = m;
	for (i = 0;i < n;i++)
	{
		spread(a);
	}
	for (i = 0;i < 9;i++)
	{
		System.out.print(a[i][0]);
		for (j = 1;j < 9;j++)
		{
			System.out.print(" ");
			System.out.print(a[i][j]);
		}
		System.out.print("\n");
	}
	return 0;
}
void spread(int a[9][9])
{
	int[][] b = new int[9][9];
	int i;
	int j;
	int p;
	int q;
	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 9;j++)
		{
			b[i][j] = a[i][j];
		}
	}
	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 9;j++)
		{
			if (b[i][j] != 0)
			{
				for (p = i - 1;p <= i + 1;p++)
				{
					for (q = j - 1;q <= j + 1;q++)
					{
						a[p][q] += b[i][j];
					}
				}
			}
		}
	}
}

