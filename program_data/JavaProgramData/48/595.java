//****************************************
//*???????????               **
//*????? 1100012873                **
//*???2011.11.23                     **
//****************************************
int[][] s = new int[11][11];
void ct(int, int);
int main()
{
	int a;
	int b;
	int p;
	int q;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	ct(a, b);
	for (p = 1;p < 10;p++)
	{
		for (q = 1;q < 10;q++) //????????????
		{
			if (q == 1)
			{
				System.out.print(s[p][q]);
			}
			else if (q == 9)
			{
				System.out.print(' ');
				System.out.print(s[p][q]);
				System.out.print("\n");
			}
			else if (q >= 0 && q <= 9)
			{
				System.out.print(' ');
				System.out.print(s[p][q]);
			}
		}
	}
	return 0;
}
void ct(int m, int n)
{
	int i;
	int j;
	int[][] z = new int[11][11];
	if (n == 0)
	{
		s[5][5] = m; //?????????????
	}
	else
	{
		ct(m, n - 1);
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				z[i][j] = 2 * s[i][j] + s[i - 1][j] + s[i + 1][j] + s[i][j + 1] + s[i][j - 1] + s[i + 1][j + 1] + s[i - 1][j - 1] + s[i + 1][j - 1] + s[i - 1][j + 1];
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				s[i][j] = z[i][j]; //z??????????????
			}
		}
	}
}


