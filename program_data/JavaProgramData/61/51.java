int f = int;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < n; i++)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a));
		System.out.print("\n");
	}
}
int f(int x)
{
	if (x == 1)
	{
		return 1;
	}
	if (x == 2)
	{
		return 1;
	}
	return f(x - 1) + f(x - 2);
}

