int fibo = new int(int, int, int);

int main()
{
	int n;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1; i <= n; i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fibo(a, 1, 1));
		System.out.print("\n");
	}
	return 0;
}

int fibo(int a, int b, int e)
{
	if (a <= 2)
	{
		return e;
	}
	else
	{
		fibo(a - 1, e, b + e);
	}
}


