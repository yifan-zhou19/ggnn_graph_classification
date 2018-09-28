package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int amount = 0;
		int i;
		double[] age = new double[max];
		double sum = 0;
		int year = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			amount = Integer.parseInt(tempVar);
		}

		for (i = 0; i < max; i++)
		{
			age[i] = 0;
		}

		for (i = 0; i < amount; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}

			if (year <= 18)
			{
				age[0]++;
			}
			else if (year <= 35 && year >= 19)
			{
				age[1]++;
			}
			else if (year <= 60 && year >= 36)
			{
				age[2]++;
			}
			else
			{
				age[3]++;
			}
		}

		for (i = 0; i < max; i++)
		{
			sum += age[i];
		}
		for (i = 0; i < max; i++)
		{
			age[i] = age[i] / sum * 100;
		}
		System.out.printf("1-18: %.2lf%%\n", age[0]);
		System.out.printf("19-35: %.2lf%%\n", age[1]);
		System.out.printf("36-60: %.2lf%%\n", age[2]);
		System.out.printf("60??: %.2lf%%\n", age[3]);

	}
}

