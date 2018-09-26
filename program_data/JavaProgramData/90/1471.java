int ways = new int(int,int);
int main()
{
	int m;
	int n;
	int k;
	int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (t-- != 0)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = ways(m,n);
		System.out.print(k);
		System.out.print("\n");
	}
	return 0;
}
int ways(int a,int b)
{
	if ((a == 0) || (b == 1))
	{
		return 1;
	}
	if ((a < 0) || (b <= 0))
	{
		return 0;
	}
	return (ways(a - b,b) + ways(a,b - 1));
}

