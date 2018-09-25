package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] xf = new int[10];
		int[] score = new int[10];
		int a;
		float[] jd = new float[10];
		float[] sjd = new float[10];
		float sum;
		float GPA;
		int i;
		int j;
		sum = 0.0F;
		a = 0;

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
				xf[i] = Integer.parseInt(tempVar2);
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
		for (j = 0;j < n;j++)
		{
			if (score[j] >= 90)
			{
				jd[j] = 4.0F;
			}
			else if (score[j] >= 85)
			{
				jd[j] = 3.7F;
			}
			else if (score[j] >= 82)
			{
				jd[j] = 3.3F;
			}
			else if (score[j] >= 78)
			{
				jd[j] = 3.0F;
			}
			else if (score[j] >= 75)
			{
				jd[j] = 2.7F;
			}
			else if (score[j] >= 72)
			{
				jd[j] = 2.3F;
			}
			else if (score[j] >= 68)
			{
				jd[j] = 2.0F;
			}
			else if (score[j] >= 64)
			{
				jd[j] = 1.5F;
			}
			else if (score[j] >= 60)
			{
				jd[j] = 1.0F;
			}
			else
			{
				jd[j] = 0F;
			}
		}
		for (j = 0;j < n;j++)
		{
			sjd[j] = jd[j] * xf[j];
			sum = sum + sjd[j];
			a = a + xf[j];
		}
		GPA = sum / a;
		System.out.printf("%.2f",GPA);
	}
}

