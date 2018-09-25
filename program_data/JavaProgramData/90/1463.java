int f = new int(int, int);
int main()
{
	int t;
	int m;
	int n;
	int i;
	int sum;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < t; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = f(m, n);
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
int f(int m, int n)
{
	int sum;
	if (n <= 0 || m < 0)
	{
		return 0;
	}
	else if (m == 0)
	{
		return 1;
	}
	else if (n == 1 || m == 1)
	{
		return 1;
	}
	sum = f(m - n, n) + f(m, n - 1);
	return sum;
}

