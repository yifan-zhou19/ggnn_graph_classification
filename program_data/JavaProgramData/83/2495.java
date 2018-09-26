package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[10];
		int[] cj = new int[10];
		int i;
		int sum = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
			sum += xf[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
		}
		double gpa = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (cj[i] >= 90 && cj[i] <= 100)
			{
				gpa += 4.0 * xf[i];
			}
			else if (cj[i] >= 85 && cj[i] <= 89)
			{
				gpa += 3.7 * xf[i];
			}
			else if (cj[i] >= 82 && cj[i] <= 84)
			{
				gpa += 3.3 * xf[i];
			}
			else if (cj[i] >= 78 && cj[i] <= 81)
			{
				gpa += 3.0 * xf[i];
			}
			else if (cj[i] >= 75 && cj[i] <= 77)
			{
				gpa += 2.7 * xf[i];
			}
			else if (cj[i] >= 72 && cj[i] <= 74)
			{
				gpa += 2.3 * xf[i];
			}
			else if (cj[i] >= 68 && cj[i] <= 71)
			{
				gpa += 2.0 * xf[i];
			}
			else if (cj[i] >= 64 && cj[i] <= 67)
			{
				gpa += 1.5 * xf[i];
			}
			else if (cj[i] >= 60 && cj[i] <= 63)
			{
				gpa += 1.0 * xf[i];
			}
		}
		System.out.printf("%.2lf",gpa / sum);
		return 0;
	}
}

