package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] age = new int[num];
		int n;
		int i;
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

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 1 && age[i] <= 18)
			{
				a++;
			}
		else if (age[i] >= 19 & age[i] <= 35)
		{
			b++;
		}
		else if (age[i] >= 36 & age[i] <= 60)
		{
			c++;
		}
		else
		{
			d++;
		}
		}
			   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",a / n * 100,b / n * 100,c / n * 100,d / n * 100);
		return 0;
	}




}

