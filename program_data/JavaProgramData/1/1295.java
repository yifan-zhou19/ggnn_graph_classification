int f = new int(int, int);
int main()
{
	int x;
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, 2));
		System.out.print("\n");
	}

	return 0;
}


int f(int x, int i)
{
	int ans = 0;
	if (x == 2)
	{
		return 1;
	}
	else
	{
		for (; i <= Math.sqrt(x); i++)
		{
			if (x % i == 0)
			{
				ans = ans + f(x / i, i);
			}
		}
		return ans + 1;
	}
}




