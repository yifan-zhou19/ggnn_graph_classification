int counts = 1;
int ty = new int(int, int);
int main()
{
	int i;
	int m;
	int n;
	int c;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1 ; i <= m ; i++)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		counts = 1;
		c = ty(n, 2);
		System.out.print(c);
		System.out.print("\n");
	}
	return 0;
}

int ty(int n, int j)
{
	int i;
	int flag = 0;
	if (n == 1)
	{
		return 0;
	}
	if (n == 2)
	{
		return 1;
	}
	for (i = j ; i <= (int)Math.sqrt(n) ; i++)
	{
		if (n % i == 0)
		{
			counts++;
			ty(n / i, i);
		}
	}
	return counts;
}


