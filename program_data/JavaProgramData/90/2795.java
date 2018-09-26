int f = new int(int, int);

int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	while (n-- != 0)
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		System.out.print(f(m, n));
		System.out.print("\n");
	}

	return 0;
}

int f(int m, int n)
{
	if (m == 1 || n == 1 || m == 0)
	{
		return 1;
	}

	if (m < 0)
	{
		return 0;
	}

	return f(m - n, n) + f(m, n - 1);
}

