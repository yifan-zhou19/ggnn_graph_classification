package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int GPA;
		int[] point = new int[11];
		int[] grade = new int[11];
		int pointsum = 0;
		float[] gpa = new float[11];
		float gradesum = 0.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 1;j <= n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grade[j] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{

				if (grade[k] <= 100 && grade[k] >= 90)
				{
					gpa[k] = 4.0F;
				}
				else if (grade[k] <= 89 && grade[k] >= 85)
				{
					gpa[k] = 3.7F;
				}
				else if (grade[k] <= 84 && grade[k] >= 82)
				{
					gpa[k] = 3.3F;
				}
				else if (grade[k] <= 81 && grade[k] >= 78)
				{
					gpa[k] = 3.0F;
				}
				else if (grade[k] <= 77 && grade[k] >= 75)
				{
					gpa[k] = 2.7F;
				}
				else if (grade[k] <= 74 && grade[k] >= 72)
				{
					gpa[k] = 2.3F;
				}
				else if (grade[k] <= 71 && grade[k] >= 68)
				{
					gpa[k] = 2.0F;
				}
				else if (grade[k] <= 67 && grade[k] >= 64)
				{
					gpa[k] = 1.5F;
				}
				else if (grade[k] <= 63 && grade[k] >= 60)
				{
					gpa[k] = 1.0F;
				}
				else if (grade[k] <= 59 && grade[k] >= 0)
				{
					gpa[k] = 0.0F;
				}
				else
				{
					System.out.print("your input is wrong");
				}
			gradesum += gpa[k] * point[k];
			pointsum += point[k];


		}





		System.out.printf("%.2f",gradesum / pointsum);
		return 0;
	}

}

