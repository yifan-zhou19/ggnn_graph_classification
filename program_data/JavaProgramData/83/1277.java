package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m = 0;
		int score;
		float sum = 0F;
		float[][] a = new float[2][9];
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[0][i]) = Float.parseFloat(tempVar2);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score = Integer.parseInt(tempVar3);
			}
			if (score >= 90)
			{
				a[1][i] = 4.0F;
			}
			else if (score >= 85)
			{
				a[1][i] = 3.7F;
			}
			else if (score >= 82)
			{
				a[1][i] = 3.3F;
			}
			else if (score >= 78)
			{
				a[1][i] = 3.0F;
			}
			else if (score >= 75)
			{
				a[1][i] = 2.7F;
			}
			else if (score >= 72)
			{
				a[1][i] = 2.3F;
			}
			else if (score >= 68)
			{
				a[1][i] = 2.0F;
			}
			else if (score >= 64)
			{
				a[1][i] = 1.5F;
			}
			else if (score >= 60)
			{
				a[1][i] = 1.0F;
			}
			else
			{
				a[1][i] = 0F;
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			sum = a[0][i] * a[1][i] + sum;
			m = m + a[0][i];
		}
		GPA = sum / m;
		System.out.printf("%.2f\n",GPA);
	}
}

