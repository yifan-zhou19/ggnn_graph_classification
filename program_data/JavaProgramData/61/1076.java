int f = int;

int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	while (n-- != 0)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a));
		System.out.print("\n");
	}

	return 0;
}

int f(int x)
{
	if (x == 1 || x == 2)
	{
		return 1;
	}

	return f(x - 1) + f(x - 2);
}

