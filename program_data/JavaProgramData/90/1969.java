void apple(int, int, int);
int sum;

int main()
{
	int t;
	int m;
	int n;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < t; i++)
	{
		sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple(0, m, n);
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}

void apple(int s, int x, int y)
{
	int i;
	if (y == 1)
	{
		sum++;
	}
	else
	{
		for (i = s; i <= x / y; i++)
		{
			apple(i, x - i, y - 1);
		}
	}
}


