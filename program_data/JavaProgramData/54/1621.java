int k;
int n;
int i = 1;
long pg = int;
int main()
{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int a;
	while (true)
	{
		a = pg(1);
		if (a != 0)
		{
			System.out.print(a);
			System.out.print("\n");
			return 0;
		}
		i++;
	}
}
long pg(int m)
{
	if (m == n)
	{
		return n * i + k;
	}
	int p = pg(m + 1);
	if (p == 0 || p % (n - 1) != 0)
	{
		return 0;
	}
	else
	{
		return p * n / (n - 1) + k;
	}
}


