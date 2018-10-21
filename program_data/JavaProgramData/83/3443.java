package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] xf = new int[10];
		int[] df = new int[10];
		int i;
		float s;
		float GPA;
		s = 0F;
		a = 0;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (90 <= df[i])
			{
				s += 4.0 * xf[i];
			}
			else if (85 <= df[i] != 0 && df[i] <= 89)
			{
				s += 3.7 * xf[i];
			}
			else if (82 <= df[i] != 0 && df[i] <= 84)
			{
				s += 3.3 * xf[i];
			}
			else if (78 <= df[i] != 0 && df[i] <= 81)
			{
				s += 3.0 * xf[i];
			}
			else if (75 <= df[i] != 0 && df[i] <= 77)
			{
				s += 2.7 * xf[i];
			}
			else if (72 <= df[i] != 0 && df[i] <= 74)
			{
				s += 2.3 * xf[i];
			}
			else if (68 <= df[i] != 0 && df[i] <= 71)
			{
				s += 2.0 * xf[i];
			}
			else if (64 <= df[i] != 0 && df[i] <= 67)
			{
				s += 1.5 * xf[i];
			}
			else if (60 <= df[i] != 0 && df[i] <= 63)
			{
				s += 1.0 * xf[i];
			}
			else if (df[i] <= 60)
			{
				s += 0 * xf[i];
			}
			a += xf[i];
		}
		GPA = s / a;
		System.out.printf("%.2f",GPA);


		return 0;
	}
}

