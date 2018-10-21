int f = new int(int, int);
int f_n = new int(int, int);
int f_e = new int(int, int);

int f(int x, int y)
{
	if (x == 1)
	{
		return 1;
	}
	return f_e(x, y) + f_n(x, y);
}

int f_e(int x, int y)
{
	return f(x - 1, y);
}

int f_n(int x, int y)
{
	if (y < x)
	{
		return 0;
	}
	return f(x, y - x);
}

int main()
{
	int n;
	int x;
	int y;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < n; i++)
	{
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, y));
		System.out.print("\n");
	}
	return 0;
}


