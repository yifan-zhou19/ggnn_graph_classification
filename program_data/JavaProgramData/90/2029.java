int ways = new int(int,int);
int main()
{
	int t;
	int m;
	int n;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (t-- != 0)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(ways(m,n));
		System.out.print("\n");
	}
	return 0;
}
int ways(int m,int n)
{
	int sum = 0;
	if (n == 1)
	{
		sum = 1;
	}
	else if (m < 0)
	{
		sum = 0;
	}
	else if (m == 0)
	{
		sum = 1;
	}
	else
	{
		sum = sum + ways(m,n - 1) + ways(m - n,n);
	}
	return sum;
}

