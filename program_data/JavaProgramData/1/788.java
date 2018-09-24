int Factorization = new int(int,int);
int main()
{
	int n;
	int x;
	int i;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(Factorization(x,2) + 1);
		   System.out.print("\n");
	}
	return 0;
}
int Factorization(int x,int y)
{
	int i;
	int sum = 0;
	if (x < 4)
	{
		return 0;
	}
	else
	{
			for (i = y;i <= Math.sqrt((double)x);i++)
			{
				if (x % i == 0)
				{
					sum += 1 + Factorization(x / i,i);
				}
			}
			return sum;
	}
}


