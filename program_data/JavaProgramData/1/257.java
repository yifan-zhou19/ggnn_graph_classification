int sort = new int(int, int, int);

int main()
{
	int t = 0;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int k = 1;
	for (k = 1;k <= t;k++)
	{
	int vacancy = 0;
	int num = 1;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i = 1;
	int temp = num;
	for (i = 2;i <= temp;i++)
	{
		while (temp % i == 0)
		{
			vacancy = vacancy + 1;
			temp = temp / i;

		}

	}
	System.out.print(sort(1,vacancy,num));
	System.out.print("\n");

	}
		return 0;
}

int sort(int start, int vacancy, int num)
{
	if (num < start)
	{
		return 0;
	}

	if (vacancy == 1)
	{
		return 1;
	}

	int sum = 0;
	int i = 1;
	for (i = start;i <= num;i++)
	{
		if (num % i == 0)
		{
			sum = sum + sort(i,vacancy - 1,num / i);
		}
	}


	return sum;
}

