int reverse = int;
int re = int;
int main()
{
	int n;
	int i;
	for (i = 1;i <= 6;i++)
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = reverse(n);
	System.out.print(n);
	System.out.print("\n");
	}
	return 0;
}
int reverse(int n)
{
	int i;
	int j;
	int k = 0;
	int sum = 0;
	while (n != 0)
	{
		if (((n % 10) == 0) && (k = 0) != 0)
		{
			n = n / 10;
		}
		else
		{
			sum = sum * 10;
			sum = sum + (n % 10);
			n = n / 10;
			k = 1;
		}
	}
	return sum;
}

