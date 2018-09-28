package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int r = 0;
		int a = 0;
		int t = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] year = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (year[i] >= 1 && year[i] <= 18)
			{
				r++;
			}
			else if (year[i] >= 19 && year[i] <= 35)
			{
				a++;
			}
			else if (year[i] >= 36 && year[i] <= 60)
			{
				t++;
			}
			else
			{
				e++;
			}
		}
		double rn = 1.0 * r / m * 100;
		double an = 1.0 * a / m * 100;
		double tn = 1.0 * t / m * 100;
		double en = 1.0 * e / m * 100;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\nOver60: %.2lf%\n",rn,an,tn,en);
		return 0;
	}

}

