package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int male = 0;
		int female = 0;
		char[][] sex = new char[41][10];
		float[] high = new float[41];
		float[] male_high = new float[41];
		float[] female_high = new float[41];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				high[i] = Float.parseFloat(tempVar3);
			}
		}
		for (int i = 1;i <= n;i++)
		{
			if (sex[i][0] == 'm')
			{
				male++;
				male_high[male] = high[i];
			}
			else
			{
				female++;
				female_high[female] = high[i];
			}
		}
		sort(male_high + 1,male_high + male+1);
		sort(female_high + 1,female_high + female+1);
		for (int i = 1;i <= male;i++)
		{
			System.out.printf("%.2f ",male_high[i]);
		}
		for (int i = female;i >= 2;i--)
		{
			System.out.printf("%.2f ",female_high[i]);
		}
		System.out.printf("%.2f\n",female_high[1]);
		return 0;
	}
}

