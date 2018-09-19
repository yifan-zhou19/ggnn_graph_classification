int juzhen = int;
int[][] zhen = new int[100][100];
int main()
{
	int n;
	int i;
	int j;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 0; k < n; k++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(zhen, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				zhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(juzhen(n));
		System.out.print("\n");
	}
	return 0;
}
int juzhen(int n)
{
	int i;
	int j;
	int min;
	int num;
	if (n == 1)
	{
		return 0;
	}
	for (i = 0; i < n; i++)
	{
		min = zhen[i][0];
		for (j = 0; j < n; j++)
		{
			if (zhen[i][j] < min)
			{
				min = zhen[i][j];
			}
		}
		for (j = 0; j < n; j++)
		{
			zhen[i][j] -= min;
		}
	}
	for (j = 0; j < n; j++)
	{
		min = zhen[0][j];
		for (i = 0; i < n; i++)
		{
			if (zhen[i][j] < min)
			{
				min = zhen[i][j];
			}
		}
		for (i = 0; i < n; i++)
		{
			zhen[i][j] -= min;
		}
	}
	num = zhen[1][1];
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (i > 1 && j > 1)
			{
				zhen[i - 1][j - 1] = zhen[i][j];
			}
			if (i > 1 && j < 1)
			{
				zhen[i - 1][j] = zhen[i][j];
			}
			if (i < 1 && j > 1)
			{
				zhen[i][j - 1] = zhen[i][j];
			}
		}
	}
	return num + juzhen(n - 1);
}


