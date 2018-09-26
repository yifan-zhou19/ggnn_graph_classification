double n;
double k;
int times = 1;
double apple = new double(double,double,double);
int main()
{
	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	for (times = 1; ;times++)
	{
		if ((int)apple(n,k,n) == apple(n,k,n))
		{
			System.out.print((int)apple(n,k,n));
			System.out.print("\n");
			break;
		}
	}
	return 0;
}
double apple(double i, double j, double t)
{
	if (t == 1)
	{
		return times * n + k;
	}
	else
	{
		return (n / (n - 1)) * apple(i,j,--t) + k;
	}
}

