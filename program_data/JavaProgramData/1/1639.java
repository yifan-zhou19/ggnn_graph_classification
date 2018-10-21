int d = new int(int,int);
int main()
{
	int i;
	int n;
	int x;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(d(x,2));
		System.out.print("\n");
	}
	return 0;
}
int d(int x,int y)
{
	int j;
	int num = 1;
	if (x == 1)
	{
		return 0;
	}
	if (x == 2)
	{
		return 1;
	}
	for (j = y;j <= (int)Math.sqrt((double)x);j++)
	{
		if (x % j == 0)
		{
			num += d(x / j,j);
		}
	}
	return num;
}


