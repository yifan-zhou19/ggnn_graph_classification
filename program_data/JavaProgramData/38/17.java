package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double sum;
		double sum2;
		double input;
		int n;
		int k;
		int in;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (; k > 0; k--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = sum2 = 0;
			for (in = 0; in < n; in++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					input = Double.parseDouble(tempVar3);
				}
				sum += input;
				sum2 += input * input;
			}
			System.out.printf("%.5f\n", Math.sqrt((sum2 - sum * sum / n) / n));
		}

		return 0;
	}

}

