void change(int [][9]);
int main()
{
	int m;
	int n;
	int i;
	int j;
	int[][] matrix = new int[9][9];
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	matrix[4][4] = m;
	for (i = 0; i < n; i++)
	{
		change(matrix);
	}
	for (i = 0; i < 9; i++)
	{
		System.out.print(matrix[i][0]);
		for (j = 1; j < 9; j++)
		{
			System.out.print(' ');
			System.out.print(matrix[i][j]);
		}
		System.out.print("\n");
	}
	return 0;
}
void change(int matrix[9][9])
{
	int i;
	int j;
	int[][] plus = new int[9][9];
	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			if (matrix[i][j] > 0)
			{
				plus[i][j] += matrix[i][j];
				plus[i - 1][j] += matrix[i][j];
				plus[i][j - 1] += matrix[i][j];
				plus[i + 1][j] += matrix[i][j];
				plus[i][j + 1] += matrix[i][j];
				plus[i - 1][j - 1] += matrix[i][j];
				plus[i - 1][j + 1] += matrix[i][j];
				plus[i + 1][j + 1] += matrix[i][j];
				plus[i + 1][j - 1] += matrix[i][j];
			}
		}
	}
	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			matrix[i][j] += plus[i][j];
		}
	}
}

