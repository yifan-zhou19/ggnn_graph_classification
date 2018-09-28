package <missing>;

public class GlobalMembers
{
	public static float pnt(float scr)
	{
		if (scr > 89F)
		{
			return 4.0F;
		}
		else if (scr > 84F)
		{
			return 3.7F;
		}
		else if (scr > 81F)
		{
			return 3.3F;
		}
		else if (scr > 77F)
		{
			return 3.0F;
		}
		else if (scr > 74F)
		{
			return 2.7F;
		}
		else if (scr > 71F)
		{
			return 2.3F;
		}
		else if (scr > 67F)
		{
			return 2.0F;
		}
		else if (scr > 63F)
		{
			return 1.5F;
		}
		else if (scr > 59F)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		float gpa = 0F;
		float sum = 0F;
		float[] score = new float[10];
		float[] credit = new float[10];

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
				credit[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Float.parseFloat(tempVar3);
			}
			gpa += pnt(score[i]) * credit[i];
			sum += credit[i];
		}

		gpa /= sum;

		System.out.printf("%.2f",gpa);

		return 0;
	}
}

