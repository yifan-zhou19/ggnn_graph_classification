int apple = new int(int,int);
int main()
{
	int t;
	int i;
	int m;
	int n;
	int a;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= t;i++)
	{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = apple(m,n);
			System.out.print(a);
			System.out.print("\n");
	}
	return 0;
}
int apple(int m,int n)
{
	int a;
	if (m == 1 || m == 0 || n == 1)
	{
		a = 1;
	}
	else
	{
			if (m >= n)
			{
		a = apple(m - n,n) + apple(m,n - 1);
			}
	if (m < n)
	{
		a = apple(m,n - 1);
	}
	}
	return a;
}

