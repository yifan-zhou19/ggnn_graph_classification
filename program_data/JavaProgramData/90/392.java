int f = new int(int, int);
int main()
{
	int a;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (a-- != 0)
	{
		int i = 0;
		int m;
		int n;
		int sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = sum + f(m,i);
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
int f(int n,int k)
{
	int j = 0;
	int r;
	if (k == 1 || n == k)
	{
		return 1;
	}
	else
	{
		if (n < k)
		{
			return 0;
		}
		else
		{
			r = 0;
			for (j = 1;j <= k;j++)
			{
				r = r + f(n - k,j);
			}
			return r;
		}
	}
}


