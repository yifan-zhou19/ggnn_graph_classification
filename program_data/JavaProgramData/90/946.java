//****************************************
//*?????                    **
//*??? 1100012927              **
//*2011.11.21                     **
//****************************************
int f = new int(int, int);
int g = new int(int, int);
int sum2 = 0;
int main()
{
	int t;
	int M;
	int N;
	int i;
	int sum;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < t; i++)
	{
		sum = 0;
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum += f(M, N);
		System.out.print(sum);
		System.out.print("\n");
	}

	return 0;
}

int f(int M, int N)
{
	if (M < 0)
	{
		return 0;
	}
	else if (M == 1 || N == 1 || M == 0)
	{
		return 1;
	}
	else
	{
		return (f(M, N - 1) + f(M - N, N));
	}
}


