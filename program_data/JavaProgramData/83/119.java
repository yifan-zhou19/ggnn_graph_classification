package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] hr = new int[10];
		int[] scr = new int[10];
		double s = 0;
		double GPA;
		double[] sc = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int shr = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hr[i] = Integer.parseInt(tempVar2);
			}
			shr += hr[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				scr[i] = Integer.parseInt(tempVar3);
			}
			int x = scr[i];
			if (x >= 90 && x <= 100)
			{
				sc[i] = 4.0;
			}
			if (x >= 85 && x <= 89)
			{
				sc[i] = 3.7;
			}
			if (x >= 82 && x <= 84)
			{
				sc[i] = 3.3;
			}
			if (x >= 78 && x <= 81)
			{
				sc[i] = 3.0;
			}
			if (x >= 75 && x <= 77)
			{
				sc[i] = 2.7;
			}
			if (x >= 72 && x <= 74)
			{
				sc[i] = 2.3;
			}
			if (x >= 68 && x <= 71)
			{
				sc[i] = 2.0;
			}
			if (x >= 64 && x <= 67)
			{
				sc[i] = 1.5;
			}
			if (x >= 60 && x <= 63)
			{
				sc[i] = 1.0;
			}
			if (x < 60)
			{
				sc[i] = 0;
			}
			s += sc[i] * hr[i];
		}
		GPA = s / shr;
		System.out.printf("%.2f\n",GPA);
		return 0;
	}
}

