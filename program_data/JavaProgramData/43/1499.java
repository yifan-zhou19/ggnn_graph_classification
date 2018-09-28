int sushu = int;
int main()
{
	int m;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 2;i <= m / 2;i++)
	{
		if (sushu(i) && sushu(m - i))
		{
		System.out.print(i);
		System.out.print(" ");
		System.out.print(m - i);
		System.out.print("\n");
		}
	}

	return 0;
}
int sushu(int n)
{
	int j;
	for (j = 2;j <= Math.sqrt(n);j++)
	{
		if (n % j == 0)
		{
		return 0;
		break;
		}
	}
	if (j == (int)Math.sqrt(n) + 1)
	{
	return 1;
	}
}


