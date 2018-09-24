int fab = int;

int main()
{
	int n;
	int a;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fab(a));
		System.out.print("\n");
	}
	return 0;
}

int fab(int a)
{
	if (a == 1)
	{
		return 1;
	}
	else if (a == 2)
	{
		return 1;
	}
	else
	{
		return fab(a - 1) + fab(a - 2);
	}
}

