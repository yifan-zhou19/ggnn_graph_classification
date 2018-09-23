/*
 *?????????????.cpp
 *?????
 *????: 2012-11-25
 *??????????????????a[1][1]???
 */


int[][] a = new int[100][100]; //????a[100][100]?????
int n; //????n?�?�sum
int sum = 0;
int Sum = int; //????Sum(n),???
void RowSub(int); //????RowSub(int)?????
void ColSub(int); //????ColSub(int)?????

int Sum(int n)
{
	RowSub(n); //?????????
	ColSub(n); //?????????
	if (n == 2) //????
	{
		return a[1][1];
	}
	int k = a[1][1]; //?k??
	//????
	for (int i = 1; i < n - 1; i++)
	{
		a[i][0] = a[i + 1][0];
		a[0][i] = a[0][i + 1];
		for (int j = 1; j < n - 1; j++)
		{
			a[i][j] = a[i + 1][j + 1];
		}
	}
	return k + Sum(n - 1); //??�?�
}

void RowSub(int n)
{
	for (int i = 0; i < n; i++)
	{
		int min = a[i][0];
		//?????????
		for (int j = 0; j < n; j++)
		{
			if (a[i][j] < min)
			{
				min = a[i][j];
			}
		}
		//?????
		for (int j = 0; j < n; j++)
		{
			a[i][j] = a[i][j] - min;
		}
	}
	return;
}

void ColSub(int n)
{
	for (int i = 0; i < n; i++)
	{
		int min = a[0][i];
		//?????????
		for (int j = 0; j < n; j++)
		{
			if (a[j][i] < min)
			{
				min = a[j][i];
			}
		}
		//?????
		for (int j = 0; j < n; j++)
		{
			a[j][i] = a[j][i] - min;
		}
	}
	return;
}
int main()
{
	int i; //??????i,j,k
	int j;
	int k;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			for (k = 0; k < n; k++)
			{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(Sum(n));
		System.out.print("\n");
	}
	return 0;
}



