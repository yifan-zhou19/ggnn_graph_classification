char[][][] pain = new char[101][102][102];
void trans(int,int,int);
int main()
{
	int n;
	int i;
	int j;
	int t;
	int day;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			pain[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
	}
	day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (t = 2;t <= day;t++)
	{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				pain[t][i][j] = pain[t - 1][i][j];
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (pain[t - 1][i][j] == '@')
				{
					trans(t,i - 1,j);
					trans(t,i + 1,j);
					trans(t,i,j - 1);
					trans(t,i,j + 1);
				}
			}
		}
	}
	int count = 0;
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (pain[day][i][j] == '@')
			{
				count++;
			}
		}
	}
	System.out.print(count);
	System.out.print("\n");
	return 0;
}

void trans(int t,int i,int j)
{
	if (pain[t - 1][i][j] == '.')
	{
		pain[t][i][j] = '@';
	}
}

