package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		int[] age = new int[100];
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
			if (age[i] <= 18)
			{
				a++;
			}
			else if (age[i] <= 35)
			{
				b++;
			}
			else if (age[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2f%%\n",a / n * 100);
		System.out.printf("19-35: %.2f%%\n",b / n * 100);
		System.out.printf("36-60: %.2f%%\n",c / n * 100);
		System.out.printf("60??: %.2f%%\n",d / n * 100);


	}


}

