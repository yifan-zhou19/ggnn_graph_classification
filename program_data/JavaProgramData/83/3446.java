package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int grade;
		double gpa;
		double sum1;
		double sum2;
		double GPA;
		sum1 = 0;
		sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			sum2 = sum2 + sz[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grade = Integer.parseInt(tempVar3);
			}
		if (grade >= 90)
		{
			   gpa = 4.0;
		}
		if ((grade >= 85) && (grade <= 89))
		{
			   gpa = 3.7;
		}
		if ((grade >= 82) && (grade <= 84))
		{
			   gpa = 3.3;
		}
		if ((grade >= 78) && (grade <= 81))
		{
			   gpa = 3.0;
		}
		if ((grade >= 75) && (grade <= 77))
		{
			   gpa = 2.7;
		}
		if ((grade >= 72) && (grade <= 74))
		{
			   gpa = 2.3;
		}
		if ((grade >= 68) && (grade <= 71))
		{
			   gpa = 2.0;
		}
		if ((grade >= 64) && (grade <= 67))
		{
			   gpa = 1.5;
		}
		if ((grade >= 60) && (grade <= 63))
		{
			   gpa = 1.0;
		}
		if (grade < 60)
		{
			   gpa = 0;
		}
		sum1 = sum1 + gpa * sz[i];
		}
		GPA = sum1 / sum2;
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

