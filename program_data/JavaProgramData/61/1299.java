//1200012979
int look = int;
int main()
{
	int n;
	int a;
	int count = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (count < n)
	{
		count++;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(look(a));
		System.out.print("\n");
	}
	return 0;
}

int look(int a)
{
	if (a < 3)
	{
		return 1;
	}
	else
	{
	return look(a - 1) + look(a - 2);
	}
}

