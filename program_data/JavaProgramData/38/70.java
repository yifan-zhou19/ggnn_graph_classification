double av = new double(int,double[]);
double sq = new double(int,double,double[]);
int main()
{
	int k;
	int i;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0;i < k;i++)
	{
		int n;
		double[] x = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int j;
		for (j = 0;j < n;j++)
		{
			x[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		System.out.printf("%.5f\n",sq(n,av(n,x),x));
	}

	return 0;
}
double av(int n,double x[])
{
	int i;
	double sum = 0.0;
	for (i = 0;i < n;i++)
	{
		sum = sum + x[i];
	}

	return sum / ((double)n);
}
double sq(int n,double av,double x[])
{
	int i;
	double sum = 0.0;

	for (i = 0;i < n;i++)
	{
		sum = sum + (av - x[i]) * (av - x[i]);
	}

	sum = sum / ((double)n);

	return Math.sqrt(sum);
}

