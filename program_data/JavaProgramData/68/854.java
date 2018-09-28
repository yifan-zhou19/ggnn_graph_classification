int prime = int;
int main()
{
	int n;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 6;i <= n;i = i + 2)
	{
		for (j = 3;j <= i / 2;j = j + 2)
		{
			if (prime(j) && prime(i - j))
			{
				System.out.print(i);
				System.out.print('=');
				System.out.print(j);
				System.out.print('+');
				System.out.print(i - j);
				System.out.print("\n");
				break;
			}
		}
	}
	return 0;
}
int prime(int k)
{
	int i;
	if (k == 3 || k == 5 || k == 7)
	{
		return 1;
	}
	else
	{
		for (i = 3;i <= Math.sqrt(k);i = i + 2)
		{
			if (k % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
}

