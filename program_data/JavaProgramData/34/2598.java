int jiaogu = int;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n != 1)
	{
	n = jiaogu(n);
	}
	System.out.print("End");
	return 0;
}
int jiaogu(int n)
{
	if ((n % 2 == 1) && (n != 1))
	{
		System.out.print(n);
		n = n * 3 + 1;
		System.out.print("*3+1=");
		System.out.print(n);
		System.out.print("\n");
		return n;
	}
	else
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			n = n / 2;
			System.out.print("/2=");
			System.out.print(n);
			System.out.print("\n");
			return n;
		}
		else
		{
			return n;
		}
	}
}

