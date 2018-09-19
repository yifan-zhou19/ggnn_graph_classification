/**
 * ????????.cpp
 * ????????????
 * ??????
 * ???2010.12.1
 */


int changeSum = new int(int, int, int[][100]);
int main()
{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		int j;
		int k;
		int[][] a = new int[100][100];
		for (j = 0; j < n; j++)
		{
			for (k = 0; k < n; k++)
			{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(changeSum(n, 0, a));
		System.out.print("\n");
	}
	return 0;
}

int changeSum(int n, int sum, int a[][100])
{
	if (n == 1)
	{
		return sum;
	}
	else
	{
		int j;
		int k;
		int minrow;
		int mincol;
		for (j = 0; j < n; j++)
		{
			minrow = a[j][0];
			for (k = 1; k < n; k++)
			{
				if (a[j][k] < minrow)
				{
					minrow = a[j][k];
				}
			}
			for (k = 0; k < n; k++)
			{
				a[j][k] -= minrow;
			}
		}
		for (k = 0; k < n; k++)
		{
			mincol = a[0][k];
			for (j = 1; j < n; j++)
			{
				if (a[j][k] < mincol)
				{
					mincol = a[j][k];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[j][k] -= mincol;
			}
		}
		sum += a[1][1];
		for (j = 2; j < n; j++)
		{
			for (k = 0; k < n; k++)
			{
				a[j - 1][k] = a[j][k];
			}
		}
		for (j = 0; j < n; j++)
		{
			for (k = 2; k < n; k++)
			{
				a[j][k - 1] = a[j][k];
			}
		}
		n--;
		changeSum(n, sum, a);
	}
}


