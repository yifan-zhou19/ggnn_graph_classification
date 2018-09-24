int f = int;

int main()
{
	int n;
	int i;
	int[] a = new int[21];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a[i]));
		System.out.print("\n");
	}
	return 0;
}

int f(int ah)
{
	if (ah == 1 || ah == 2)
	{
		return 1;
	}
	return f(ah - 1) + f(ah - 2);
}

