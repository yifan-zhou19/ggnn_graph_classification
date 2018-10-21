int c = new int(int, int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0 ; i < n ; i++)
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		sum = c(a,b);
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
int c(int a,int b)
{
	int sum = 0;
	if (a == 1 || a == 0 || b == 1 || b == 0)
	{
		return 1;
	}
	if (a >= b)
	{
		sum = c(a,b - 1) + c(a - b,b);
		return sum;
	}
	if (a < b)
	{
		sum = c(a,a);
		return sum;
	}
}


