package <missing>;

public class GlobalMembers
{
	public static float GPA(int n)
	{
		int i;
		float result;
		float[] gpa = new float[10];
		float[] gpa_1 = new float[10];
		float sumxf = 0F;
		float sumcj = 0F;
		int[] chengji = new int[10];
		int[] xuefen = new int[10];
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				xuefen[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				chengji[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (90 <= chengji[i] != 0 && chengji[i] <= 100)
			{
				gpa[i] = 4.0F;
			}
			else if (85 <= chengji[i] != 0 && chengji[i] <= 89)
			{
				gpa[i] = 3.7F;
			}
			else if (82 <= chengji[i] != 0 && chengji[i] <= 84)
			{
				gpa[i] = 3.3F;
			}
			else if (78 <= chengji[i] != 0 && chengji[i] <= 81)
			{
				gpa[i] = 3.0F;
			}
			else if (75 <= chengji[i] != 0 && chengji[i] <= 77)
			{
				gpa[i] = 2.7F;
			}
			else if (72 <= chengji[i] != 0 && chengji[i] <= 74)
			{
				gpa[i] = 2.3F;
			}
			else if (68 <= chengji[i] != 0 && chengji[i] <= 71)
			{
				gpa[i] = 2.0F;
			}
			else if (64 <= chengji[i] != 0 && chengji[i] <= 67)
			{
				gpa[i] = 1.5F;
			}
			else if (60 <= chengji[i] != 0 && chengji[i] <= 63)
			{
				gpa[i] = 1.0F;
			}
			else
			{
				gpa[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
		gpa_1[i] = gpa[i] * xuefen[i];
		sumcj += gpa_1[i];
		sumxf += xuefen[i];
		}
		result = sumcj / sumxf;
		return result;
	}
	public static void Main()
	{
		int n;
		float gpa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		gpa = GPA(n);
		System.out.printf("%.2f",gpa);
	}

}

