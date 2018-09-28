package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			int n;
			int i;
			double[] a = new double[100];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			double[] p = a;
			double s1 = 0;
			double s2 = 0;
			double s3;
			for (i = 0;i < n;i++)
			{
				s1 = s1 + p[i];
			}
			s1 = s1 / n;
			for (i = 0;i < n;i++)
			{
				s2 = Math.pow(p[i] - s1,2.0) + s2;
			}
			s2 = s2 / n;
			s3 = Math.sqrt(s2);
			System.out.printf("%.5f\n", s3);
			System.out.print('\n');
			k--;
		}
		return 0;
	}


}

