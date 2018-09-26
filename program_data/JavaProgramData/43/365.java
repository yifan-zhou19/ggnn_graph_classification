inline int single(int);
int main()
{
	int m;
	int a1;
	int a2;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (a1 = 2;a1 <= m / 2;a1++)
	{
		if (single(a1) == 2)
		{
			a2 = m - a1;
			if (single(a2) == 2)
			{
			System.out.print(a1);
			System.out.print(' ');
			System.out.print(a2);
			System.out.print("\n");
			}
		}
	}
  return 0;
}
inline int single(int x)
{
	int n = 0;
	int j;
	for (j = 1;j <= x;j++)
	{
		if (x % j == 0)
		{
		n = n + 1;
		}
	}
	return n;
}


