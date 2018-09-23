int fenjie = new int(int, int);

int fenjie(int q1, int n1)
{
	int s1;
	int i1;
	if (q1 > n1)
	{
		return 0;
	}
	else
	{
		s1 = 0;
		for (i1 = q1; i1 <= n1; i1++)
		{
			if ((i1 >= 2) && (n1 % i1 == 0) && (n1 / i1 >= i1))
			{
				s1++;
				s1 = s1 + fenjie(i1, n1 / i1);
			}
		}
		return s1;
	}
}

int main()
{
	int m;
	int i;
	int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= m; i++)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fenjie(1,n) + 1);
		System.out.print("\n");
	}
	return 0;
}


