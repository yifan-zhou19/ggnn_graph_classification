package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int x;
		double[] a = new double[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double y;
		double z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			y = z = 0;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < x;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			p = a;
			for (j = 0;j < x;j++)
			{
				y += *(p + j);
			}
			y = y / x;
			for (j = 0;j < x;j++)
			{
				z += Math.pow(*(p + j) - y,2);
			}
			z = Math.sqrt(z / x);
			System.out.printf("%.5lf\n",z);
		}
		return 0;
	}
}

