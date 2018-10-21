int B = new int(int,int);
int main()
{
	int t;
	int m;
	int n;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < t;++i)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int j = 1;j <= n;++j)
		{
			sum += B(m,j);
		}
		System.out.print(sum);
		System.out.print('\n');
	}
	return 0;
}

int B(int n,int k)
{
	if (k == 1 || n == k)
	{
		return 1;
	}
	else
	{
		if (k > n)
		{
			return 0;
		}
		else
		{
			int result = 0;
			for (int l = k;l > 0;--l)
			{
				result += B(n - k,l);
			}
			return result;
		}
	}
}

