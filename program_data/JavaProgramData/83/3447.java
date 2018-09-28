package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int df;
		float jd;
		float sum1 = 0F;
		float sum2 = 0F;
		float gpa;
		int[] xf = new int[10];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}

		for (int i = 0;i <= (n - 1);i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df = Integer.parseInt(tempVar3);
			}
			if (df >= 90)
			{
				jd = 4.0F;
			}
			if (df >= 85 && df <= 89)
			{
				jd = 3.7F;
			}
			if (df >= 82 && df <= 84)
			{
				jd = 3.3F;
			}
			if (df >= 82 && df <= 84)
			{
				jd = 3.3F;
			}
			if (df >= 78 && df <= 81)
			{
				jd = 3.0F;
			}
			if (df >= 75 && df <= 77)
			{
				jd = 2.7F;
			}
			if (df >= 72 && df <= 74)
			{
				jd = 2.3F;
			}
			if (df >= 68 && df <= 71)
			{
				jd = 2.0F;
			}
			if (df >= 64 && df <= 67)
			{
				jd = 1.5F;
			}
			if (df >= 60 && df <= 63)
			{
				jd = 1.0F;
			}
			if (df < 60)
			{
				jd = 0F;
			}
			sum1 = sum1 + jd * xf[i];
		}
		for (int i = 0;i <= (n - 1);i++)
		{
			sum2 += xf[i];
		}
		gpa = sum1 / sum2;
		System.out.printf("%.2f",gpa);

		return 0;
	}
}

