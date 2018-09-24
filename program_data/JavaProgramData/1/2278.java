int f = new int(int,int);
int main()
{
	int N;
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	for (i = 1;i <= N;i++)
	{

		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a,2));
		System.out.print("\n");
	}
	return 0;
}
int f(int n,int m)
{
	int j;
	int number = 1;
	for (j = m;j <= (int)Math.sqrt(n);j++)
	{
		if (n % j == 0)
		{
			number = number + f(n / j,j);
		}
	}
	return number;
}


