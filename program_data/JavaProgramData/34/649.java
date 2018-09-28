void check(int);
int main()
{
	int i;
	int p;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	check(n);
	System.out.print("End");
	System.out.print("\n");
	return 0;
}
void check(int n)
{
	if (n == 1)
	{
		return;
	}
	else
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(n / 2);
			System.out.print("\n");
			n /= 2;
		}
		else
		{
			System.out.print(n);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+");
			System.out.print(1);
			System.out.print("=");
			System.out.print(3 * n + 1);
			System.out.print("\n");
			n = 3 * n + 1;
		}
		check(n);
	}
}



