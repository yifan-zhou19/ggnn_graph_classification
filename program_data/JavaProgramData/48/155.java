int[][] num = new int[10][10];
int[][] newnum = new int[10][10];
void change(int, int);
int main()
{
	int m;
	int n;
	int i;
	int j;
	int k;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(num,0,(Integer.SIZE / Byte.SIZE));
	num[5][5] = m;
	for (i = 1 ; i <= n ; i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(newnum,0,(Integer.SIZE / Byte.SIZE));
		for (j = 1 ; j <= 9 ; j++)
		{
			for (k = 1 ; k <= 9 ; k++)
			{
				change(j,k);
			}
		}
		for (j = 1 ; j <= 9 ; j++)
		{
			for (k = 1 ; k <= 9 ; k++)
			{
				num[j][k] += newnum[j][k];
			}
		}
	}
	for (i = 1 ; i <= 9 ; i++)
	{
		for (j = 1 ; j <= 9 ; j++)
		{
			if (j == 1)
			{
				System.out.print(num[i][j]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(num[i][j]);
			}
		}
		System.out.print("\n");
	}
	return 0;
}
void change(int a, int b)
{
	int i;
	int j;
	for (i = a - 1 ; i <= a + 1 ; i++)
	{
		for (j = b - 1 ; j <= b + 1 ; j++)
		{
			newnum[a][b] += num[i][j];
		}
	}
}

