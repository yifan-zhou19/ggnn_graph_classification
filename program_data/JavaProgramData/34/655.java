void ji(int);
void ou(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 2 == 0)
	{
		ou(n);
	}
	if (n % 2 != 0)
	{
		ji(n);
	}
	return 0;
}
void ji(int n)
{
	if (n == 1)
	{
		System.out.print("End");
	}
	if (n != 1)
	{
		int x;
		x = n * 3 + 1;
		System.out.print(n);
		System.out.print("*");
		System.out.print(3);
		System.out.print("+");
		System.out.print(1);
		System.out.print("=");
		System.out.print(x);
		System.out.print("\n");
		ou(x);
	}
}
void ou(int n)
{
	int y;
	y = n / 2;
	System.out.print(n);
	System.out.print("/");
	System.out.print(2);
	System.out.print("=");
	System.out.print(y);
	System.out.print("\n");
	if (y % 2 == 0)
	{
		ou(y);
	}
	if (y % 2 != 0)
	{
		ji(y);
	}
}

