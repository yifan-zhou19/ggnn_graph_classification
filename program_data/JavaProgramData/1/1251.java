int t = new int(int, int);
int s;
int j;
int k1;

int main()
{
	int a;
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 1;
		k1 = 0;
		for (j = 2; j <= Math.sqrt((double) a); j++)
		{
			if (a % j == 0)
			{
				t(a / j, j);
			}
		}
		System.out.print(s);
		System.out.print("\n");
	}
	return 0;
}

int t(int a, int b)
{
	int k;
	for (k = b; k <= a; k++)
	{
		if (a % k == 0)
		{
			if (a / k == 1)
			{
				s = s + 1;
				break;
			}
			t(a / k, k);
		}
	}
	return 0;
}

