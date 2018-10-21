void check(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	check(n);
	return 0;
}
void check(int n)
{

	if (n == 1)
	{
		System.out.print("End");
	}
	else if (n % 2 == 0)
	{
		System.out.print(n);
		System.out.print("/2=");
		n = n / 2;
		System.out.print(n);
		System.out.print("\n");
		check(n);
	}
	else if ((n % 2 == 1) && (n != 1))
	{
		System.out.print(n);
		System.out.print("*3+1=");
		n = n * 3 + 1;
		System.out.print(n);
		System.out.print("\n");
		check(n);
	}
}

