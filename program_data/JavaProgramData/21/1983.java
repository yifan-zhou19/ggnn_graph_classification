package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double sum;
	  int[] a = new int[300];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  sum = 0;
	  for (i = 0;i < n;i++)
	  {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum += a[i];
	  }
	  double junzhi = sum / n;
	  double[] b = new double[300];
	  double max = 0;
	  for (i = 0;i < n;i++)
	  {
		if (a[i] < junzhi)
		{
		  b[i] = junzhi - a[i];
		}
		else
		{
		  b[i] = a[i] - junzhi;
		}
		if (b[i] > max)
		{
			max = b[i];
		}
	  }
	  int[] c = new int[300];
	  int m = -1;
	  for (i = 0;i < n;i++)
	  {
		if (max == b[i])
		{
		  m++;
		  c[m] = a[i];
		}
	  }
	  m++;
	  int j;
	  for (i = 0;i < m;i++)
	  {
		  for (j = i + 1;j < m;j++)
		  {
			  if (c[i] > c[j])
			  {
				  sum = c[i];
				  c[i] = c[j];
				  c[j] = sum;
			  }
		  }
	  }
	  System.out.print(c[0]);
	  for (i = 1;i < m;i++)
	  {
		  System.out.print(',');
		  System.out.print(c[i]);
	  }
	  return 0;
	}
}

