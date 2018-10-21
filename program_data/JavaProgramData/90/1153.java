int f = new int(int, int);

int main()
{
	int k;
	int m;
	int n;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1; i <= k; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(m, n));
		System.out.print("\n");
	}
	return 0;
}

int f(int m, int n)
{
	if (n == 1 || m == 1 || m == 0)
	{
		return 1;
	}
	if (m < 0)
	{
		return 0;
	}
	else
	{
		return (f(m, n - 1) + f(m - n, n));
	}
}


