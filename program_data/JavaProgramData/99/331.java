package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] age = new int[100];
		int i;
		int[] team = new int[4];
		double[] per = new double[4];
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
			if (age[i] < 19)
			{
				team[0]++;
			}
			else if (age[i] > 18 && age[i] < 36)
			{
				team[1]++;
			}
			else if (age[i] > 35 && age[i] < 61)
			{
				team[2]++;
			}
			else if (age[i] > 59)
			{
				team[3]++;
			}
		}
		per[0] = (double)team[0] / n * 100;
		per[1] = (double)team[1] / n * 100;
		per[2] = (double)team[2] / n * 100;
		per[3] = (double)team[3] / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",per[0],per[1],per[2],per[3]);



	}

}

