package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] x = new double[n];
			int i;

			double avg = 0;
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x + i = tempVar3;
				}
				avg += x[i];
			}
			avg /= n;

			double s = 0;
			for (i = 0; i < n; i++)
			{
				s += (x[i] - avg) * (x[i] - avg);
			}
			s /= n;
			s = Math.sqrt(s);

			System.out.printf("%.5f\n", s);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(x);
		}
		return 0;
	}

}

