package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float gpa = int point;
		int[] point = new int[11];
		int[] mark = new int[11];
		float[] gpax = new float[11];
		int i;
		int k;
		int sum;
		float summ;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		sum = 0;
		summ = 0F;
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mark[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + mark[i];
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i] = Integer.parseInt(tempVar3);
			}
			gpax[i] = gpa(point[i]);
			summ = summ + ((float)mark[i]) * (gpax[i]);
		}
		System.out.printf("%.2f\n",summ / sum);
	}

	public static float gpa(int point)
	{
		float gpa;
		if (point < 60)
		{
			gpa = 0F;
		}
		else if (point < 64)
		{
			gpa = 1.0F;
		}
		else if (point < 68)
		{
			gpa = 1.5F;
		}
		else if (point < 72)
		{
			gpa = 2.0F;
		}
		else if (point < 75)
		{
			gpa = 2.3F;
		}
		else if (point < 78)
		{
			gpa = 2.7F;
		}
		else if (point < 82)
		{
			gpa = 3.0F;
		}
		else if (point < 85)
		{
			gpa = 3.3F;
		}
		else if (point < 90)
		{
			gpa = 3.7F;
		}
		else
		{
			gpa = 4.0F;
		}
		return (gpa);
	}
}

