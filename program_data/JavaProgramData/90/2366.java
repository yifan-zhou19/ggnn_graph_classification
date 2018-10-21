int times = new int(int,int);
int main()
{
	int n;
	int i;
	int m;
	int N;
	int c;
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= N ; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = times(m, n);
		System.out.print(c);
		System.out.print("\n");
	}
	return 0;
}
int times(int x, int y)
{
	int time;
	if (x <= y)
	{
		y = x;
	}
	if (x == 1)
	{
		return 1;
	}
	if (y == 1)
	{
		return 1;
	}
	if (x == 0)
	{
		return 1;
	}
	if (true)
	{
		time = times(x, y - 1) + times(x - y, y);
		return time;
	}
}


