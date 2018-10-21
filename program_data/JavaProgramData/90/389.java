int f = new int(int, int);
int main()
{
	int x;
	int m;
	int n;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1; i <= x; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(m, n));
		System.out.print("\n");
	}
	return 0;
}
int f(int a, int b)
{
	if (b == 1)
	{
		return 1;
	}
	else
	{
		if (a > b)
		{
			return (f(a, b - 1) + f(a - b, b));
		}
		else
		{
			if (a < b)
			{
				return f(a, a);
			}
			else
			{
				return (1 + f(a, b - 1));
			}
		}
	}
}


