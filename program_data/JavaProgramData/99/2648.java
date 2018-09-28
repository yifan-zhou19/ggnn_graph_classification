package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double result;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] <= 18)
			{
				a += 1;
			}
			else if (age[i] <= 35)
			{
				b += 1;
			}
			else if (age[i] <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		result = a * 1.0 / n * 100;
		System.out.printf("1-18: %.2f%%\n",result);
		result = b * 1.0 / n * 100;
		System.out.printf("19-35: %.2f%%\n",result);
		result = c * 1.0 / n * 100;
		System.out.printf("36-60: %.2f%%\n",result);
		result = d * 1.0 / n * 100;
		System.out.printf("60??: %.2f%%\n",result);
		return 0;
	}


}

