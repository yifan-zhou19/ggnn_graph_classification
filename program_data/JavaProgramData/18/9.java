/**
* @author ??
* @date 2010-12-1
* @description
* ??????:????????? 
*/
int sum;
void calculate(int[][100],int);

int main()
{
	int n;
	int[][] a = new int[100][100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			sum = 0;
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			calculate(a, n);
			System.out.print(sum);
			System.out.print("\n");
		}
	return 0;
}
void calculate(int a[][100],int n)
{
	if (n == 1)
	{
		return;
	}
	int minx;
	int miny;
	for (int i = 0; i < n; i++)
	{
		minx = a[i][0];
		for (int j = 1; j < n; j++)
		{
			if (a[i][j] < minx)
			{
				minx = a[i][j];
			}
		}
		for (int j = 0; j < n; j++)
		{
			a[i][j] -= minx;
		}
	}
	for (int i = 0; i < n;i++)
	{
		miny = a[0][i];
		for (int j = 1; j < n;j++)
		{
			if (a[j][i] < miny)
			{
				miny = a[j][i];
			}
		}
		for (int j = 0; j < n; j++)
		{
			a[j][i] -= miny;
		}
	}
	sum += a[1][1];
	for (int i = 0; i < n; i++)
	{
		for (int j = 1; j < n - 1; j++)
		{
			a[i][j] = a[i][j + 1];
		}
	}
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 1; j < n - 1; j++)
		{
			a[j][i] = a[j + 1][i];
		}
	}
	calculate(a, n - 1);
}












