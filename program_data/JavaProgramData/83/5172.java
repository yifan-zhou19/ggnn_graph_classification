package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int[] xf = new int[10];
		int[] df = new int[10];
		double GPA;
		double result;
		double s = 0;
		double num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xf[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i <= k - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			df[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i <= k - 1;i++)
		{
			if (90 <= df[i] != 0 && df[i] <= 100)
			{
				result = 4.0 * xf[i];
			}
			if (85 <= df[i] != 0 && df[i] <= 89)
			{
				result = 3.7 * xf[i];
			}
			if (82 <= df[i] != 0 && df[i] <= 84)
			{
				result = 3.3 * xf[i];
			}
			if (78 <= df[i] != 0 && df[i] <= 81)
			{
				result = 3.0 * xf[i];
			}
			if (75 <= df[i] != 0 && df[i] <= 77)
			{
				result = 2.7 * xf[i];
			}
			if (72 <= df[i] != 0 && df[i] <= 74)
			{
				result = 2.3 * xf[i];
			}
			if (68 <= df[i] != 0 && df[i] <= 71)
			{
				result = 2.0 * xf[i];
			}
			if (64 <= df[i] != 0 && df[i] <= 67)
			{
				result = 1.5 * xf[i];
			}
			if (60 <= df[i] != 0 && df[i] <= 63)
			{
				result = 1.0 * xf[i];
			}
			if (df[i] < 60)
			{
				result = 0;
			}
			num = num + result;
			s = xf[i] + s;
		}

			GPA = num / s;
			System.out.printf("%.2lf",GPA);
			return 0;
	}


}

