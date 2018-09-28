package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int temp;
	int k;
	double[] a = new double[301];
	double[] c = new double[301];
	double mid;
	double max = 0;
	double sum = 0;
	double n;
	double[] result = new double[301];

	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

	for (i = 1;i <= n;i++)
	{
		a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		sum += a[i];
		c[i] = 0;
	}

	mid = sum / n;


	for (i = 1;i <= n;i++)
	{
		if (a[i] >= mid)
		{
			result[i] = a[i] - mid;
		}
		else
		{
			result[i] = mid - a[i];
		}

	}

	for (i = 1;i <= n;i++)
	{
		if (result[i] > max)
		{
			max = result[i];
		}
	}

	for (i = 1,j = 1;i <= n;i++)
	{
		if (result[i] == max)
		{
			c[j] = a[i];
			j++;
		}
	}

	for (i = 1;i < j;i++)
	{
	   for (k = 1;k < j - i;k++)
	   {
		   if (c[k] > c[k + 1])
		   {
			   temp = c[k];
			   c[k] = c[k + 1];
			   c[k + 1] = temp;
		   }
	   }
	}

	   for (i = 1;i < j;i++)
	   {
		   System.out.print(c[i]);
		   if (i != j - 1)
		   {
			   System.out.print(",");
		   }
	   }
	return 0;
	}
}

