package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] age = new int[100];
		int[] std = new int[4];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] < 19)
			{
				std[0]++;
			}
			else if (age[i] > 18 && age[i] < 36)
			{
				std[1]++;
			}
			else if (age[i] > 35 && age[i] < 61)
			{
				std[2]++;
			}
			else if (age[i] > 60)
			{
				std[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			if (i == 0)
			{
				System.out.printf("1-18: %.2lf%%\n", 0.1f * std[i] / n * 1000);
			}
			if (i == 1)
			{
				System.out.printf("19-35: %.2lf%%\n", 0.1f * std[i] / n * 1000);
			}
			if (i == 2)
			{
				System.out.printf("36-60: %.2lf%%\n", 0.1f * std[i] / n * 1000);
			}
			if (i == 3)
			{
				System.out.printf("60??: %.2lf%%\n", 0.1f * std[i] / n * 1000);
			}
		}
		return 0;
	}
}

