package <missing>;

public class GlobalMembers
{
	public static double[] nums = new double[100];

	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		int i;
		for (i = 0; i < k; i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			double sum = 0.0;
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					nums + j = tempVar3;
				}
				sum += nums[j];
			}

			double avg = sum / n;
			double s = 0;
			for (j = 0; j < n; j++)
			{
				double num = nums[j];
				s += (num - avg) * (num - avg);
			}
			s /= n;
			s = Math.sqrt(s);

			System.out.printf("%.5lf\n", s);
		}
	}
}

