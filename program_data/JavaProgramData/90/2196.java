int K = new int(int,int,int);
int main()
{
	int t;
	int N;
	int M;
	int i;
	int s;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= t;i++)
	{
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N > M)
		{
			N = M;
		}
		s = K(M,N,0);
		System.out.print(s);
		System.out.print("\n");
	}
	return 0;
}
int K(int a,int b,int f)
{
	int k = 0;
	int j;
	if (b == 1)
	{
		return a >= f;
	}
	for (j = f;j < a;j++)
	{
		k += K(a - j,b - 1,j);
	}
	return (k);
}

