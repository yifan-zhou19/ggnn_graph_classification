package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] xuefen = new int[100];
		int[] grade = new int[100];
		float[] GPA = new float[100];
		float a = 0F;
		float sum = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;++i)
		{
			xuefen[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;++i)
		{
			grade[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (grade[i] >= 90 && grade[i] <= 100)
			{
			GPA[i] = 4.0F;
			}
			else if (grade[i] >= 85 && grade[i] <= 89)
			{
			GPA[i] = 3.7F;
			}
			else if (grade[i] >= 82 && grade[i] <= 84)
			{
			GPA[i] = 3.3F;
			}
			else if (grade[i] >= 78 && grade[i] <= 81)
			{
			GPA[i] = 3.0F;
			}
			else if (grade[i] >= 75 && grade[i] <= 77)
			{
			GPA[i] = 2.7F;
			}
			else if (grade[i] >= 72 && grade[i] <= 74)
			{
			GPA[i] = 2.3F;
			}
			else if (grade[i] >= 68 && grade[i] <= 71)
			{
			GPA[i] = 2.0F;
			}
			else if (grade[i] >= 64 && grade[i] <= 67)
			{
			GPA[i] = 1.5F;
			}
			else if (grade[i] >= 60 && grade[i] <= 63)
			{
			GPA[i] = 1.0F;
			}
			else
			{
				GPA[i] = 0F;
			}
		}
		for (i = 0;i < n;++i)
		{
			   sum += xuefen[i] * GPA[i];
			   a += xuefen[i];
		}
		System.out.printf("%.2f",sum / a);
		 return 0;
	}
}

