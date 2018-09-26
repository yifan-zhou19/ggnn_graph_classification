int K = 0;
void Try(int,int);
void Try(int X,int Y)
{
	if (X == 0)
	{
		K++;
	}
	else if (Y == 1)
	{
		K++;
	}
	else if (X >= Y)
	{
		Try(X,Y - 1);
		Try(X - Y,Y);
	}
	else
	{
		Try(X,Y - 1);
	}
}
int main()
{
	int t;
	int i;
	int M;
	int N;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= t;i++)
	{
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Try(M,N);
		System.out.print(K);
		System.out.print("\n");
		K = 0;
	}
	return 0;
}

