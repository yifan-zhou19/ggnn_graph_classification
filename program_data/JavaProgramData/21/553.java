package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	double s = 0;
	double max = 0;
	double[] a = new double[100];
	double t;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	  a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  s += a[i];
	}
	s /= n;
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n - 1;j++)
	  {
		if (a[j] > a[j + 1])
		{
		   t = a[j];
		   a[j] = a[j + 1];
		   a[j + 1] = t;
		}
	  }
	}

	if (s - a[0] == a[n - 1] - s)
	{
	  System.out.print(a[0]);
	  System.out.print(',');
	  System.out.print(a[n - 1]);
	}
	else if (s - a[0] > a[n - 1] - s)
	{
	  System.out.print(a[0]);
	}
	else
	{
	  System.out.print(a[n - 1]);
	}

	return 0;
	}

}

