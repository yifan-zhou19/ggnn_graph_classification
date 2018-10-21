int fp = new int(int, int);
void fj(int, int, int);
int k = 0;
int p = 0;

int main()
{
	int t;
	int m;
	int n;
	int i;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= t; i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = fp(m, n);
		System.out.print(k);
		System.out.print("\n");
		p = 0;
	}
	return 0;
}

int fp(int ap, int pl)
{
	if (pl == 1)
	{
		return 1;
	}
	else
	{
		if (ap < pl)
		{
			k = fp(ap, ap);
		}
		if (ap == pl)
		{
			k = ap + fp(ap, pl - 1);
		}
		if (ap > pl)
		{
			fj(ap, pl, 1);
			k = fp(ap, pl - 1) + p;
			p = 0;
		}
	}
}

void fj(int a, int b, int j0)
{
	int j;
	if (b == 1)
	{
		p++;
	}
	else
	{
		for (j = j0; j <= a / b; j++)
		{
			fj(a - j, b - 1, j);
		}
	}
}



