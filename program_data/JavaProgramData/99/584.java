package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] age = new int[100];
		float aa;
		float bb;
		float cc;
		float dd;
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
			if (age[i] <= 18)
			{
				a = a + 1;
			}
		if (age[i] >= 19 && age[i] <= 35)
		{
				b = b + 1;
		}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c = c + 1;
			}
			if (age[i] > 60)
			{
				d = d + 1;
			}
		}
		aa = (float)a / n;
		bb = (float)b / n;
		cc = (float)c / n;
		dd = (float)d / n;
		System.out.printf("1-18: %.2f%%\n",100 * aa);
		System.out.printf("19-35: %.2f%%\n",100 * bb);
		System.out.printf("36-60: %.2f%%\n",100 * cc);
		System.out.printf("60??: %.2f%%",100 * dd);
		return 0;
	}

}

