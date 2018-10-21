package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] credit = new int[100];
		int[] score = new int[100];
		float[] point = new float[100];
		int n;
		int i;
		float sum = 0F;
		float sum1 = 0F;
		float average;
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
				credit[i] = Integer.parseInt(tempVar2);
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
		for (i = 0;i < n;i++)
		{
			if (score[i] <= 100 && score[i] >= 90)
			{
				point[i] = 4.0F;
			}
			else if (score[i] <= 89 && score[i] >= 85)
			{
				point[i] = 3.7F;
			}
			else if (score[i] <= 84 && score[i] >= 82)
			{
				point[i] = 3.3F;
			}
			else if (score[i] <= 81 && score[i] >= 78)
			{
				point[i] = 3.0F;
			}
			else if (score[i] <= 77 && score[i] >= 75)
			{
				point[i] = 2.7F;
			}
			else if (score[i] >= 72 && score[i] <= 74)
			{
				point[i] = 2.3F;
			}
			else if (score[i] >= 68 && score[i] <= 71)
			{
				point[i] = 2.0F;
			}
			else if (score[i] >= 64 && score[i] <= 67)
			{
				point[i] = 1.5F;
			}
			else if (score[i] >= 60 && score[i] <= 63)
			{
				point[i] = 1.0F;
			}
			else if (score[i] >= 0 && score[i] <= 59)
			{
				point[i] = 0F;
			}
			else
			{
				System.out.print("error");
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + credit[i] * point[i];
		}
		for (i = 0;i < n;i++)
		{
			sum1 = sum1 + credit[i];
		}
		average = sum / sum1;
		System.out.printf("%.2f",average);
	}
}

