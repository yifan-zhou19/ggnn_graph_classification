package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int input;
		int[] r = new int[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 4; i++)
		{
			r[i] = 0;
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = Integer.parseInt(tempVar2);
			}
			if (input < 19)
			{
				r[0]++;
			}
			if (input > 18 && input < 36)
			{
				r[1]++;
			}
			if (input > 35 && input < 61)
			{
				r[2]++;
			}
			if (input > 60)
			{
				r[3]++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n", r[0] * 100.0 / n);
		System.out.printf("19-35: %.2lf%%\n", r[1] * 100.0 / n);
		System.out.printf("36-60: %.2lf%%\n", r[2] * 100.0 / n);
		System.out.printf("60??: %.2lf%%\n", r[3] * 100.0 / n);
		return 0;
	}
}

