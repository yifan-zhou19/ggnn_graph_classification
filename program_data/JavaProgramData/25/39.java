void add(int []);
int main()
{
	int n;
	int[] a = new int[100];
	int i;
	int j;
	a[0] = 1;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		add(a);
	}
	i = 99;
	while (a[i] == 0)
	{
		i--;
	}
	for (j = i; j >= 0; j--)
	{
		System.out.print(a[j]);
	}
	System.out.print("\n");
	return 0;
}
void add(int a[])
{
	int i = 99;
	int j;
	while (a[i] != 0)
	{
		i--;
	}
	for (j = i; j >= 0; j--)
	{
		a[j] = 2 * a[j];
		if (a[j] >= 10)
		{
			a[j + 1]++;
			a[j] -= 10;
		}
	}
}

