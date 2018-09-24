int f = new int(int,int);
int main()
{
	int n;
	int[] a = new int[32768];
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i <= n - 1;i++)
	{
		System.out.print(f(a[i],2) + 1);
		System.out.print("\n");
	}
	return 0;
}
int f(int a,int p)
{
	int i;
	int sum = 0;
	for (i = 2;i <= Math.sqrt(a);i++)
	{
		if (((double)a / i == a / i) && (i >= p))
		{
			p = i;
			sum = sum + 1 + f(a / i,p);
		}
	}
	return sum;
}


