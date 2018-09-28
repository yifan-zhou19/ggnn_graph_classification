package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float xuefen = int;
		int n;
		float GPA = 0F;
		int total_grade = 0;
		int[] mark = new int[10];
		int[] grade = new int[10];
		float[] mark_gra = new float[10];
		int i;

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
				grade[i] = Integer.parseInt(tempVar2);
			}
			total_grade = total_grade + grade[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mark[i] = Integer.parseInt(tempVar3);
			}
			mark_gra[i] = xuefen(mark[i]);
		}


		for (i = 0;i < n;i++)
		{
			GPA = GPA + mark_gra[i] * grade[i];
		}

		GPA = GPA / total_grade;
		System.out.printf("%.2f\n",GPA);
	}


	public static float xuefen(int x)
	{
		float f_x = 0F;
		if (x >= 90)
		{
			f_x = 4.0F;
		}
		if (x >= 85 && x <= 89)
		{
			f_x = 3.7F;
		}
		if (x >= 82 && x <= 84)
		{
			f_x = 3.3F;
		}
		if (x >= 78 && x <= 81)
		{
			f_x = 3.0F;
		}
		if (x >= 75 && x <= 77)
		{
			f_x = 2.7F;
		}
		if (x >= 72 && x <= 74)
		{
			f_x = 2.3F;
		}
		if (x >= 68 && x <= 71)
		{
			f_x = 2.0F;
		}
		if (x >= 64 && x <= 67)
		{
			f_x = 1.5F;
		}
		if (x >= 60 && x <= 63)
		{
			f_x = 1.0F;
		}
		if (x < 60)
		{
			f_x = 0F;
		}
		return f_x;
	}

}

