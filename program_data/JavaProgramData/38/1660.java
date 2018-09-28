package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int cycle;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (cycle = 0;cycle < k;cycle++)
		{
			int n;
			int i;
			double a = 0;
			double s = 0;
			double[] x = new double[1000];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i] = Double.parseDouble(tempVar);
				}
				a += x[i];
			}
			a = a / n;
			for (i = 0;i < n;i++)
			{
				s += Math.abs(x[i] - a) * Math.abs(x[i] - a);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f\n", s);

		}


		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

