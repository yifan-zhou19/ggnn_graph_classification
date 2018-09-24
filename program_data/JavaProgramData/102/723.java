package <missing>;

public class GlobalMembers
{
	public static double[] male = new double[42];
	public static double[] female = new double[42];
	public static int m = 0;
	public static int f = 0;
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String temp = new String(new char[10]);
			double templen;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				templen = Double.parseDouble(tempVar3);
			}
			if (temp.charAt(0) == 'm')
			{
				male[m] = templen;
				m++;
			}
			else
			{
				female[f] = templen;
				f++;
			}
		}
		sort(male,male + m);
		sort(female,female + f);
		reverse(female,female + f);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < f - 1;i++)
		{
			System.out.printf("%.2lf ",female[i]);
		}
		System.out.printf("%.2lf\n",female[i]);
		return 0;
	}
}

