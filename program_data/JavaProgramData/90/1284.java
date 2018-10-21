int solve = new int(int,int);
int main()
{
	int i;
	int j;
	int k;
	int t;
	int m;
	int n;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < t;++i)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(solve(m,n));
		System.out.print("\n");
	}
	return 0;
}
int solve(int m,int n)
{
	if (m == 0 || n == 1)
	{
		return 1;
	}
	else if (m < n)
	{
		return solve(m,m);
	}
	else
	{
		return (solve(m,n - 1) + solve(m - n,n));
	}
}


