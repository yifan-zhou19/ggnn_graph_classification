package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int a;
		int suma = 0;
		int sumb = 0;
		int sumc = 0;
		int sumd = 0;
		int sum = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
			 suma++;
			}
			else if (a >= 19 && a <= 35)
			{
				sumb++;
			}
			else if (a >= 36 && a <= 60)
			{
				sumc++;
			}
			else if (a > 60)
			{
				sumd++;
			}
			sum++;
		}

		System.out.printf("1-18: %.2lf%%\n",100.0 * suma / sum);
		System.out.printf("19-35: %.2lf%%\n",100.0 * sumb / sum);
		System.out.printf("36-60: %.2lf%%\n",100.0 * sumc / sum);
		System.out.printf("60??: %.2lf%%",100.0 * sumd / sum);
	return 0;
	}

}

