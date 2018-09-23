int divide = new int(int,int);
int main()
{
	int n;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n != 0)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(divide(a,2));
		System.out.print("\n");
		n--;
	}
	return 0;
}

int divide(int x,int t)
{
	int i;
	int sum = 0;
	if (x == 1)
	{
		return 1; //????x?1
	}
	for (i = t;i <= x;i++)
	{
		if (x % i == 0)
		{
			sum += divide(x / i,i); //?i?x????x/i???????????????i?
		}
	}
	return sum;
}


