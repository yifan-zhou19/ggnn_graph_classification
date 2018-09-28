package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] age = new int[100];
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double age18;
		double age35;
		double age60;
		double ageabove;
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
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 1 && age[i] <= 18)
			{
				a++;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			else if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		age18 = (double)a / n * 100;
		age35 = (double)b / n * 100;
		age60 = (double)c / n * 100;
		ageabove = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",age18);
		System.out.printf("19-35: %.2lf%%\n",age35);
		System.out.printf("36-60: %.2lf%%\n",age60);
		System.out.printf("60??: %.2lf%%\n",ageabove);
		return 0;
	}

}

