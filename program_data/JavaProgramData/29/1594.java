package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double m;
	double i = 0;
	double j;
	double a;
	double b;
	double temp;
	double sum = 2;
	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	while (i < n)
	{
	m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	a = 2;
	b = 1;
	for (j = 1;j < m;j++)
	{
	temp = a;
	a = a + b;
	b = temp;
	sum += a / b;
	}
	System.out.printf("%.3f\n",sum);
	sum = 2;
	i++;
	}
	}
}

