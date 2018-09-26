package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sumpoint;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] grade = new int[N];
		int[] point = new int[N];
		double GPA;
		double[] gradepoint = new double[N];
		double sum;
		sumpoint = 0;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(point[i]) = Integer.parseInt(tempVar2);
			}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(point[i]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(grade[i]) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (grade[i] <= 100 && grade[i] >= 90)
			{
			   gradepoint[i] = 4.0;
			}
			if (grade[i] <= 89 && grade[i] >= 85)
			{
			   gradepoint[i] = 3.7;
			}
			if (grade[i] <= 84 && grade[i] >= 82)
			{
			   gradepoint[i] = 3.3;
			}
			if (grade[i] <= 81 && grade[i] >= 78)
			{
			   gradepoint[i] = 3.0;
			}
			if (grade[i] <= 77 && grade[i] >= 75)
			{
			   gradepoint[i] = 2.7;
			}
			if (grade[i] <= 74 && grade[i] >= 72)
			{
			   gradepoint[i] = 2.3;
			}
			if (grade[i] <= 71 && grade[i] >= 68)
			{
			   gradepoint[i] = 2.0;
			}
			if (grade[i] <= 67 && grade[i] >= 64)
			{
			   gradepoint[i] = 1.5;
			}
			if (grade[i] <= 63 && grade[i] >= 60)
			{
			   gradepoint[i] = 1.0;
			}
			if (grade[i] < 60)
			{
				gradepoint[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			sumpoint += point[i];
			sum += gradepoint[i] * point[i];
		}
		GPA = sum / sumpoint;
		System.out.printf("%.2lf",GPA);
		return 0;
	}

}

