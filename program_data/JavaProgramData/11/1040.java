int leap = int;
int main()
{
	int y;
	int month;
	int d;
	int sum = 0;
	int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m[2] = m[2] + leap(y);
	for (int i = 0;i < month;i++)
	{
		sum = sum + m[i];
	}
	sum = sum + d;
	System.out.print(sum);
	System.out.print("\n");
	return 0;
}
int leap(int n)
{
	if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

