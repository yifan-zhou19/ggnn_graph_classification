package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int malecnt = 0;
	public static int femalecnt = 0;
	public static double[] male = new double[50];
	public static double[] female = new double[50];

	public static int Main()
	{
		freopen("input.txt", "r", stdin);
		freopen("output.txt", "w", stdout);
		int i = 0;
		String s = new String(new char[10]);
		double temp = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				temp = Double.parseDouble(tempVar3);
			}
			if (strcmp(s, "male") == 0)
			{
				male[malecnt++] = temp;
			}
			else
			{
				female[femalecnt++] = temp;
			}
		}

		sort(male, male + malecnt);
		sort(female, female + femalecnt);

		for (i = 0; i < malecnt; i++)
		{
			System.out.printf("%.2lf ", male[i]);
		}

		for (i = femalecnt - 1; i >= 1; i--)
		{
			System.out.printf("%.2lf ", female[i]);
		}
		System.out.printf("%.2lf\n", female[0]);
		return 0;
	}
}

