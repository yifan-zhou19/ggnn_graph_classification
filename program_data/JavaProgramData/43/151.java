int check = int;
int main()
{
	int n;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 2; i < n; i++)
	{
		if ((i % 2 != 0) && (check(i)))
		{
			for (j = i; j < n; j++)
			{
				if ((j % 2 != 0) && (check(j)))
				{
					if (i + j == n)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
			}
		}
	}
	return 0;
}
int check(int m)
{
	if (m == 2)
	{
		return 1;
	}
	int i;
	int j;
	j = Math.sqrt(m);
	for (i = 2; i <= j; i++)
	{
		if (m % i == 0)
		{
			break;
		}
	}
	if (i == j + 1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

