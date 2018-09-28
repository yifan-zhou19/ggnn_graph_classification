package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] point = new int[11];
		int[] score = new int[11];
		int i;
		int j;
		int k;
		int l;
		int p = 0;
		float[] gpa = new float[11];
		float g = 0.0F;
		float pa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= n;j++)
		{
			p = p + point[j];
		}
		for (k = 1;k <= n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[k] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{

			if (90 <= score[k],score[k] <= 100)
			{
				gpa[k] = 4.0F;
			}
			if (85 <= score[k],score[k] <= 89)
			{
				gpa[k] = 3.7F;
			}
			if (82 <= score[k],score[k] <= 84)
			{
				gpa[k] = 3.3F;
			}
			if (78 <= score[k],score[k] <= 81)
			{
				gpa[k] = 3.0F;
			}
			if (75 <= score[k],score[k] <= 77)
			{
				gpa[k] = 2.7F;
			}
			if (72 <= score[k],score[k] <= 74)
			{
				gpa[k] = 2.3F;
			}
			if (68 <= score[k],score[k] <= 71)
			{
				gpa[k] = 2.0F;
			}
			if (64 <= score[k],score[k] <= 67)
			{
				gpa[k] = 1.5F;
			}
			if (60 <= score[k],score[k] <= 63)
			{
				gpa[k] = 1.0F;
			}
			if (score[k] < 60)
			{
				gpa[k] = 0.0F;
			}
		}
		for (l = 1;l <= n;l++)
		{
			g = g + (point[l] * gpa[l]);
		}
		pa = g / p;
		System.out.printf("%.2f",pa);
	}
}

