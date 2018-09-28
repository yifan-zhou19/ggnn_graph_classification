package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int numberOfCourse;
		int i;
		int j;
		int sumOfCredits = 0;
		float sum = 0.0F;
		float average;
		float grade;
		int[] credits = new int[11];
		int[] grades = new int[11];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			numberOfCourse = Integer.parseInt(tempVar);
		}

		for (i = 0;i < numberOfCourse;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				credits[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < numberOfCourse;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grades[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < numberOfCourse;i++)
		{
			if ((grades[i] >= 90) && (grades[i] <= 100))
			{
				grade = 4F;
			}
			else if ((grades[i] >= 85) && (grades[i] <= 89))
			{
				grade = 3.7F;
			}
			else if ((grades[i] >= 82) && (grades[i] <= 84))
			{
				 grade = 3.3F;
			}
			else if ((grades[i] >= 78) && (grades[i] <= 81))
			{
				grade = 3.0F;
			}
			else if ((grades[i] >= 75) && (grades[i] <= 77))
			{
				grade = 2.7F;
			}
			else if ((grades[i] >= 72) && (grades[i] <= 74))
			{
				grade = 2.3F;
			}
			else if ((grades[i] >= 68) && (grades[i] <= 71))
			{
				grade = 2.0F;
			}
			else if ((grades[i] >= 64) && (grades[i] <= 67))
			{
				grade = 1.5F;
			}
			else if ((grades[i] >= 60) && (grades[i] <= 63))
			{
				grade = 1.0F;
			}
			else if ((grades[i] >= 0) && (grades[i] <= 59))
			{
				grade = 0F;
			}

			sumOfCredits += credits[i];
			sum += credits[i] * grade;
		}
		System.out.printf("%.2f",sum / sumOfCredits);
		return 0;

	}
}

