package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int h;
		int i;
		int j = 0;
			 double[] b = new double[100];
		double a;
		double s;
		double sum;
		double[] c = new double[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = k;
		while (k != 0)
		{
			a = 0;
			sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				a += b[i];
			}
			a = a / n;
			for (i = 0;i < n;i++)
			{
				sum += (b[i] - a) * (b[i] - a);
			}
			sum /= n;
			c[j] = Math.sqrt(sum);
			j++;
			k--;
		}
		for (i = 0;i < h;i++)
		{
			System.out.printf("%.5f\n",c[i]);
		}
		return 0;
	}


}

