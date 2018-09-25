package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int age;
		int i;
		double p1;
		double p2;
		double p3;
		double p4;
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
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				count1++;
			}
			if (age > 18 && age < 36)
			{
				count2++;
			}
			if (age > 35 && age <= 60)
			{
				count3++;
			}
			if (age > 60)
			{
				count4++;
			}

		}
		p1 = 1.0 * 100 * count1 / n;
		p2 = 1.0 * 100 * count2 / n;
		p3 = 1.0 * 100 * count3 / n;
		p4 = 1.0 * 100 * count4 / n;

		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",p1,p2,p3,p4);

		return 0;
	}
}

