int ans;

void dfs(int, int);

int main()
{
	int n;
	int num;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans = 0;
		dfs(num, 2);
		System.out.print(ans);
		System.out.print("\n");
	}
	return 0;
}

void dfs(int x, int f)
{
	if (x == 1)
	{
		++ans;
		return;
	}
	for (int i = f; i <= x; ++i)
	{
		if (x % i == 0)
		{
			dfs(x / i, i);
		}
	}
	return;
}

