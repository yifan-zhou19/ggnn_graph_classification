//*****************************************
//* ?????(11.8) ???????? **
//* ?????? 1300012741 **
//* ???2013.10.16 **
//*****************************************


void bacteria(int, int[9][9]);

int main()
{
	int numBacteria;
	int numDay;
	int[][] container =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	int i;
	int j;

	numBacteria = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	numDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	container[4][4] = numBacteria;

	bacteria(numDay, container);

	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			System.out.print(container[i][j]);
			if (j != 8)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

	return 0;
}

void bacteria(int numDay, int container[9][9])
{
	int i;
	int j;
	int[][] tempContainer =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	if (!numDay)
	{
		return;
	}
	else
	{
		bacteria(numDay - 1, container);
	}

	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			if (container[i][j])
			{
				tempContainer[i - 1][j] += container[i][j];
				tempContainer[i + 1][j] += container[i][j];
				tempContainer[i][j - 1] += container[i][j];
				tempContainer[i][j + 1] += container[i][j];
				tempContainer[i - 1][j - 1] += container[i][j];
				tempContainer[i - 1][j + 1] += container[i][j];
				tempContainer[i + 1][j - 1] += container[i][j];
				tempContainer[i + 1][j + 1] += container[i][j];
				tempContainer[i][j] += 2 * container[i][j];
			}
		}
	}
	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			if (tempContainer[i][j] != 0)
			{
				container[i][j] = tempContainer[i][j];
			}
		}
	}

	return;
}

