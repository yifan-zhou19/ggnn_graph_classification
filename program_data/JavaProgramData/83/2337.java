package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] xuefen = new int[10];
		int[] score = new int[10];
		int i;
		double[] gpa = new double[10];
		double sum = 0;
		double sumxf = 0;
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (score[i] >= 90)
			{
				gpa[i] = 4.0;
			}
			else if (score[i] <= 89 && score[i] >= 85)
			{
				gpa[i] = 3.7;
			}
			else if (score[i] <= 84 && score[i] >= 82)
			{
				gpa[i] = 3.3;
			}
			else if (score[i] <= 81 && score[i] >= 78)
			{
				gpa[i] = 3.0;
			}
			else if (score[i] <= 77 && score[i] >= 75)
			{
				gpa[i] = 2.7;
			}
			else if (score[i] <= 74 && score[i] >= 72)
			{
				gpa[i] = 2.3;
			}
			else if (score[i] <= 71 && score[i] >= 68)
			{
				gpa[i] = 2.0;
			}
			else if (score[i] <= 67 && score[i] >= 64)
			{
				gpa[i] = 1.5;
			}
			else if (score[i] <= 63 && score[i] >= 60)
			{
				gpa[i] = 1.0;
			}
			else if (score[i] < 60)
			{
				gpa[i] = 0;
			}
			sum += gpa[i] * xuefen[i];
			sumxf += xuefen[i];
		}
		System.out.printf("%.2lf\n",sum / sumxf);
	}
}

