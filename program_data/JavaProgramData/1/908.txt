int factor = new int(int,int);
int main()
{
	int n;
	int num;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(factor(num,2));
		System.out.print("\n");
	}
	return 0;
}
int factor(int n,int min)
{
	int i;
	int num = 1;
	if (n < min)
	{
		return 0;
	}
	else
	{
		for (i = min;i < n;i++)
		{
			if (n % i == 0)
			{
				num += factor(n / i,i);
			}
		}
	}
	return num;
}

