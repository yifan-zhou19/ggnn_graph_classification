package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int total = 0;
		int[] score = new int[10];
		int[] mark = new int[10];
		float gpa;
		float avg = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			score[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total += score[i];
		}
		for (i = 0;i < n;i++)
		{
			mark[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int temp = mark[i];
			if (temp <= 100 && temp >= 90)
			{
				gpa = 4.0F;
			}
			else if (temp < 90 && temp>84)
			{
				gpa = 3.7F;
			}
			else if (temp < 85 && temp>81)
			{
				gpa = 3.3F;
			}
			else if (temp < 82 && temp>77)
			{
				gpa = 3.0F;
			}
			else if (temp <= 77 && temp>74)
			{
				gpa = 2.7F;
			}
			else if (temp <= 74 && temp>71)
			{
				gpa = 2.3F;
			}
			else if (temp <= 71 && temp>67)
			{
				gpa = 2.0F;
			}
			else if (temp <= 67 && temp>63)
			{
				gpa = 1.5F;
			}
			else if (temp <= 63 && temp>59)
			{
				gpa = 1.0F;
			}
			else if (temp < 60)
			{
				gpa = 0.0F;
			}
			avg += gpa * score[i];
		}
		avg /= total;
		System.out.printf("%.2f\n",avg);
		//cout<<avg<<endl;
		return 0;
	}
}

