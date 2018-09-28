package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float gpa;
		float[] score = new float[10];
		float[] g = new float[10];
		float[] pow = new float[10];
		float sg;
		float ave;
		float s;
		s = 0F;
		ave = 0F;
		sg = 0F;
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
				pow[i] = Float.parseFloat(tempVar2);
			}
			s = s + pow[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Float.parseFloat(tempVar3);
			}
			if (score[i] <= 100.0F && score[i] >= 90.0F)
			{
				g[i] = 4.0F;
			}
			else if (score[i] <= 89.0F && score[i] >= 85.0F)
			{
				g[i] = 3.7F;
			}
			else if (score[i] <= 84.0F && score[i] >= 82.0F)
			{
				g[i] = 3.3F;
			}
			else if (score[i] <= 81.0F && score[i] >= 78.0F)
			{
				g[i] = 3.0F;
			}
			else if (score[i] <= 77.0F && score[i] >= 75.0F)
			{
				g[i] = 2.7F;
			}
			else if (score[i] <= 74.0F && score[i] >= 72.0F)
			{
				g[i] = 2.3F;
			}
			else if (score[i] <= 71.0F && score[i] >= 68.0F)
			{
				g[i] = 2.0F;
			}
			else if (score[i] <= 67.0F && score[i] >= 64.0F)
			{
				g[i] = 1.5F;
			}
			else if (score[i] <= 63.0F && score[i] >= 60.0F)
			{
				g[i] = 1.0F;
			}
			else
			{
				g[i] = 0F;
			}
			sg = sg + g[i] * pow[i];
		}
		gpa = sg / s;
		System.out.printf("\n%.2f",gpa);
		return 0;
	}
}

