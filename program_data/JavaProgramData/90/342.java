int put = new int(int, int);
int main()
{
	int i;
	int t;
	int app;
	int plate;
	int sum;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < t; i++)
	{
		app = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = put(app, plate);
		System.out.print(sum);
		System.out.print("\n");
	}
	sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	return 0;
}

int put(int m, int n)
{
	int sum;
	if (n == 1 || m == 0)
	{
		return 1;
	}
	if (m >= n)
	{
		sum = put(m - n, n) + put(m, n - 1);
	}
	else
	{
		sum = put(m, n - 1);
	}
	return sum;
}

