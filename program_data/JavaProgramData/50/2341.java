int date = int;
int main()
{
	int w;
	int W;
	w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (w <= 5)
	{
		W = 5 - w;
	}
	else
	{
		W = 12 - w;
	}
	for (int j = 1; j <= 12; j++)
	{
		if (date(j) % 7 == W)
		{
			System.out.print(j);
			System.out.print("\n");
		}
	}
	return 0;
}
int date(int cf)
{
	int sum;
	int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if (cf == 1)
	{
		sum = 12;
	}
	else
	{
		sum = 43;
		for (int i = 2; i < cf; i++)
		{
			sum = sum + month[i];
		}
	}
	return sum;
}

