int put = new int(int, int);

int main()
{
	int t;
	int i;
	int m;
	int n;
	int k;

	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1; i <= t; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = put(m, n);
		System.out.print(k);
		System.out.print("\n");
	}

	return 0;
}

int put(int x, int y)
{
	if (x == 0 || y == 1)
	{
		 return 1;
	}
	else
	{
		if (x >= y)
		{
			return put(x, y - 1) + put(x - y, y);
		}
		if (x < y)
		{
			return put(x, y - 1);
		}
	}
}


