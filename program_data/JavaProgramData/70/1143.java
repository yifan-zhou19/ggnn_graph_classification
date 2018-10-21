package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	double[][] a = new double[1000][2];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	double max = 0;
	double temp;
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	temp = Math.pow(a[i][0] - a[j][0],2.0) + Math.pow(a[i][1] - a[j][1],2.0);
	temp = Math.sqrt(temp);
	if (temp > max)
	{
		max = temp;
	}
	}
	}
	System.out.printf("%.4f", max);
	System.out.printf("%.4f", "\n");
	return 0;
	}

}

