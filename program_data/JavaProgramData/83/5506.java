package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] point = new int[n];
		int[] score = new int[n];
		double[] grade = new double[n];
		double[] gpa = new double[n];
		double average;
		double total;
		double sum;
		total = 0;
		sum = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}

		}
		for (i = 1;i <= n;i++)
		{
			if (score[i] >= 90)
			{
				grade[i] = 4.0;
			}
			else if (score[i] >= 85)
			{
				grade[i] = 3.7;
			}
			else if (score[i] >= 82)
			{
				grade[i] = 3.3;
			}
			else if (score[i] >= 78)
			{
				grade[i] = 3.0;
			}
			else if (score[i] >= 75)
			{
				grade[i] = 2.7;
			}
			else if (score[i] >= 72)
			{
				grade[i] = 2.3;
			}
			else if (score[i] >= 68)
			{
				grade[i] = 2.0;
			}
			else if (score[i] >= 64)
			{
				grade[i] = 1.5;
			}
			else if (score[i] >= 60)
			{
				grade[i] = 1.0;
			}
			else
			{
				grade[i] = 0;
			}
			gpa[i] = grade[i] * point[i];
		}
		for (i = 1;i <= n;i++)
		{
			total += gpa[i];
			sum += point[i];
		}
		average = total / sum;
		System.out.printf("%.2lf",average);
		return 0;
	}

}

