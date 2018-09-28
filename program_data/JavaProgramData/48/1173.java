int m;
int num = new int(int, int, int);
int main()
{
	int n;
	int i;
	int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1 ; i < 10 ; i++)
	{
		for (j = 1 ; j < 9 ; j++)
		{
			System.out.print(num(n, i, j));
			System.out.print(" ");
		}
		System.out.print(num(n, i, 9));
		System.out.print("\n");
	}
	return 0;
}
int num(int a, int x, int y)
{
	if (a == 0)
	{
		if (x == 5 && y == 5)
		{
			return m;
		}
		else
		{
			return 0;
		}
	}
	else
	{
		return num(a - 1, x, y) * 2 + num(a - 1, x - 1, y - 1) + num(a - 1, x - 1, y) + num(a - 1, x - 1, y + 1) + num(a - 1, x, y - 1) + num(a - 1, x, y + 1) + num(a - 1, x + 1, y - 1) + num(a - 1, x + 1, y) + num(a - 1, x + 1, y + 1);
	}
}

