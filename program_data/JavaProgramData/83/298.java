package <missing>;

public class GlobalMembers
{
	public static float mark(int a)
	{
		if (a >= 90 && a <= 100)
		{
			return (4.0)F;
		}
		else if (a >= 85 && a <= 89)
		{
			return (3.7)F;
		}
		else if (a >= 82 && a <= 84)
		{
			return (3.3)F;
		}
		else if (a >= 78 && a <= 81)
		{
			return (3.0)F;
		}
		else if (a >= 75 && a <= 77)
		{
			return (2.7)F;
		}
		else if (a >= 72 && a <= 74)
		{
			return (2.3)F;
		}
		else if (a >= 68 && a <= 71)
		{
			return (2.0)F;
		}
		else if (a >= 64 && a <= 67)
		{
			return (1.5)F;
		}
		else if (a >= 60 && a <= 63)
		{
			return (1.0)F;
		}
		else if (a <= 59)
		{
			return (0)F;
		}
	}
	public static int Main()
	{
		int n;
		int[] all = new int[10];
		int[] score = new int[10];
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				all[i] = Integer.parseInt(tempVar2);
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
		float[] grade = new float[10];
		for (i = 0;i < n;i++)
		{
			grade[i] = mark(score[i]);
		}
		float sum1;
		float sum2;
		for (sum1 = 0F,i = 0;i < n;i++)
		{
			sum1 += grade[i] * all[i];
		}
		for (sum2 = 0F,i = 0;i < n;i++)
		{
			sum2 += all[i];
		}
		GPA = sum1 / sum2;
		System.out.printf("%.2f",GPA);
		return (0);
	}
}

