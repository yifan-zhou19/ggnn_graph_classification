double Variance = new double(double [],int);
int main()
{
	int n;
	int i;
	int j;
	int m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] X = new double[105];
		for (j = 0;j < m;j++)
		{
			X[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.printf("%.5f", Variance(X,m));
		System.out.printf("%.5f", "\n");
	}
	return 0;
}
double Variance(double X[105], int n)
{
	int i;
	double sum = 0;
	double V = 0;
	for (i = 0;i < n;i++)
	{
	   sum += X[i];
	}
	sum = sum / n;
	for (i = 0;i < n;i++)
	{
		V += Math.pow(X[i] - sum,2);
	}
	return Math.sqrt(V / n);
}


