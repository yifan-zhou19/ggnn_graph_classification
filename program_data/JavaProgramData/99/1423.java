package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int j;
		double[] b = new double[4];
		double[] c = new double[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b[0] = b[1] = b[2] = b[3] = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] <= 18)
			{
				b[0]++;
			}
			if (age[i] <= 35 && age[i] >= 19)
			{
				b[1]++;
			}
			if (age[i] <= 60 && age[i] >= 36)
			{
				b[2]++;
			}
			if (age[i] >= 61)
			{
				b[3]++;
			}
		}
		for (j = 0;j < 4;j++)
		{
			c[j] = 100.0 * b[j] / n;
		}
		System.out.printf("1-18: %.2lf%%\n", c[0]);
		System.out.printf("19-35: %.2lf%%\n", c[1]);
		System.out.printf("36-60: %.2lf%%\n", c[2]);
		System.out.printf("60??: %.2lf%%\n", c[3]);
		return 0;
	}
}

