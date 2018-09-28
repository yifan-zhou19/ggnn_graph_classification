package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] score = new int[100];
		int i;
		double d18 = 0;
		double d35 = 0;
		double d60 = 0;
		double up = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				score[i] = Integer.parseInt(tempVar2);
			}
			if (score[i] > 60)
			{
				up++;
			}
			else if (score[i] <= 60 && score[i] >= 36)
			{
				d60++;
			}
			else if (score[i] <= 35 && score[i] >= 19)
			{
				d35++;
			}
			else if (score[i] <= 18)
			{
				d18++;
			}

		}

		System.out.printf("1-18: %.2f%%\n",(double)d18 / n * 100);
		System.out.printf("19-35: %.2f%%\n",(double)d35 / n * 100);
		System.out.printf("36-60: %.2f%%\n",(double)d60 / n * 100);
		System.out.printf("60??: %.2f%%\n",(double)up / n * 100);


		return 0;
	}

}

