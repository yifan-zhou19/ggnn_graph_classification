package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] s = new int[4];
		int age;
		double[] sj = new double[4];
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
			if (age < 19)
			{
				s[0]++;
			}
			if (age > 18 && age < 36)
			{
				s[1]++;
			}
			if (age > 35 && age < 61)
			{
				s[2]++;
			}
			if (age > 60)
			{
				s[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			sj[i] = 100.000 * s[i] / n;
		}
		System.out.printf("1-18: %.2lf%%",sj[0]);
		System.out.printf("\n19-35: %.2lf%%",sj[1]);
		System.out.printf("\n36-60: %.2lf%%",sj[2]);
		System.out.printf("\n60??: %.2lf%%",sj[3]);
	}


}

