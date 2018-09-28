package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
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
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] >= 1 && age[i] <= 18)
			{
				count1++;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				count2++;
			}
			else if (age[i] >= 36 && age[i] <= 60)
			{
				count3++;
			}
			else
			{
				count4++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n", (((double)count1) / n) * 100,(((double)count2) / n) * 100, (((double)count3) / n) * 100,(((double)count4) / n) * 100);
		return 0;
	}
}

