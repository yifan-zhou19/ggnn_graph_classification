int fbn = int;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i = 0;
	int[] a = new int[1000];
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		System.out.print(fbn(a[i]));
		System.out.print("\n");
	}
	return 0;
}
int fbn(int n)
{
	int c;
	if (n == 1 || n == 2)
	{
		c = 1;
	}
	else
	{
		c = fbn(n - 1) + fbn(n - 2);
	}
	return c;
}

