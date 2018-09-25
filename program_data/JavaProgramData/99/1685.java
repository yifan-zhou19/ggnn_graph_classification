package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
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
				(age[i]) = Integer.parseInt(tempVar2);
			}
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				a++;
			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			if (age[i] >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2f%%\n",1.0 * a / n * 100);
		System.out.printf("19-35: %.2f%%\n",1.0 * b / n * 100);
		System.out.printf("36-60: %.2f%%\n",1.0 * c / n * 100);
		System.out.printf("60??: %.2f%%\n",1.0 * d / n * 100);
		return 0;
	}

}

