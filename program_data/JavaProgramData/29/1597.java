package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m = 1.0;
		double w = 2.0;
		double k = 0.0;
		double h;
		double sum = 0;
		double n;
		int[] a = new int[100];
		int i;
		int j;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			  h = a[i];
			  for (j = 1;j <= h;j++)
			  {
				 sum += w / m;
				 k = m;
				 m = w;
				 w = k + w;
			  }
			  System.out.printf("%.3f", sum);
			  System.out.printf("%.3f", "\n");
			  sum = 0,m = 1.0,w = 2.0,k = 0.0;
		}
		return 0;
	}
}

