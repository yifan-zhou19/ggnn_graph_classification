package <missing>;

public class GlobalMembers
{
	/*?????????????????????GPA?????????????????????????????????*/



	public static float gradetogpa(int grade) //?????
	{
		float gpa;
		if (grade <= 100 && grade >= 90)
		{
			gpa = 4.0F;
		}
		if (grade <= 89 && grade >= 85)
		{
			gpa = 3.7F;
		}
		if (grade <= 84 && grade >= 82)
		{
			gpa = 3.3F;
		}
		if (grade <= 81 && grade >= 78)
		{
			gpa = 3.0F;
		}
		if (grade <= 77 && grade >= 75)
		{
			gpa = 2.7F;
		}
		if (grade <= 74 && grade >= 72)
		{
			gpa = 2.3F;
		}
		if (grade <= 71 && grade >= 68)
		{
			gpa = 2.0F;
		}
		if (grade <= 67 && grade >= 64)
		{
			gpa = 1.5F;
		}
		if (grade <= 63 && grade >= 60)
		{
			gpa = 1.0F;
		}
		if (grade < 60)
		{
			gpa = 0.0F;
		}
		return gpa;
	}
	public static int Main()
	{
		float GPA;
		float sumgpa = 0F;
		int n;
		int i;
		int[] a = new int[11];
		int[] b = new int[11];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		for (i = 1;i <= n;i++) //????????
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sumgpa = sumgpa + gradetogpa(b[i]) * a[i];
		}
		GPA = sumgpa / sum;
		System.out.printf("%.2f\n",GPA);
		return 0;
	}

}

