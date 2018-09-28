package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[120];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a1_18;
		double a19_35;
		double a36_60;
		double a60_;
		a1_18 = 0;
		a19_35 = 0;
		a36_60 = 0;
		a60_ = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] >= 1 && age[i] <= 18)
			{
				a1_18++;
			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				a19_35++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				a36_60++;
			}
			if (age[i] > 60)
			{
				a60_++;
			}
		}
		a1_18 /= (n * 0.01);
		a19_35 /= (n * 0.01);
		a36_60 /= (n * 0.01);
		a60_ /= (n * 0.01);
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n",a1_18,a19_35,a36_60,a60_);
		return 0;
	}
}

