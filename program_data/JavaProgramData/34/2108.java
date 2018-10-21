int jg = int;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n != 1)
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(jg(n));
			System.out.print("\n");
		}
		if (n % 2 != 0)
		{
			System.out.print(n);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+");
			System.out.print(1);
			System.out.print("=");
			System.out.print(jg(n));
			System.out.print("\n");
		}
		n = jg(n);
	}
	System.out.print("End");

	return 0;
}

int jg(int x)
{
	if (x % 2 == 0)
	{
		return x / 2;
	}
	else
	{
	return 3 * x + 1;
	}
}

