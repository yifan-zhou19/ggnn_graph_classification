void apple(int, int);
int n;
int k;
int m;
int f = 0;

int main()
{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (true)
	{
		apple(m, n);
		if (f == 1)
		{
			break;
		}
		m++;
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	return 0;
}

void apple(int h, int p)
{
	if (p == 1)
	{
		if ((h - k) / n <= 0)
		{
			return;
		}
		else
		{
			if ((h - k) % n == 0)
			{
				System.out.print(m);
				System.out.print("\n");
				f = 1;
			}
			else
			{
				return;
			}
		}
	}
	if ((h - k) % n == 0)
	{
		apple(h - k - ((h - k) / n), p - 1);
	}
	else
	{
		return;
	}
}

