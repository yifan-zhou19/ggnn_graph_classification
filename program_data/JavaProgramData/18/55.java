// ?????????.cpp : Defines the entry point for the console application.
//



void shuru(int);
void guiling(int);

int[][] num = new int[100][100];
int sum = 0;

int main()
{
	int n = 0;
	int i = 0;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		sum = 0;
		shuru(n);
	}

	return 0;
}

void shuru(int n)
{
	int i = 0;
	int j = 0;


	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

		guiling(n);


}

void guiling(int n)
{
	if (n == 1)
	{
		System.out.print(sum);
		System.out.print("\n");
	}
	else
	{
		int min = 0;

		int t = 0;
		int i = 0;

		for (i = 0;i < n;i++)
		{
			min = num[i][0];

			for (t = 0;t < n;t++)
			{
				if (min > num[i][t])
				{
					min = num[i][t];
				}
			}

			for (t = 0;t < n;t++)
			{
				num[i][t] -= min;
			}
		}

		for (i = 0;i < n;i++)
		{
			min = num[0][i];

			for (t = 0;t < n;t++)
			{
				if (min > num[t][i])
				{
					min = num[t][i];
				}
			}

			for (t = 0;t < n;t++)
			{
				num[t][i] -= min;
			}
		}

		sum += num[1][1];

		for (i = 0;i < n;i++)
		{
			for (t = 2;t < n;t++)
			{
				num[i][t - 1] = num[i][t];
			}
		}

		for (i = 0;i < n;i++)
		{
			for (t = 2;t < n;t++)
			{
				num[t - 1][i] = num[t][i];
			}
		}

		guiling(n - 1);
	}
}


