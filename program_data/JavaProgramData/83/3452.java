package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum1 = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int['n'];
		int[] score = new int['n'];
		float[] b = new float['n'];
		float sum2 = 0F;
		float GPA;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			sum1 = sum1 + a[i];
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(score[j]) = Integer.parseInt(tempVar3);
			}
			if (((score[j]) <= 100) && ((score[j]) >= 90))
			{
				b[j] = 4.0F;
			}
			else if (((score[j]) <= 89) && ((score[j]) >= 85))
			{
				b[j] = 3.7F;
			}
			else if (((score[j]) <= 84) && ((score[j]) >= 82))
			{
				b[j] = 3.3F;
			}
			else if (((score[j]) <= 81) && ((score[j]) >= 78))
			{
				b[j] = 3.0F;
			}
			else if (((score[j]) <= 77) && ((score[j]) >= 75))
			{
				b[j] = 2.7F;
			}
			else if (((score[j]) <= 74) && ((score[j]) >= 72))
			{
				b[j] = 2.3F;
			}
			else if (((score[j]) <= 71) && ((score[j]) >= 68))
			{
				b[j] = 2.0F;
			}
			else if (((score[j]) <= 67) && ((score[j]) >= 64))
			{
				b[j] = 1.5F;
			}
			else if (((score[j]) <= 63) && ((score[j]) >= 60))
			{
				b[j] = 1.0F;
			}
			else
			{
				b[j] = 0F;
			}
		}
		for (k = 0;k < n;k++)
		{
			sum2 = sum2 + (a[k]) * (b[k]);
		}
		GPA = (float)sum2 / sum1;
		System.out.printf("%.2f",GPA);


		return 0;
	}

}

