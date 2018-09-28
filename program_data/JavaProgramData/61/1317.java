int fac = int;

int main()
{
	int n;
	int y;
	int times;
	times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < times; i++)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = fac(n);
		System.out.print(y);
		System.out.print("\n");
	}

	return 0;
}

int fac(int n)
{
	if (n == 1 || n == 2)
	{
		return 1;
	}
	else
	{
		return fac(n - 1) + fac(n - 2);
	}
}

