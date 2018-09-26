/**
 * ??? ???
 * ??? 1000012844
 * ??? ????
 **/


int timesPerMin = new int(int *, int);

int main()
{
	int i;
	int j;
	int n;
	int[] failedTimes = new int[100];
	int[][] num =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0; i < n; i++)
	{
		failedTimes[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < failedTimes[i]; j++)
		{
			num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	for (i = 0; i < n; i++)
	{
			System.out.print(timesPerMin(num[i], failedTimes[i]));
			System.out.print("\n");
	}

	return 0;
}

int timesPerMin(int num[], int failed)
{
	int i = 0;

	for (i = 0; ;i++)
	{
		if (num[i] == 0)
		{
			num[i] = 60;
			break;
		}
	}

	for (i = 0; ;i++)
	{
		if ((num[i] + i * 3 <= 60) && (num[i] + i * 3 + 3 > 60))
		{
			return num[i];
			break;
		}
		else
		{
			if (num[i] + i * 3 + 3 <= 60 && i * 3 + 3 + num[i + 1] > 60)
			{
				return 60 - i * 3 - 3;
				break;
			}
		}
	}

}

