package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] point = new int[11];
		int[] score = new int[11];
		float[] GPA = new float[11];
		float tol = 0F;
		float sum = 0F;
		float result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i] = Integer.parseInt(tempVar2);
			}

			sum = sum + point[i];
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
			if (score[i] >= 90)
			{
				GPA[i] = 4.0F;
			}
			else if (score[i] >= 85)
			{
				GPA[i] = 3.7F;
			}
			else if (score[i] >= 82)
			{
				GPA[i] = 3.3F;
			}
			else if (score[i] >= 78)
			{
				GPA[i] = 3.0F;
			}
			else if (score[i] >= 75)
			{
				GPA[i] = 2.7F;
			}
			else if (score[i] >= 72)
			{
				GPA[i] = 2.3F;
			}
			else if (score[i] >= 68)
			{
				GPA[i] = 2.0F;
			}
			else if (score[i] >= 64)
			{
				GPA[i] = 1.5F;
			}
			else if (score[i] >= 60)
			{
				GPA[i] = 1.0F;
			}
			else
			{
				GPA[i] = 0F;
			}
			tol = tol + GPA[i] * point[i];
		}




		result = tol / sum;
		System.out.printf("%.2f",result);
		return 0;
	}
}

